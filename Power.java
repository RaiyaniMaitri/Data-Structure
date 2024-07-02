import java.util.Scanner;

public class Power {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter a number : ");
        int base=sc.nextInt();
        System.out.println("enter a exponment : ");
        int exponent=sc.nextInt();

        int power=1;

        for(int i=0;i<exponent;i++){
            power=power*base;
        }
        System.out.println("Power of Number : "+power);
    }
}