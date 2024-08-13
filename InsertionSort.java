import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

    void insertionsort(int array[]) {
        int n = array.length;
        int i=1;

        while ( i < n) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
            i++;
        }
    }

    public static void main(String[] args) {
        InsertionSort is = new InsertionSort();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter an element: ");
            arr[i] = sc.nextInt();
        }

        is.insertionsort(arr);

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
