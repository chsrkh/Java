//Program to return a 4 digit random number
public class RandomNum 
{
    public static void main(String[] args)
    {
        int a=randomNum();
        System.out.println(a);
    }
    public static int randomNum()
    {
        int a=(int)(Math.random()*10000);
        return a;   
    }
    
}
