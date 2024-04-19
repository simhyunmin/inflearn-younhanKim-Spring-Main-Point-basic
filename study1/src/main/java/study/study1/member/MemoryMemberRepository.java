package study.study1.member;


import java.util.HashMap;
import java.util.Map;

//MemberRepository의 구현체 함수
public class MemoryMemberRepository implements MemberRepository{

    private static Map<Long, Member> store =  new HashMap<>();

    //본격적으로 멤버를 Map 타입 store 변수에 넣는 부분
    @Override
    public void save(Member member) {
        store.put(member.getId(), member);    //sotre는 Long, Member 타입 변수를 받기 때문에 매개변수로
                                              //member.getId() 함수를 통해 Long타입 Id를 그리고 Member 타입인 member를 넘겨주는 모습

    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);           //Id를 통해 회원을 찾아주는 함수 Member가 반환 타입이므로 회원 자체를 넘겨준다.
    }
}
