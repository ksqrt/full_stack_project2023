package src.abstract_;

public abstract class AbstractTest {
    private String name;

    // 디폴트 생성자
    public AbstractTest() {
    }

    public AbstractTest(String name) {
        super();
        this.name = name;
    }

    // 구현
    public String getName() {
        return this.name;
    }

    // 추상메소드
    public abstract void setName(String name);

    // 추상클래스

}
