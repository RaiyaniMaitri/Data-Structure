import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    
        System.out.println("enter a number : ");
        int n=sc.nextInt();

        int h=n/3600;
        int m=(n%3600)/60;
        int s=n%60;
        System.out.println(+h+"hour,"+m+"minute,"+s+"second");
        System.out.println(+h+":"+m+":"+s+"");
    }
    
}
