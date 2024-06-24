// Program to calculate and return the sum of the digits of a user given number.
import java.util.Scanner;
public class SumOfDigitsOfGivenNum 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sumOfDigitsOfGivenNum(n));
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
    
}
