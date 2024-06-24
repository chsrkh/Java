//Program to check if User given number is prime or not, If prime then find the reverse of the user given number and check if it is prime or not.
// If it is prime return true, else return false.
import java.util.Scanner;
public class RevOfGivenNumIsPrimeOrNot 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        boolean b=revOfGivenNumIsPrimeOrNot(n);
        if(b)
        System.out.println(" Given num is prime and rev of given is also prime");
        else
        System.out.println(" Given num is not prime and rev of given is also not prime");
        scanner.close();
    }
    public static boolean isPrime(int n)
    {
        for(int i=1;i<=n/2;i++)
        {
            if(n%i==0)
                return false;
        }
            return false;        
    }
    public static int reverse(int n)
    {
        int rev=0;
        while(n!=0)
        {
            rev=rev*10+n%10;
            n=n/10;
        }
        return rev;
    }
    public static boolean revOfGivenNumIsPrimeOrNot(int n)
    {
        int rev=reverse(n);
      if(isPrime(n))
      {
        int rev=reverse(n);
        if(isPrime(rev))
            return true;
        else
            return false;
      }
      else 
        return false;
    }

    
}
