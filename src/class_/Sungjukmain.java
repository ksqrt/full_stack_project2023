package src.class_;

class Sungjuk{
    private String name;
    private int kor,eng,math,tot;
    private double avg;
    private char grade;

    public void setData(String name,int kor,int eng,int math){
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public void calc(){
        tot = kor+eng+math;
        avg = (double)tot/3;
        if(avg>=90){
            this.grade='A';
        }
        else if(avg>=80){
            this.grade='B';
        }
        else if(avg>=70){
            this.grade='C';
        }
        else{
            this.grade='D';
        }
    }
    public String getName(){
        return this.name;
    }
    public int getKor(){
        return this.kor;
    }
    public int getMath(){
        return this.math;
    }
    public int getEng(){
        return this.eng;
    }
    public double getavg(){
        return this.avg;
    }
    public double getgrade(){
        return this.grade;
    }
}

public class Sungjukmain {
    public static void main(String[] args) {
        Sungjuk aa = new Sungjuk();
        aa.setData("성욱", 70, 80, 90);
        aa.calc(); // 호출
        System.out.println(
            aa.getName()+"\t"+
            aa.getEng()+"\t"+
            aa.getMath()+"\t"+
            aa.getavg()+"\t"+
            aa.getgrade()+"\t"
        );
        Sungjuk bb = new Sungjuk();
        bb.setData("죠르디", 70, 80, 90);
        bb.calc(); // 호출
        System.out.println(
            bb.getName()+"\t"+
            bb.getEng()+"\t"+
            bb.getMath()+"\t"+
            bb.getavg()+"\t"+
            bb.getgrade()+"\t"
        );



    }
}




