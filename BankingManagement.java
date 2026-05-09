import java.lang.System;
import java.util.Scanner;
class Account
{
    String name;
    int accountnumber;
    double balance;
    void getdetails(Scanner scan)
    {
        System.out.print("Enter Your Name : ");
        name=scan.nextLine();
        System.out.print("Enter Your Account Number : ");
        accountnumber=scan.nextInt();
        balance =0;
    }
    void displaydetails()
    {
        System.out.println("Name           : "+name);
        System.out.println("Account Number : "+accountnumber);
    }
}
class SavingAccount extends Account
{
    void deposit(Scanner scan)
    {
        double intrest;
        System.out.print("How Much you have to deposit");
        int deposit = scan.nextInt();
        balance+=deposit;
        intrest = (balance*2)/100;
        balance = balance+intrest;
        System.out.print("Balance After Deposit "+balance);
    }
    void withdraw(Scanner scan)
    {
        System.out.print("Enter amount to withdraw : ");
        int amount = scan.nextInt();
        if(amount<=balance)
        {
            balance-=amount;
            System.out.print("Balance After Withdraw "+balance);
        }
        else{
            System.out.print("Insufficient Balance!!!");
        }
    }
    void checkbalance()
    {
        System.out.print("Your Account balance is : "+balance);
    }
}
class CurrentAccount extends Account
{
    void deposit(Scanner scan)
    {
        
        System.out.print("How Much you have to deposit");
        int deposit = scan.nextInt();
        balance+=deposit;
        System.out.print("Balance After Deposit "+balance);
    }
    void withdraw(Scanner scan)
    {
        System.out.print("Enter amount to withdraw : ");
        int amount = scan.nextInt();
        if(amount<=balance)
        {
            balance-=amount;
            System.out.print("Balance After Withdraw "+balance);
        }
        else{
            System.out.print("Insufficient Balance!!!");
        }
    }
    void checkbalance()
    {
        System.out.print("Your Account balance is : "+balance);
    }

}
class BankingManagement
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        SavingAccount s = new SavingAccount();
        CurrentAccount c = new CurrentAccount();
        System.out.println("1.Saving Account ");
        System.out.println("2.Current Account ");
        System.out.println("Enter Account type ");
        int type = scan.nextInt();
        if(type==1)
        {
            boolean run =true;
            while(run)
            {
                s.getdetails(scan);
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Check Balance");
                System.out.println("4. Display Details");
                System.out.println("5. Exit");
                System.out.print("Enter your choice (1-5): ");
                int choice=scan.nextInt();
                switch(choice)
                {
                    case 1:
                        s.deposit(scan);
                        break;
                    case 2:
                        s.withdraw(scan);
                        break;
                    case 3:
                        s.checkbalance();
                        break;
                    case 4:
                        s.displaydetails();
                        break;
                    case 5:
                        run=false;
                        break;
                    default:
                        System.out.print("Invalid Choice is Entered!!!");                    

                        
                }
            }
            
            
            //Savings account
        }
        else if(type==2)
        {
            boolean run =true;
            while(run)
            {
                c.getdetails(scan);
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Check Balance");
                System.out.println("4. Display Details");
                System.out.println("5. Exit");
                System.out.print("Enter your choice (1-5): ");
                int choice=scan.nextInt();
                switch(choice)
                {
                    case 1:
                        c.deposit(scan);
                        break;
                    case 2:
                        c.withdraw(scan);
                        break;
                    case 3:
                        c.checkbalance();
                        break;
                    case 4:
                        c.displaydetails();
                        break;
                    case 5:
                        run=false;
                        break;
                    default:
                        System.out.print("Invalid Choice is Entered!!!");                    

                        
                }
            }
            //current account
        }
        else
        {
            System.out.print("Invalid  Account type entered!!!");
        }
    }
}
