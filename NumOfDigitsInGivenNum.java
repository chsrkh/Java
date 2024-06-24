//Program to return number of digits from the user given number.
import java.util.Scanner;
public class NumOfDigitsInGivenNum 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(numofdigits(n));
        sc.close();

    }
    public static int numofdigits(int n)
    {
        int count=0;
        while(n!=0)
        {
            n=n/10;
            count++;
        }
        return count;
    }
    
}
