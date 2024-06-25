//Program to return 
import java.util.Scanner;
public class SmallestPrimeFromArray 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println(" Enter the elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(smallestPrime(arr));
        sc.close();

    }
    public static int smallestPrime(int[] arr)
    {
        int minPrime=0;
        for(int i=0; i<arr.length; i++)
        {
            if(isPrime(arr[i]))
            {
                minPrime=arr[i];
                break;
            }
        }
      
        for(int i=0;i<arr.length;i++)
        {
            if(isPrime(arr[i]) && arr[i]<minPrime)
            {
                minPrime=arr[i];
            }
        }
        return minPrime;
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
