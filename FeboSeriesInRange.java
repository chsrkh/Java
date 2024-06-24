//Program to print fibonacci series in between the user given range.
import java.util.Scanner;
public class FeboSeriesInRange 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        feboSeriesInRange(a, b);
        scanner.close();
        
    }
    public static void feboSeriesInRange(int a,int b)
    {
        int x=0, y=1;
        int z=0;
        if (a < 0)
            System.out.println(" No febo series in negative range ");
        else if(a==0)
        {
            System.out.print(x+"  "+y+"  ");
            while (z<=b)
            {
                z=x+y;
                System.out.print(z+"  ");
                x=y;
                y=z;
            }
        }
        else if(a==1)
        {
            System.out.print(y+"  ");
            while (z<=b) 
            {
                z=x+y;
                System.out.print(z+"  ");
                x=y;
                y=z;
            }
        }
        else 
        {
            while (true)  
            {
                z=x+y;
                if(z>=a && z<=b) 
                System.out.print(z+"  ");
                x=y;
                y=z;
                if(z>b)
                break;
            }
        }



    }
    
}
