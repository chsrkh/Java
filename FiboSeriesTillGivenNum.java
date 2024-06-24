//Program to print Fibonacci numbers upto user given number.
import java.util.Scanner;
public class FiboSeriesTillGivenNum 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        fiboSeriesTillGivenNum(n);
        sc.close();
    
    }
    public static void fiboSeriesTillGivenNum(int n)
    {
        int a=0,b=1;
        System.out.print(a+"  "+b+" ");
        int c=0;
        while(c<=n)
        {
            c=a+b;
            System.out.print(c+"  ");
            a=b;
            b=c;
        }


    }    
}
