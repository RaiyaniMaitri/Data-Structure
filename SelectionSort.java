import java.util.Scanner;

public class SelectionSort{
    
    void swap(int array[],int x,int y) { 
        int temp=array[x];
        array[x]=array[y];
        array[y]=temp;
    }

    void selectsort(int array[]){
        int n=array.length;
        for(int i=0;i<n-1;i++){
            int min_index=i;
            for(int j=i+1;j<n;j++){
                if(array[j]<array[min_index]){
                    min_index=j;
                }
            }
            if(min_index != i){
                swap(array,i,min_index);
            }
        }
    }

    public static void main(String[] args) {
        SelectionSort ss = new SelectionSort();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter an element: ");
            arr[i] = sc.nextInt();
        }

        ss.selectsort(arr);

        System.out.println("sorted array: ");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
