package study.study1.member;

public interface MemberRepository {
    //멤버를 저장하는 save 함수
    void save(Member member);
    //회원을 조회할 수 있게 해주는 조회 함수
    Member findById(Long memberId);
}
