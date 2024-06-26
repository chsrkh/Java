// Program to perfrom simple withdrawal operation for the user given PIN, and amount
import java.util.Scanner;
public class Withdrawal 
{
    public static void main(String[] args)
    {
        int balance=10000;
        int cash=5000;
        Scanner scanner = new Scanner(System.in);
        int amnt=scanner.nextInt();

        int bal=withdrawalMoney(amnt, balance,cash);
        if(balance == bal)
        System.out.println("Transaction failed");
        else
        System.out.println("updated balance = " + balance);
        scanner.close();
    }
    public static int withdrawalMoney(int amount, int balance,int cash)
    {
        if(amount%100==0)
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
    
}
