import java.util.Scanner;

public class DeleteAscending {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter a size of array : ");
        int size=sc.nextInt();
        int[] array=new int[size];
        int[] ans=new int[size+1];
       
        for(int i=0;i<size;i++){
            System.out.print("enter array ascending order : ");
            array[i]=sc.nextInt();
        }

        System.out.print("delete an element : ");
        int e=sc.nextInt();
        int i=0;

        while(array[i]<e){
            ans[i]=array[i];
            i++;
        }

        while(i<size-1){
            ans[i]=array[i+1];
            i++;
        }

        for(int j=0;j<size-1;j++){
            System.out.println("array : "+ans[j]);
        }
    }
    
}

    

