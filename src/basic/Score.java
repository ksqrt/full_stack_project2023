package src.basic;

public class Score {
    public static void main(String[] args) {
        // 문제 성적계산 이름이 L 이고 
        // 국어 85, 영어 78, 수학 100 일떄 총점과 평균
        String name = "L";
        int korean = 85;
        int english = 78;
        int math = 100;

        int sum = korean+english+math;
        int eval = sum /3;

        System.out.println("   ***"+name+" 성적표 ***   ");

        System.out.println("국어 영어 수학 총점 평균");
        System.out.printf("%d   %d   %d   %d   %d \n",korean,english,math,sum,eval);

    }   
}
