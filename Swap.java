import java.util.Scanner;

public class Swap {
    public static void Swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a : "+a);
        System.out.println("b : "+b);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter a : ");
        int a=sc.nextInt();
        System.out.println("enter b : ");
        int b=sc.nextInt();
        Swap(a,b);
        sc.close();
    }
}
