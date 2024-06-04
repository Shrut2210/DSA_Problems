import java.util.Scanner;
public class P34_Employee {
    public static void main(String[] args) {

        Employee_Detail ed = new Employee_Detail();

        ed.printvalue();
    }
}

class Employee_Detail
{
    int Employee_ID;
    String Name;
    String Designation;
    int salary;

    Employee_Detail()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee ID : ");
        this.Employee_ID = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter employee name : ");
        this.Name = sc.nextLine();
        System.out.println("Enter designation : ");
        this.Designation = sc.nextLine();
        System.out.println("Enter salary : ");
        this.salary = sc.nextInt();
    }

    public void printvalue()
    {
        System.out.println("Name is : " + this.Name);
        System.out.println("ID is : " + this.Employee_ID);
        System.out.println("Designation is : " + this.Designation);
        System.out.println("Salary is : " + this.salary);
    }
}