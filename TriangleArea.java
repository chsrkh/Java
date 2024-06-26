// Program to return the area of triangle for user given length and breadth.
import java.util.Scanner;
public class TriangleArea 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int b=scanner.nextInt();
        int h=scanner.nextInt();
        double a=tarea(b,h);
        System.out.println("The area of the traingle is " + a);
        scanner.close();
    }
    public static double tarea(int a, int b)
    {
        double area = 0.5*a*b;
        return area;
    }
    
}
