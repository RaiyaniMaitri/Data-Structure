import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter a num : ");
        int n=sc.nextInt();
        int sum=0;

        for(int i=0;i<=n;i++){
            sum=sum+i;
        }
        double avg=sum/n;
        System.out.println("avg:"+avg);
    
    }

}