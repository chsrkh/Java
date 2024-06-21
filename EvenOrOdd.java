// This is the program to return Even if the given number is even, Odd otherwise.
import java.util.Scanner;
public class EvenOrOdd 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String x=evenOrOdd(n);
        System.out.println(x);
        sc.close();
    }
    public static String evenOrOdd(int n)
    {
        if(n%2==0)
        return "Even";
        else
        return "Odd"; 
    }
    
}
