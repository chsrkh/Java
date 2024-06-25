// Program to print Armstrong numbers from the given array of elemens.
import java.util.Scanner;
public class ArmstrongsFromArray 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n=scanner.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0; i<arr.length; i++)
        {
            arr[i]=scanner.nextInt();
        }
        System.out.println(" Armstrong numbers from the array are:");
        armstrongs(arr);
        scanner.close();
    }
    public static void armstrongs(int[] arr)
    {
        double sum=0;

        for(int i=0; i<arr.length; i++)
        {
            int temp=arr[i];
            int n=temp,d=0;
            while (n>0) 
            {   
                d++;
                n=n/10;
            }
            
                
            
            while(temp!=0)
            {
                int rem=temp%10;
                sum=sum+Math.pow(rem,d);
                temp=temp/10;
            }
            if((int)sum==arr[i])
            {
                System.out.println(arr[i]);
            }
            sum=0;
        }
        
    }

    
}
