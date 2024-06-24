//Program to print only primes from the febonacci series in the user given range.
import java.util.Scanner;
public class PrimesFromFeboSeriesInRange 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        primesFromFeboSeriesInRange(a, b);
        scanner.close();
        
    }
    public static void primesFromFeboSeriesInRange(int a,int b)
    {
        int x=0, y=1;
        int z=0;
        while (true)  
        {
            z=x+y;
            if(z>=a && z<=b && isPrime(z)) 
            System.out.print(z+"  ");
            x=y;
            y=z;
            if(z>b)
            break;
        }
    }
   
    public static boolean isPrime(int n)
    {
        if(n<=1)
        return false;
        for(int i=2; i<=Math.sqrt(n); i++)
        {
            if(n%i==0)
            return false;
        }
        return true;
    }
    
}
