// Program to return given array into ascending order and dsceding order
import java.util.Scanner;
public class SortedArray 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the size of the array:");
        int n=scanner.nextInt();
        int a[]=new int[n];
        System.out.println(" Enter the elements of the array:");
        for(int i=0; i<n; i++)
        {
            a[i]=scanner.nextInt();
    
        }
        int b[]=new int[n];
        b=ascendingOrderArray(a);
        System.out.println(" Elements in ascending order:");
        for(int i=0; i<n; i++)
        {
            System.out.print(b[i] + " ");
        }
        b=descendingOrderArray(a);
        System.out.println(" Elements in descending order:");
        for(int i=0; i<n; i++)
        {
            System.out.print(b[i] + " ");
        }

        scanner.close();
    }
    public static int[] ascendingOrderArray(int a[])
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
    public static int[] descendingOrderArray(int a[])
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
