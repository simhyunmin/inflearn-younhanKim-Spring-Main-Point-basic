package study.study1.member;

public class MemberServiceImpl implements  MemberService{
    //여기서 MemberServiceImpl은 MemberRepository를 의존한다고 말할 수 있다.
    private MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    //구현체에 의존하지 않고 추상 인터페이스만으로도 할 수 있는 이유는
    //구현체에 오버라이드된 함수가 있기 때문이다.
    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
