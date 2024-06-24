// Program to calculate and return the sum of the all digits, even digits and prime digits  of a user given number.

import java.util.Scanner;
public class SumOfDigitsOfGivenNum 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("The sum of all the digits = "+sumOfDigitsOfGivenNum(n));
        System.out.println(" The sum of even digits = "+sumOfEvenDigits(n));
        System.out.println(" The sum of odd digits = "+sumOfOddDigits(n));
        System.out.println(" The sum of prime digits = "+sumOfPrimeDigits(n));
        sc.close();

    }
    public static int sumOfDigitsOfGivenNum(int n)
    {
        int sum=0;
        while(n!=0)
        {
            sum=sum+n%10;
            n=n/10;
        }
        return sum;
    }
    public static int sumOfEvenDigits(int n)
    {
        int sum=0;
        while(n!=0)
        {
            int r=n%10;
            if (r%2==0)
            sum=sum+r;
            n=n/10;
        }
        return sum;
    }
    public static int sumOfOddDigits(int n)
    {
        int sum=0;
        while(n!=0)
        {
            int r=n%10;
            if (r%2!=0)
            sum=sum+r;
            n=n/10;
        }
        return sum;
    }
    public static int sumOfPrimeDigits(int n)
    {
        int sum=0;
        while(n!=0)
        {
            int r=n%10;
            if (r==2 || r==3 || r==5 || r==7)
            sum=sum+r;
            n=n/10;
        }
        return sum;

    }
    
}
