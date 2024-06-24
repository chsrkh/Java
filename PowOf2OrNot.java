//Program to check and return true if the user given number is power of 2, else return false. 
import java.util.Scanner;
public class PowOf2OrNot 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(isPowOf2OrNot(n));
        sc.close();

    }
    public static boolean isPowOf2OrNot(int n)
    {
        if(n==0)
        {
            return false;
        }
        while(n!=1)
        {
            if(n%2!=0)
            {
                return false;
            }
            n=n/2;
        }
        return true;
    }
    
}
