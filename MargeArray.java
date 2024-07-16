import java.util.Scanner;

public class MargeArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("enter a size of first array : ");
        int size1=sc.nextInt();
        int[] array1=new int[size1];

        for(int i=0;i<size1;i++){
            array1[i]=sc.nextInt();
        }

        System.out.print("enter a size of second array : ");
        int size2=sc.nextInt();
        int[] array2=new int[size2];

        for(int i=0;i<size2;i++){
            array2[i]=sc.nextInt();
        }

        int[] Array = new int[size1 + size2];
        for (int i = 0; i < size1; i++) {
            Array[i] = array1[i];
        }
        for (int i = 0; i < size2; i++) {
            Array[size1 + i] = array2[i];
        }

        System.out.print("final array : ");
        for(int i=0;i<Array.length;i++){
            System.out.print(Array[i] + " ");
        }

        
	}
}
