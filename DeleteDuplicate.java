import java.util.Scanner;

public class DeleteDuplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

            System.out.println("enter a size of array : ");
            int size=sc.nextInt();
            int[] array=new int[size];
            int[] ans=new int[size+1];
            int duplicatenum=0;
            
            for(int i=0;i<size;i++){
                System.out.println("enter an element : ");
                array[i]=sc.nextInt();
            }
    
            for(int i=0;i<size;i++){
                for(int j=i+1;j<size;j++){
                    if(array[i]==array[j]){
                        
                    }
                }
    
            }

        }
    }