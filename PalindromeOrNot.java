//Program to check and return true if the user given number is a Palindrome, else return false. 
import java.util.Scanner;
public class PalindromeOrNot 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        if(isPalindrome(n))
        {
            System.out.println("The number is palindrome");
        }
        else
        {
            System.out.println("The number is not palindrome");
        }
        
    }
    public static boolean isPalindrome(int n)
    {
        int temp=n;
        int rev=0;
        while(n>0)
        {
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(temp==rev)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
