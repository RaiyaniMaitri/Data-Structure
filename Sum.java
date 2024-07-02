import java.util.Scanner;

public class Sum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter a n1 : ");
        int m=sc.nextInt();
        System.out.println("enter a n2 : ");
        int n=sc.nextInt();
        int sum=0;
        
        for(int i=m;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("sum:"+sum);

    }
}    