// Program to check given number is even or odd without using % operator 
package Java;
import java.util.Scanner;
// Program to check even or odd without % operator
public class Even1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean x=evenOrOdd(n);
        System.out.println(x);
        sc.close();
    }
    public static boolean evenOrOdd(int n)
    {
        return (n&1)==0;
    }
    
}
