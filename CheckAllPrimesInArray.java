// Program to return true if all the primes from the smallest prime of the array to largest prime of the array are available in the array.
// Else return false.
import java.util.Scanner;
public class CheckAllPrimesInArray 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(checkAllPrimesInArray(arr));
        sc.close();
    }
    public static boolean checkAllPrimesInArray(int[] arr)
    {
        int minPrime=0;
        int maxPrime=0;
        
        for(int i=0;i<arr.length;i++)
        {
            if(isPrime(arr[i]))
            minPrime=arr[i];
            maxPrime=arr[i];
        }
        for(int i=0;i<arr.length;i++)
        {
            if(isPrime(arr[i]) && arr[i]<minPrime)
            {
                minPrime=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(isPrime(arr[i]) && arr[i]>maxPrime)
            {
                maxPrime=arr[i];
            }
        }
        while(minPrime<maxPrime)
        {
            if(isPrime(minPrime))
            {
                int c=0;
                for(int i=0;i<arr.length;i++)
                {
                    if(arr[i]==minPrime)
                    c++;
                }
                if(c==0)
                return false;
               
            }
            minPrime++;
        }
        return true;

    }
    public static boolean isPrime(int n)
    {
        for(int i=2;i<n/2;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    
}
