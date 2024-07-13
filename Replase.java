import java.util.Scanner;

public class Replase {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter a size of array : ");
        int size=sc.nextInt();
        int[] array=new int[size];
        
        for(int i=0;i<size;i++){
            System.out.println("enter an element : ");
            array[i]=sc.nextInt();
        }
         
        System.out.println("enter a num of replace : ");
        int f=sc.nextInt();
        System.out.println("enter a num to replace with : ");
        int s=sc.nextInt();

        int pf=-1;
        int ps=-1;
        int temp;

        for(int i=0;i<size;i++){
            if(array[i]==f && pf==-1){
                pf=i;
            }
            if(array[i]==s && ps==-1){
                ps=i;
            }
        }
        
        if(pf!=-1 && ps!=-1){
            temp=array[pf];
            array[pf]=array[ps];
            array[ps]=temp;
        }
        else{
            System.out.println("One or both numbers not found in the array.");
        }

        System.out.println("final array is: ");

        for (int i=0;i<size;i++){
            System.out.println(array[i]);
            
        }


    }
    
}
