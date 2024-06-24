//Program to check given number is prime or not.
import java.util.Scanner;
public class PrimeOrNot 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(isPrime(n))
        {
            System.out.println("Prime");
        }
        else
        {
            System.out.println("Not Prime");
        }
        sc.close();

    }
    public static boolean isPrime(int n)
    {
        if(n==1)
        {
            return false;
        }
        for(int i=2;i<n/2;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    
}
