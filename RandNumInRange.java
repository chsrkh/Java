// Program to print random number in the user given range.

import java.util.Scanner;
public class RandNumInRange 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.println("Random number in the range:" + randnum(a,b));
        s.close();

    }
    public static int randnum(int a, int b)
    {
        int randnum = (int)(Math.random()*(b-a+1)+a);
        System.out.println(randnum);
        return randnum;
    }
    
}
