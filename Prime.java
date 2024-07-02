import java.util.Scanner;

public class Prime {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter a number : ");
        int n=sc.nextInt();

        boolean flag=false;
        for(int i=2;i<n;i++){
            if(n%i==0){
                flag=true;
                break;
            }
        }

        if(flag==false){
            System.out.println("prime number");
        }
        else{
            System.out.println("not prime number");
        }
    }
}
