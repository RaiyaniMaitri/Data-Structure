import java.util.Scanner;

public class Employee_Detail {
    public static void main(String[] args){
        Employee e1=new Employee();
        e1.display();
    }
}

class Employee {
    int Employee_ID;
    String Name;
    String Designation; 
    double Salary;


Employee(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter Employee_ID : ");
    this.Employee_ID=sc.nextInt();
    System.out.println("enter Name : ");
    this.Name=sc.next();
    System.out.println("enter Designation : ");
    this.Designation=sc.next();
    System.out.println("enter Salary : ");
    this.Salary=sc.nextDouble();
}

public void display(){
    System.out.println("");
    System.out.println("Employee_Detail:");
    System.out.println("Employee_ID : "+Employee_ID);
    System.out.println("Name : "+Name);
    System.out.println("Designation : "+Designation);
    System.out.println("Salary : "+Salary);
}

}
