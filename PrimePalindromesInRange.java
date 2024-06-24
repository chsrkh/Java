// Program to print Prime Palindrome numbers in the user given Range.
import java.util.Scanner;
public class PrimePalindromesInRange 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        primePalindromesInRange(a,b);
        sc.close();

    }
    public static void primePalindromesInRange(int a,int b)
    {
        for(int i=a;i<=b;i++)
        {
            if(isPrime(i) && isPalindrome(i))
            {
                System.out.println(i);
            }
        }

    }
    public static boolean isPrime(int n)
    {
        for (int i = 2; i < n/2; i++)
        {
            if(n%i==0)
            return false;
        }
        return true;
    }
    public static boolean isPalindrome(int n)
    {
        int temp=n;
        int rev=0;
        while(temp!=0)
        {
            rev=rev*10+temp%10;
            temp=temp/10;
        }
        if(rev==n)
        return true;
        else
        return false;
    }
    
}
