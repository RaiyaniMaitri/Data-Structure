import java.util.Scanner;

public class Array{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter a size of array : ");
        int size=sc.nextInt();
        int[] array=new int[size];
        
        for(int i=0;i<size;i++){
            System.out.println("enter an element : ");
            array[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            System.out.println("array : "+ array[i]);
        }
    }
}