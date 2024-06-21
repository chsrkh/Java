// Program to perform basic ATM operation based on user selection.
import java.util.Scanner;
public class ATMoperations
{
    public static void main(String[] args)
    {
        int balance=10000;
        int cash=5000;
        int PIN=1234;
        int ch=1;
        int amnt, bal;
        Scanner scanner = new Scanner(System.in);
        while (ch==1)
        {
            System.out.println("Welcome to ATM");
            System.out.println("Enter your PIN:");
            int p=scanner.nextInt();
            if(p==PIN)
            {
                System.out.println("\n Choose any one of the following:");
                System.out.println("1. Check Balance");
                System.out.println("2. Withdraw Money");
                System.out.println("3. Deposit Money");
                System.out.println("4. PIN Change");
                System.out.println("5. Exit");
                System.out.println("\n Enter your option:");
                int option=scanner.nextInt();
                switch (option)
                {
                    case 1:
                        balanceCheck(balance);                        
                        break;
                    case 2:
                        System.out.println("Enter amount:");
                        amnt=scanner.nextInt();
                        bal=withdrawlMoney(amnt, balance,cash);
                        if(balance == bal)
                        System.out.println("Transaction failed");
                        else
                        {
                        System.out.println("updated balance = " + bal);
                        balance=bal;
                        }
                        break;
                    case 3:
                        System.out.println("Enter amount:");
                        amnt=scanner.nextInt();
                        bal=depositMoney(amnt, balance,cash);
                        if(balance == bal)
                        System.out.println("Transaction failed");
                        else
                        {
                        System.out.println("updated balance = " + bal);
                        balance=bal;
                        }
                        break;
                    case 4:
                        p=pinChange(PIN);
                        if(p!=PIN)
                        System.out.println("PIN changed successfully");
                        else
                        System.out.println("PIN change failed");
                        break;
                    case 5:
                        System.exit(0);

                    default:
                        System.out.println("Invalid option");
                        break;
                }
            }
            System.out.println("\n Do you want to continue press 1:\n ");
            ch=scanner.nextInt();

        }
             scanner.close();
    }
    public static int withdrawlMoney(int amount, int balance,int cash)
    {
        if(amount%100!=0)
        return balance;
        else if(amount<=balance)
        {
            if(amount<=cash)
            return balance-amount;
            else
            return balance;
        }
        else
        return balance;
    }
    public static void balanceCheck(int balance)
    {
        System.out.println("Your current balance is: "+balance);
    }
    public static int depositMoney(int amount, int balance,int cash)
    {
        if(amount%100!=0)
        return balance;
        else 
        return balance+amount;
    }
    public static int pinChange(int PIN)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter your current PIN number:");
        int p=scanner.nextInt();
        if(p==PIN)
        {
            System.out.println(" Enter your new PIN number:");
            int p1=scanner.nextInt();
            System.out.println("Confirm your new PIN number:");
            int p2=scanner.nextInt();
            
            if(p1==p2 && p1!=PIN && p1!=0)
            {
                int d=0;
                while (p1>0)
                {
                    d++;
                    p1=p1/10;
                }
                if(d==4)
                    PIN=p2;
                else
                return PIN;
            }
        }
        return PIN;
                      
    }
}
