//Program to return product of user given two numbers.
import java.util.Scanner;
public class Mul2givenNums 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=multwonums(a, b);
        System.out.println("The mul of two numbers: "+c);
        sc.close();
    }
    public static int multwonums(int m, int n)
    {
        int s=m*n;
        return s;
    }
    
}
