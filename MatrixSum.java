import java.util.Scanner;

public class MatrixSum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a matrix1 : ");
        int[][] matrix1=new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter a matrix2 : ");
        int[][] matrix2=new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        System.out.println("sum of matrix:");
        int[][] matrix=new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrix[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
               System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
    }
}
