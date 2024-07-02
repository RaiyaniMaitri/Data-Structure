import java.util.Scanner;

public class CricleArea{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter a radius : ");
        int radius=sc.nextInt();
        double area=Math.PI*radius*radius;
        System.out.println("Area of Cricle : "+area);
    }
}