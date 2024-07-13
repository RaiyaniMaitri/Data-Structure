import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int r=scanner.nextInt();

        for(int i=0;i<r;i++){

            for(int k=0;k<r-i-1;k++){
                System.out.print("  ");
            }

            int n=1;
            for(int j=0;j<=i;j++){
                System.out.printf("%4d",n);
                n=n*(i-j)/(j+1);
            }

            System.out.println();
        }
    }
}
