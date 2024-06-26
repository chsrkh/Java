// Program to find and return maximum and minimum from the given array.
import java.util.Scanner;
public class MaxMinFromArray 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter the size of the array:");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println(" Enter the elements of the array:");
        for(int i=0; i<n; i++)
        {
            a[i]=sc.nextInt();
        }
    
        int max=maxFromArray(a);
        int min=minFromArray(a);
        System.out.println(" Maximum element from the array:"+max);
        System.out.println(" Minimum element from the array:"+min);
        sc.close();

    }
    public static int maxFromArray(int a[])
    {   
        int max=a[0];
        for(int i=0; i<a.length; i++)
        {
            if(a[i]>=max)
            {
                max=a[i];
            }
        }   
        return max;

    }
    public static int minFromArray(int a[])
    {
        int min=a[0];
        for(int i=0; i<a.length; i++)
        {
            if(a[i]<=min)
            {
                min=a[i];
            }
        }
        return min;

    }
    
}
