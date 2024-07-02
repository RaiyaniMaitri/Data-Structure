import java.util.Scanner;

public class SumOfSeries {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter a num : ");
        int n = scanner.nextInt();
        
        int totalSum = 0;

        for (int i = 1; i <= n; i++) {
            int sum = 0;
                for (int j = 1; j <= i; j++) {
                    sum=sum+j;
                }
            totalSum=totalSum+sum;
        }
        System.out.println("The sum of the series is : " + totalSum);
    }
}
