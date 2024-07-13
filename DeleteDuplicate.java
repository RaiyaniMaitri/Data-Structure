import java.util.Scanner;

public class DeleteDuplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

            System.out.println("enter a size of array : ");
            int size=sc.nextInt();
            int[] array=new int[size];
            
            for(int i=0;i<size;i++){
                System.out.println("enter an element : ");
                array[i]=sc.nextInt();
            }
            
            int[] ans=new int[size];
            int duplicatenum=0;
            
            for(int i=0;i<size;i++){
                boolean isDuplicate=false;
                for(int j=0;j<duplicatenum;j++){
                    if(array[i]==ans[j]){
                        isDuplicate = true;
                        break;
                    }
                }
                if(!isDuplicate){
                    ans[duplicatenum]=array[i];
                    duplicatenum++;
                }
            }

            for(int i=0;i<duplicatenum;i++){
                System.out.println(ans[i]);
            }
        }
}
