// Program to return given K th minimum element from the given array
import java.util.Scanner;
public class KthMinEleFromArray 
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
        int min=kthmin(a, k);
        System.out.println(" K the element from the array :"+min);
        sc.close();
    }
    public static int kthmin(int[] arr, int k)
    {
        int a[]=new int[arr.length];
        a=ascendingOrderArray(arr);
        if(k<=arr.length)
        return a[k-1];
        else
        return -1;

    }
    public static int[] ascendingOrderArray(int[] a)
    {
        int temp;
        for(int i=0; i<a.length; i++)
        {
            for(int j=i+1; j<a.length; j++)
            {
                if(a[i]>a[j])
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
