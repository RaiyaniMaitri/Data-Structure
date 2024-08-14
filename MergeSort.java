import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {

    void mergesort(int array[], int low, int high) {
        if (low < high) {
            int mid = ((low + high) / 2);
            mergesort(array, low, mid);
            mergesort(array, mid + 1, high);
            merge(array, low, mid, high);
        }
    }

     void merge(int array[], int low, int mid, int high) {

        int h = low;
        int i = 0;
        int j = mid + 1;
        int b[] = new int[high-low+1];

        while (h <= mid && j <= high) {
            if (array[h] <= array[j]) {
                b[i] = array[h];
                h = h + 1;
            } 
            else {
                b[i] = array[j];
                j = j + 1;
            }
            i++;
        }
        if (h > mid) {
          for (int k = j; k <= high; k++) {
                b[i] = array[k];
                i++;
            }
        }
        else {
            for (int k =h; k <= mid ; k++) {
                b[i] = array[k];
                i++;
            }
        }
        for (int k =0; k < b.length; k++) {
            array[k+low] = b[k];
        }
    }

    public static void main(String[] args) {
        MergeSort ms = new MergeSort();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter size of array");
        int size = sc.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("enter an element");
            array[i] = sc.nextInt();
        }
        ms.mergesort(array, 0, size - 1);

        System.out.println(Arrays.toString(array));
    }
}