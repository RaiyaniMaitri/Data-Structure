import java.util.Scanner;

public class BubbleSort{
    
    void swap(int array[],int x,int y){ 
        int temp=array[x];
        array[x]=array[y];
        array[y]=temp;
    }
    
    void bubblesort(int array[]){
        int n=array.length;
            for(int i=0;i<n-1;i++){
                for(int j=0;j<n-i-1;j++){
                    if(array[j]>array[j+1]){
                        swap(array,j,j+1);
                    }
                }
         }
    }

public static void main(String[] args){
    BubbleSort bs=new BubbleSort();
    Scanner sc=new Scanner(System.in);

    System.out.println("enter a size of array: ");
    int size=sc.nextInt();
    int[] arr=new int[size];

    for(int i=0;i<size;i++){
        System.out.println("enter an element : ");
        arr[i]=sc.nextInt();
    }

    bs.bubblesort(arr);

    System.out.println("sorted array: ");
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
    
    }
}
