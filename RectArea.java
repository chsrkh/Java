// Program to return area of rectangle for user given length and breadth.
import java.util.Scanner;
public class RectArea 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int l=scanner.nextInt();
        int b=scanner.nextInt();
        int a=rarea(l,b);
        System.out.println("The area of the rectangle is " + a);
        scanner.close();
    }
    public static int rarea(int a, int b)
    {
        int area = a*b;
        return area;
    }
    
}
