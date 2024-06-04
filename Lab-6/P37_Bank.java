import java.util.Scanner;

public class P37_Bank {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankAccount act = new BankAccount();

        float balance = act.chechBalance();
        System.out.println("Current balance is : " + balance);

        System.out.println("Enter money you want to deposit : ");
        int deposit = sc.nextInt();
        act.depositMoney(deposit);

        System.out.println("Enter money you want to withdraw : ");
        int withdraw = sc.nextInt();
        act.withDrawMoney(withdraw);
    }
}

class BankAccount 
{
    int Act_No;
    float Act_Balance;
    String Holder_Name;
    String Act_Name;

    BankAccount()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account number : ");
        this.Act_No = sc.nextInt();
        System.out.print("Enter account balance : ");
        this.Act_Balance = sc.nextFloat();
        sc.nextLine();
        System.out.print("Enter account holder name : ");
        this.Holder_Name = sc.nextLine();
        System.out.print("Enter account name : ");
        this.Act_Name = sc.nextLine();
    }

    float chechBalance()
    {
        return this.Act_Balance;
    }

    void depositMoney(int ammount)
    {
        this.Act_Balance += ammount;
        System.out.println("Money deposit in account !!!");
        System.out.println("Total balance : " + this.Act_Balance);
    }

    void withDrawMoney(int ammount)
    {
        if(this.Act_Balance-ammount < 0)
        {
            System.out.println("Can not withdraw !!! Low balance !!!");
        }
        else
        {
            this.Act_Balance -= ammount;
            System.out.println("Money withdraw in account !!!");
            System.out.println("Total balance : " + this.Act_Balance);
        }
    }
}
