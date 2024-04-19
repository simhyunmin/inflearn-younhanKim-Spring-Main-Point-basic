package study.study1;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import study.study1.discount.DiscountPolicy;
import study.study1.discount.RateDiscountPolicy;
import study.study1.member.MemberRepository;
import study.study1.member.MemberService;
import study.study1.member.MemberServiceImpl;
import study.study1.member.MemoryMemberRepository;
import study.study1.order.OrderService;
import study.study1.order.OrderServiceImpl;

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService(){
        return new MemberServiceImpl(MemberRepository());
    }

    @Bean
    public MemoryMemberRepository MemberRepository(){
        return new MemoryMemberRepository();
    }

    public OrderService orderService(){
        return new OrderServiceImpl(MemberRepository(), discountPolicy());
    }

    @Bean
    public DiscountPolicy discountPolicy(){
        return new RateDiscountPolicy();
    }


}
