// Program to dislay palindrome numbers in the user given range..
import java.util.Scanner;
public class PalindromesInRange 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        palindromes(a, b);
        sc.close();

        
    }
    public static void palindromes(int a, int b)
    {
        for(int i=a; i<=b; i++)
        {
            int temp=i;
            int rev=0;
            while(temp!=0)
            {
                int rem=temp%10;
                rev=rev*10+rem;
                temp=temp/10;
            }
            if(i==rev)
            {
                System.out.println(i);
            }
        }
    }
    
}
