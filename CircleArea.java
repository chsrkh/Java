// Program to find area of circle for user given radius.
import java.util.Scanner;
public class CircleArea 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int r=scanner.nextInt();
        double a=carea(r);
        System.out.println("The area of the circle is " + a);
        scanner.close();
    }
    public static double carea(int a)
    {
        double area = 3.142*a*a;
        return area;
    }
    
}
