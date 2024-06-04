import java.util.Scanner;
public class P35_Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student_Detail[] sd = new Student_Detail[5];

        for(int i=0;i<5;i++)
        {
            System.out.println("Enter " + (i+1) + "Detail : ");
            sd[i] = new Student_Detail();
        }

        for(int i=0;i<5;i++)
        {
            System.out.println((i+1) + "student details : ");
            sd[i].printdetail();
        }
    }
}

class Student_Detail
{
    int Enrollment_No;
    String Name;
    String Sem;
    float SPI;

    Student_Detail()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name : ");
        this.Name = sc.nextLine();
        System.out.println("Enter Enrollment No : ");
        this.Enrollment_No = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Sem : ");
        this.Sem = sc.nextLine();
        System.out.println("Enter CPI : ");
        this.SPI = sc.nextFloat();
    }

    public void printdetail()
    {
        System.out.println("Name is : " + this.Name);
        System.out.println("Enrollment_NO is : " + this.Enrollment_No);
        System.out.println("Sem is : " + this.Sem);
        System.out.println("CPI is : " + this.SPI);
    }
}