//Program to find sum of all the array elements, sum of positive, sum of negative, sum of even, sum of odd numbers from the array.
import java.util.Scanner;
public class SumOFArrayElements 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter the size of the array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println(" Enter the elements: ");
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        int sum=sum(arr);
        System.out.println(" Sum of elements: "+sum);
        System.out.println(" Sum of even elements: "+sumOfEven(arr));
        System.out.println(" Sum of odd elements: "+sumOfOdd(arr));
        System.out.println(" Sum of positive elements: "+sumOfPositive(arr));
        System.out.println(" Sum of negative elements: "+sumOfNegative(arr));
        sc.close();        

    }
    public static int sum(int[] arr)
    {
        int sum=0;
        for(int i=0; i<arr.length; i++)
        {
            sum=sum+arr[i];
        }
        return sum; 
    }
    public static int sumOfEven(int[] arr)
    {
        int sum=0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]%2==0)
            {
                sum=sum+arr[i];
            }
        }
        return sum;
    }
    public static int sumOfOdd(int[] arr)
    {
        int sum=0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]%2!=0)
            {
                sum=sum+arr[i];
            }
        }
        return sum;
    }
    public static int sumOfPositive(int[] arr)
    {
        int sum=0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>0)
            {
                sum=sum+arr[i];
            }
        }
        return sum;
    }
    public static int sumOfNegative(int[] arr)
    {
        int sum=0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]<0)
            {
                sum=sum+arr[i];
            }
        }
        return sum;
    }
    
}
