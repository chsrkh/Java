// Program to check even or odd without if else statement
import java.util.Scanner;
// Program to check even or odd with the conditional operator
public class Even2
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
        
        boolean v=(n%2==0)?(true):(false);
        return v;
    }
    
}
