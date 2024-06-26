//Program to find and print roots of quadratic equation for the user given a,b,c values
import java.util.Scanner;
public class RootsOfQuadratcEqn 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a=sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b=sc.nextInt();
        System.out.println("Enter the value of c: ");
        int c=sc.nextInt();
        double d=b*b-4*a*c;
        if(d>0)
        {
            double x1=(-b+Math.sqrt(d))/(2*a);
            double x2=(-b-Math.sqrt(d))/(2*a);
            System.out.println("The roots are: "+x1+" and "+x2);
        }
        else if(d==0)
        {
            double x1=(-b+Math.sqrt(d))/(2*a);
            System.out.println("The root is: "+x1);
        }
        else
        {
            System.out.println("The roots are imaginary");
        }
        sc.close();

    }
    
}
