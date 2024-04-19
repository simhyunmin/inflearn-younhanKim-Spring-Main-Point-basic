package study.study1.discount;

import study.study1.member.Member;

public interface DiscountPolicy {

    int discount(Member member, int price);
}
