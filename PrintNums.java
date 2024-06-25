//Program to print numbers from 1 to 10 using different loops in Java
public class PrintNums 
{
    public static void main(String[] args)
    {
        System.out.println("\nUsing While Loop:");
        usingWhileLoop();
        System.out.println("\n\nUsing Do While Loop:");
        usingDoWhileLoop();
        System.out.println("\n\nUsing For Loop:");
        usingForLoop();

    }
    public static void usingWhileLoop()
    {
        int i=1;
        while(i<=10)
        {
            System.out.print(i+"  ");
            i++;
        }

    }
    public static void usingDoWhileLoop()
    {
        int i=1;
        do
        {
            System.out.print(i+"  ");
            i++;
        }while(i<=10);


    }
    public static void usingForLoop()
    {
        for(int i=1; i<=10; i++)
        {
            System.out.print(i+"  ");
        }
    }
    
}
