package src.class2_;

class Fruit {
    private String pum;
    private int jan, feb, mar, tot;
    private int sumJan, sumFeb, sumMar;

    // 생성자
    public Fruit(String pum, int jan, int feb, int mar) {
        this.pum = pum;
        this.jan = jan;
        this.feb = feb;
        this.mar = mar;
    }

    public void calcTot() {
        tot = (jan + feb + mar);
        sumJan += jan;
        sumFeb += feb;
        sumMar += mar;
    }

    public void display() {
        System.out.println(pum + "\t" + jan + "\t" + feb + "\t" + mar + "\t" + tot);
    }

}

public class FruitMain {
    public static void main(String[] args) {
        // 객체 배열 생성
        Fruit[] ar = new Fruit[3];

        ar[0] = new Fruit("사과", 20, 30, 40);
        ar[0].calcTot();
        ar[1] = new Fruit("포도", 20, 30, 40);
        ar[1].calcTot();
        ar[2] = new Fruit("딸기", 20, 30, 40);
        ar[2].calcTot();

        for (Fruit data : ar) {
            data.calcTot();
            data.display();
        }
    }
}
