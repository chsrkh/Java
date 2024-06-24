// Program to return the reverse of a user given number.
import java.util.Scanner;
public class ReverseOfGivenNum 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        reverse(n);
        sc.close();
    }
    public static void reverse(int n)
    {
        int rev=0;
        while(n!=0)
        {
            rev=rev*10+n%10;
            n=n/10;
        }
        System.out.println(rev);
    }
    
}
