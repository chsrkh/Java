// Program to swap two given numbers with the help of the third variable.
import java.util.Scanner;
public class Swaptwonums
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
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("The swapped numbers are: "+a+" "+b);
    }
    
}
