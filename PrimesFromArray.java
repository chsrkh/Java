//Program to print Prime numbers from the given array of elements.

import java.util.Scanner;
public class PrimesFromArray 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n=scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i=0; i<n; i++)
        {
            arr[i]=scanner.nextInt();
        }
        System.out.println("The prime numbers from the array are: ");
        printPrimesFromArray(arr);
        scanner.close();
    }
    public static void printPrimesFromArray(int[] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            if(isPrime(arr[i]))
            {
                System.out.println(arr[i]);
            }
        }
    }
    public static boolean isPrime(int num)
    {
        for(int i=2; i<num/2; i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
    }
}
