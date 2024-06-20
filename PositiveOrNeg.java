package Java;
import java.util.Scanner;
public class PositiveOrOdd
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        String y=positiveOrOdd(x);
        System.out.println(y);
        sc.close();
        
    }
    public static String positiveOrOdd(int x)
    {
        if(x>0)
        {
            return "Positive";
        }
        else
        {
            return "Negative";
        }
    }
    
}
