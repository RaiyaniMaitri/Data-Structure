import java.util.Scanner;
import java.util.Arrays;

public class AlphabeticalOrder {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number of names: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] names=new String[n];
        
        System.out.println("Enter the names: ");
        for(int i=0;i<n;i++){
            names[i] = sc.nextLine();
        }

        Arrays.sort(names);

        System.out.println("Names in alphabetical order:");
        for(int i=0;i<n;i++) {
            System.out.println(names[i]);
        }
    }
}
