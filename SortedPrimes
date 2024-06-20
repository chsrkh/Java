// Program to check and return true 
// if the prime elements are sorted from the given array.

package Java;
import java.util.Scanner;
public class SoretedPrimes 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scanner.nextInt();
        }
        boolean v=isSoreted(a);
        System.out.println(v);
        scanner.close();
    }
    public static boolean isSoreted(int a[])
    {
        int x=2;
        for(int i=0;i<a.length;i++)
        {
            int c=0;
            for(int j=2;j<=a[i]/2;j++)
            {
                if(a[i]%j==0)
                {
                    c++;
                }
            }
            if(c==0) 
            {
                if(a[i]<x)
                return false;
                else
                x=a[i];
            }
        }
        return true;
    }
}
