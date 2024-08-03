import java.util.Scanner;

public class Students_Details{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter a size of array:");
        int n=sc.nextInt();

        Student a[]=new Student[n];

        for(int i=0;i<a.length;i++){
            a[i]=new Student(); 
        }
        for(int i=0;i<a.length;i++){ 
            a[i].display();
        }
    }
}

class Student{
    int enrollment_No;
    String name;
    int sem;
    double cpi;

    Student(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter Student Enrollmentr_No");
        this.enrollment_No=sc.nextInt();
        sc.nextLine();
        System.out.println("enter Student Name");
        this.name=sc.nextLine();
        System.out.println("enter Student semester");
        this.sem=sc.nextInt();
        System.out.println("enter Student cpi");
        this.cpi=sc.nextDouble();
    }
    public void display(){
        System.out.println("");
        System.out.println("student_Detail:");
        System.out.println("Student Enrollmentr_No:"+enrollment_No);
        System.out.println("Student Name:"+name);
        System.out.println("Student semester:"+sem);
        System.out.println("Student cpi:"+cpi);
    }
}