package sungjuk;

public class SungJukDTO {
    private int number;
    private String name;
    private int kor, eng, math, tot;
    private double avg;

    public SungJukDTO(int number, String name, int kor, int eng, int math) {
        this.number = number;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        // this.tot = tot;
        // this.avg = avg;
    }

    public void calc() {
        this.tot = kor + eng + math;
        this.avg = (double) this.tot / 3.0;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getTot() {
        return tot;
    }

    public void setTot(int tot) {
        this.tot = tot;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    @Override
    public String toString() {
        return number + "\t" + name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + tot + "\t" + avg;
    }

}
