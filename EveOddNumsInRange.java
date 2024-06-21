// Program to print even numbers and odd numbers in the user given range.
import java.util.Scanner;
public class EveOddNumsInRange 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(" \n Even numbers in the given range are:");
        evenNums(a,b);
        System.out.println(" \n Odd numbers in the given range are:");
        oddNums(a,b);
        sc.close();

    }
    public static void evenNums(int a,int b)
    {
        for(int i=a;i<=b;i++)
        {
            if(i%2==0)
            {
                System.out.print(i+"  ");
            }
        }
    }
    public static void oddNums(int a,int b)
    {
        for(int i=a;i<=b;i++)
        {
            if(i%2!=0)
            {
                System.out.print(i+" ");
            }
        }
    }
    
}
