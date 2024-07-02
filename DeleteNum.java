import java.util.Scanner;

public class DeleteNum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter a size of array : ");
        int size=sc.nextInt();
        int[] array=new int[size];
        int[] ans=new int[size+1];

        
        for(int i=0;i<size;i++){
            System.out.print("enter an element : ");
            array[i]=sc.nextInt();
        }

        System.out.println("enter an index : ");
        int index=sc.nextInt();

        for(int i=0;i<index;i++){
           ans[i]=array[i];
        }
        for(int i=index;i<size-1;i++){
            ans[i]=array[i+1];
         }
        for(int i=0;i<size-1;i++){
            System.out.println("array : "+ ans[i]);
        }
    }
    
}
