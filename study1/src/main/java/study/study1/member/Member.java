package study.study1.member;

public class Member {


    //회원이 가지는 정보는 id, name, grade의 세 가지가 있다.
    //private 형으로 선언하는 이유는 외부에서 접근 못하게 하기 위해서
    private Long id;

    private String name;

    private Grade grade;

    //회원의 생성자 부분 매개변수로 id, name, grade를 넘겨 받는다.
    public Member(Long id, String name, Grade grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }
}
