// Program to perform division of user given two numbers
import java.util.Scanner;
public class Div2givenNums 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        double c=divtwonums(a, b);
        System.out.println("The div of two numbers: "+c);
        sc.close();
    }
    public static double divtwonums(int m, int n)
    {
        double s=m/n;
        return s;
    }
    
}
