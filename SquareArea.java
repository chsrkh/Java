// Program to return area of square for the user given side value.
import java.util.Scanner;
public class SquareArea 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int s=scanner.nextInt();
        int as=sarea(s);
        System.out.println("The area of the square is " + as);
    }
    public static sarea(int s)
    {
        int area = s*s;
        return area;
    }
    
}
