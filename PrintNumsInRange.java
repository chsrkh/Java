// Program to print numbers in a user given range by using different loops 
import java.util.Scanner;
public class PrintNumsInRange 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(" \nUsing while loop:");
        usingWhileLoop(a, b);
        System.out.println(" \nUsing for loop:");
        usingForLoop(a, b);
        System.out.println(" \nUsing do while loop:");
        usingDoWhileLoop(a, b);        
        sc.close();
    }
    public static void usingWhileLoop(int a, int b)
    {
        int i=a;
        while(i<=b)
        {
            System.out.println(i);
            i++;
        }
    }
    public static void usingForLoop(int a, int b)
    {
        for(int i=a;i<=b;i++)
        {
            System.out.println(i);
        }
    }
    public static void usingDoWhileLoop(int a, int b)
    {   
        int i=a;
        do
        {
            System.out.println(i);
            i++;
        }while(i<=b);
    }
    
}
