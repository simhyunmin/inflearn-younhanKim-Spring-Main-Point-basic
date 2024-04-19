package study.study1.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import study.study1.AppConfig;
import study.study1.member.Grade;
import study.study1.member.Member;
import study.study1.member.MemberService;

public class OrderServiceTest {
    AppConfig appConfig = new AppConfig();
    MemberService memberService = appConfig.memberService();
    OrderService orderService = appConfig.orderService();

    @Test
    void createOrder(){
        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }
}
