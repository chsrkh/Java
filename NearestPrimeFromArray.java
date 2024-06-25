// Program to return a nearest Prime number from the array of user given number.
import java.util.Scanner;
public class NearestPrimeFromArray 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements:"); 
        int n=scanner.nextInt();
        int[] arr=new int[n];
        System.out.println(" Enter the elements:"); 
        for(int i=0;i<n;i++)
        {
            arr[i]=scanner.nextInt();
        }
        System.out.println(" Enter any number to print Nearest prime from array:");
        int num=scanner.nextInt();
        int x=nearestPrime(arr,num);
        System.out.println("Nearest prime number:"+x);
        scanner.close();   
    }
    public static int nearestPrime(int[] arr,int num)
    {
        int x=num;
        int y=num;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==num)
            return num;
        }
        while(true)
        {
            x++;
            int c=0;
            if(isPrime(x))
            {
                for(int i=0;i<arr.length;i++)
                {
                    if(x==arr[i])
                    c++;
                    
                }
                if(c!=0)
                break;
            }
            
        }
        while(true)
        {
            y--;
            int c=0;
            if(isPrime(y))
            {
                for(int i=0;i<arr.length;i++)
                {
                    if(y==arr[i])
                    c++;
                    
                }
                if(c!=0)
                break;
            }
            
        }
        if(x-num > num-y)
        return y;
        else 
        return x;


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
