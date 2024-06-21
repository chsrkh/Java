// Program to perfrom addition of two Numbers
import java.util.Scanner;
public class Add2givenNums 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=addtwonums(a, b);
        System.out.println("The add of two numbers: "+c);
        sc.close();
    }
    public static int addtwonums(int m, int n)
    {
        int s=m+n;
        return s;
    }
    
}
