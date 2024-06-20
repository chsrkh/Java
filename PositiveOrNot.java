package Java;
import java.util.Scanner;
public class PositiveOrNot 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        boolean y=positiveOrNot(x);
        System.out.println(y);
        sc.close();
        
    }
    public static boolean positiveOrNot(int x)
    {
        if(x>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
}
