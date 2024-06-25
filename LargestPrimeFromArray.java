// Program to return largest prime number from the given array elements.
import java.util.Scanner;
public class LargestPrimeFromArray 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++)
        {
            a[i] = scanner.nextInt();
        }
        int maxPrime=largestPrime(a);
        System.out.println("maxPrime: " + maxPrime);
         scanner.close();
    }
    public static int largestPrime(int[] arr)
    {
        int maxPrime=0;
        for(int i=0; i<arr.length; i++)
        {
            if(isPrime(arr[i]))
            {
                maxPrime=arr[i];
                break;
            }
        }
      
        for(int i=0;i<arr.length;i++)
        {
            if(isPrime(arr[i]) && arr[i]>maxPrime)
            {
                maxPrime=arr[i];
            }
        }
        return maxPrime;
    }
    public static boolean isPrime(int n)
    {
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    
}

    
