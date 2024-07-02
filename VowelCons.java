import java.util.Scanner;

public class VowelCons {
    
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
    
        System.out.println("enter a alphabet : ");
        char ch=sc.next().charAt(0);

        if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            System.out.println("vowel alphabet");
        }
        else{
            System.out.println("consonants alphabet");
        }
        
    }
}
