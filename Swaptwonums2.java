//Program to swap user given two numbers without third variables 
import java.util.Scanner;
public class Swaptwonums2
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int x=s.nextInt();
        int y=s.nextInt();
        swappingnums(x, y);
        s.close();
    }
    public static void swappingnums(int a, int b)
    {
        System.out.println("Before swapping numbers are: "+a+" "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("The swapped numbers are: "+a+" "+b);
    }
    
}
