//Program to return nearest Prime number for the user given number.
import java.util.Scanner;
public class NearestPrimeToGivenNum 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int prime= nearestPrime(num);
        System.out.println("The nearest prime to " + num + " is " + prime);
        sc.close();

    }
    public static int nearestPrime(int num)
    {
        int n;
        int x=0,y=0;
        if (isPrime(num))
            return num;
        for(int i=num-1;i>0;i--)
        {
            if(isPrime(i))
            {
                x=i;
                break;
            }
        }
        for(int i=num+1;true;i++)
        {
            if(isPrime(i))
            {
                y=i;
                break;
            }
        }
        if( num-x >= y-num)
            n=x;
        else
            n=y;
        return n;
    }
    public static boolean isPrime(int num)
    {
        int count=0;
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
}
