import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a matrix1 : ");
        int[][] matrix1=new int[3][2];

        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                matrix1[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter a matrix2 : ");
        int[][] matrix2=new int[2][3];

        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                matrix2[i][j]=sc.nextInt();
            }
        }

        System.out.println("multiplication of matrix:");
        int[][] matrix=new int[3][3];

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<2;k++){
                    matrix[i][j]+=matrix1[i][k]*matrix2[k][j];
                }
            }
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
    }
    
}
