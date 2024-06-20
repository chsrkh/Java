package Java;
public class Patterns
{
    public static void main(String[] args)
    {
        rectanglePatter();
        hallowRectanglePattern();
        leftangleTrianglePattern();
        leftdownangleTrianglePattern();
        rightangleTrianglePattern();
        pyramidPattern();
    }
    public static void rectanglePatter()
    {
        for(int i=0;i<10;i++) 
        {   
            for(int j=0;j<10;j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    private static void hallowRectanglePattern()
    {
        System.out.println("\n\n");
        for(int i=0;i<10;i++) 
        {
            if(i==0 || i==9)
            for(int j=0;j<10;j++)
            {
                System.out.print(" * ");
            }
            else
            for(int j=0;j<10;j++)
            {
                if(j==0 || j==9)
                System.out.print(" * ");
                else
                System.out.print("   ");
            }
            System.out.println();
        }
    }
    public static void leftangleTrianglePattern()
    {
        System.out.println("\n\n");
        for(int i=0;i<10;i++) 
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void leftdownangleTrianglePattern()
    {
        System.out.println("\n\n");
        for(int i=0;i<10;i++) 
        {
            for(int j=0;j<10-i;j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void rightangleTrianglePattern()
    {
        System.out.println("\n\n");
        for(int i=0;i<10;i++) 
        {
            for(int j=0;j<10-i;j++)
            {
                System.out.print("   ");
            }
            for(int j=0;j<i;j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void pyramidPattern()
    {
        System.out.println("\n\n");
        for(int i=0;i<10;i++) 
        {
         
        
        }
        
    
    
    
    }
}
