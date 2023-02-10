package src.inheritance;
import java.util.Scanner;

class Shape{
    protected double area;
    protected Scanner scan = new Scanner(System.in);

    public Shape(){
        System.out.println("ShapeTest 기본생성자");
    }
    public void calcArea() {
        System.out.println("도형계산");
    }
    public void printArea() {
        System.out.println("도형출력");
    }
    
}

class Sam extends Shape{
    protected int base,height;
    public Sam(){
        System.out.println("Sam 기본생성자");
        System.out.print("밑변 : ");
        base = scan.nextInt();
        System.out.print("높이 : ");
        height = scan.nextInt();
    }
    // 오버라읻 어노테이션 (주석)
    @Override
    public void calcArea() {
        area =base*height/2.0;
    }
    @Override
    public void printArea() {
        System.out.println("삼각형 넓이 : "+area);
    }
}

class Square extends Shape{
    protected int base,height;
    public Square(){
        System.out.println("Square 기본생성자");
        System.out.print("밑변 : ");
        base = scan.nextInt();
        System.out.print("높이 : ");
        height = scan.nextInt();
    }
    // 오버라읻 어노테이션 (주석)
    @Override
    public void calcArea() {
        area =base*height;
    }
    @Override
    public void printArea() {
        System.out.println("사각형 넓이 : "+area);
    }
}

class Sadari extends Shape{
    protected int base,height,upper;
    public Sadari(){
        System.out.println("Sadari 기본생성자");
        System.out.print("밑변 : ");
        base = scan.nextInt();
        System.out.print("윗변 : ");
        upper = scan.nextInt();
        System.out.print("높이 : ");
        height = scan.nextInt();
    }
    // 오버라읻 어노테이션 (주석)
    @Override
    public void calcArea() {
        area =(upper+base)*height/2.0;
    }
    @Override
    public void printArea() {
        System.out.println("사다리꼴 넓이 : "+area);
    }
}

public class ShapeMain {
    public static void main(String[] args) {
        Sam sam = new Sam();
        sam.calcArea();
        sam.printArea();
        Square square = new Square();
        square.calcArea();
        square.printArea();
        Sadari sadari = new Sadari();
        sadari.calcArea();
        sadari.printArea();
    }
}
