// Program to return Kth maximum element from the given array of elements.
import java.util.Scanner;
public class KthMaxEleFromArray 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter the size of the array:");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println(" Enter the elements into the array:");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println(" Enter the K value: ");
        int k=sc.nextInt();
        int min=kthmax(a, k);
        System.out.println(" K the Max element from the array :"+min);
        sc.close();
    }
    public static int kthmax(int[] arr, int k)
    {
        int a[]=new int[arr.length];
        a=descendingOrderArray(arr);
        if(k<=arr.length)
        return a[k-1];
        else
        return -1;

    }
    public static int[] descendingOrderArray(int[] a)
    {
        int temp;
        for(int i=0; i<a.length; i++)
        {
            for(int j=i+1; j<a.length; j++)
            {
                if(a[i]<a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        return a;

    }
    
}
