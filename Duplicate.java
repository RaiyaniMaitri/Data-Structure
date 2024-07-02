import java.util.Scanner;

public class Duplicate {
  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter a size of array : ");
        int size=sc.nextInt();
        int[] array=new int[size];
        
        for(int i=0;i<size;i++){
            System.out.println("enter an element : ");
            array[i]=sc.nextInt();
        }

        boolean flage=false;


        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(array[i]==array[j]){
                    flage=true;
                }
            }

        }
        if(flage==true){
            System.out.println("duplicate num");
        }
        else{
            System.out.println("not duplicate num");
        }
    }
}
