//Program to print Primes in the user given range.
package Java;
import java.util.Scanner;
public class PrimesInRange 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("The prime numbers between "+a+" and "+b+" are: ");
        primes(a, b);
        sc.close();

    }
    public static void primes(int a, int b)
    {
        for(int i=a; i<=b; i++)
        {
            int count=0;
            for(int j=1; j<=i; j++)
            {
                if(i%j==0)
                {
                    count++;
                }
            }
            if(count==2)
            {
                System.out.print(i+"  ");
            }
        }
    }
    
}
