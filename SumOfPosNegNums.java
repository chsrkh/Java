// Program to find sum of positive nums and sum of negitive nums in the user given range
import java.util.Scanner;
public class SumofNegPosNums 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("The Sum of positive nums in the range : "+sumOfPositiveNums(a,b));
        System.out.println("\n The Sum of negitive nums in the range : "+sumOfNegitiveNums(a,b));
        sc.close();

    }
    public static int sumOfPositiveNums(int a,int b)
    {
        int sum=0;
        for(int i=a;i<=b;i++)
        {
            if(i>0)
            {
                sum=sum+i;
            }
        }
        return sum;        
    }
    public static int sumOfNegitiveNums(int a,int b)
    {
        int sum=0;
        for(int i=a;i<=b;i++)
        {
            if(i<0)
            {
                sum=sum+i;
            }
        }
        return sum;
    }
}
