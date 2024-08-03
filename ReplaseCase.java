import java.util.Scanner;

public class ReplaseCase{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter a string");
		String str=sc.nextLine();

		StringBuilder convertedString=new StringBuilder();

		for(int i=0;i<str.length();i++) {
            char ch=str.charAt(i);
            
            if(Character.isUpperCase(ch)){
                convertedString.append(Character.toLowerCase(ch));
            } 
			else if(Character.isLowerCase(ch)) {
                convertedString.append(Character.toUpperCase(ch));
            } 
        }
		System.out.println("Converted string: "+convertedString.toString());
	}
}