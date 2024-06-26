// Program to print sum of numbers, sum of even numbers, and sum of odd numbers in the given range.
import java.util.Scanner;
public class SumOfNums 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("\n Sum of Numbers in the given range :"+sumofNumsInRane(a, b));
        System.out.println("\n Sum of Even Numbers in the given range :"+sumOfEvenNumsInRange(a, b));
        System.out.println("\n Sum of Odd Numbers in the given range :"+sumOfOddNumsInRange(a, b));
        sc.close();
    }
    public static int sumofNumsInRane(int a, int b)
    {
        int sum=0;
        for(int i=a; i<=b; i++)
        {
            sum=sum+i;
        }
        return sum;

    }
    public static int sumOfEvenNumsInRange(int a, int b)
    {
        int sum = 0;
        for(int i=a; i<=b; i++)
        {
            if(i%2==0)
            {
                sum=sum+i;
            }
        
        }
        return sum;
    }
    public static int sumOfOddNumsInRange(int a, int b)
    {
        int sum = 0;
        for(int i=a; i<=b; i++)
        {
            if(i%2!=0)
            {
                sum=sum+i;
            }
    
        }
        return sum;
    }
}
