// Program to print palindromes from the given array o elements
import java.util.Scanner;
public class PalindromesFromArray 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<arr.length; i++)
        {
            arr[i]=sc.nextInt();
        }
        printPalindromesFromArray(arr);
        sc.close();

    }
    public static void printPalindromesFromArray(int[] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            if(isPalindrome(arr[i]))
            {
                System.out.println(arr[i]);
            }
        }
    }
    public static boolean isPalindrome(int num)
    {
        int temp=num;
        int rev=0;
        while(num>0)
        {
            rev=rev*10+num%10;
            num=num/10;
        }
        if(temp==rev)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
}
