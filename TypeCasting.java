// Program to implement verious type casting values
public class Typecasting 
{
    public static void main(String[] args)
    {
        int a=54;
        double b=49.5;
        char c='A';

        int x= (int)b;
        int y= (int)c;
        double m=a;
        char c2=(char)a;
        char c3=(char)b;
        System.out.println("Given integer value: " + a);
        System.out.println("Given double value: " + b);
        System.out.println("Given character value: " + c);
        System.out.println("Given double value after typecasting into int: " + x);
        System.out.println("Given character value after typecasting into int: " +y);
        System.out.println("Given integer value after typecasting into double: " + m);
        System.out.println("Given integer value after typecasting into char: " + c2);
        System.out.println("Given double value after typecasting into char: " + c3);
    }
    
    
}
