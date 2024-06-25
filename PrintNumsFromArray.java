//Program to print Negative, Positive, Even and Odd numbers from the array.
import java.util.Scanner;
public class PrintNumsFromArray 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter the size of the array:");
        int n=sc.nextInt();
        System.out.println(" Enter the elements of the array:");
        int a[]=new int[n];
        for(int i=0; i<n; i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println(" Negative elements are :");
        printNegativeNumsFromArray(a);
        System.out.println(" Positive elements are :");
        printPositiveNumsFromArray(a);
        System.out.println(" Even elements are :");
        printEvenNumsFromArray(a);
        System.out.println(" Odd elements are :");
        printOddNumsFromArray(a);
        sc.close();
    }
    public static void printNegativeNumsFromArray(int a[])
    {
        for(int i=0; i<a.length; i++)
        {
            if(a[i]<0)
            {
                System.out.println(a[i]);
            }
        }
    }
    public static void printPositiveNumsFromArray(int a[])
    {
        for(int i=0; i<a.length; i++)
        {
            if(a[i]>0)
            {
                System.out.println(a[i]);
            }
        }
    }
    public static void printEvenNumsFromArray(int a[])
    {
        for(int i=0; i<a.length; i++)
        {
            if(a[i]%2==0)
            {
                System.out.println(a[i]);
            }
        }
    }
    public static void printOddNumsFromArray(int a[])
    {
        for(int i=0; i<a.length; i++)
        {
            if(a[i]%2!=0)
            {
                System.out.println(a[i]);
            }
        }
    }
}
