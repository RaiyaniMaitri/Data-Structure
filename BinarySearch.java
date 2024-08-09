import java.util.Scanner;

public class BinarySearch{

	int binarysearch(int n){
        Scanner sc =  new Scanner(System.in);
		int[] array = new int[n];

		System.out.println("Enter element:");
		for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
		}

		System.out.println("Enter element which you want to find:");
		int x = sc.nextInt();

		int right = n-1;
		int left = 0;
		int mid = 0;
         
         while(left <= right){
            mid = left + ((right - left)/2) ; 
            if(x == array[mid]){
            	System.out.println("Index of given element:"+mid);
            	break ;
            }
            else if(x < array[mid]){
            	right = mid-1;
            }
            else{
            	left = mid+1;
            }
         }
        return mid;
	}


	public static void main(String args[]){
		Scanner sc =  new Scanner(System.in);
		BinarySearch bs = new BinarySearch();

		System.out.println("enter a size of array: ");
		int a=sc.nextInt();

		bs.binarysearch(a);
	}
}
