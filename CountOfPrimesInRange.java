// Program to count number of primes in the user given range.
import java.util.Scanner;
public class CountOfPrimesInRange 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=countOfPrimesInRange(a, b);
        System.out.println(c);
        scanner.close();
    }
    public static int countOfPrimesInRange(int a, int b)
    {
        int count=0;
        for(int i=a; i<=b; i++)
        {
            if(isPrime(i))
            {
                count++;
            }
        }
        return count;
    
    }
    public static boolean isPrime(int n)
    {
        for(int i=2; i<n; i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;

    }
}
