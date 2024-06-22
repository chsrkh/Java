//Program to find sum of the armstrong nums in the user given range.
import java.util.Scanner;
public class SumOfArmstrongNumsInRange 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int s=sumOfArmstrongNumsInRange(a,b);
        System.out.println("The sum of all the armstrong numbers between " + a + " and " + b + " is " + s);
        scanner.close();
    }
    
    public static int sumOfArmstrongNumsInRange(int a,int b)
    {
        double sum=0;
        int total=0;
        for(int i=a;i<=b;i++)
        {
            int temp=i;
            int temp1=temp;
            int d=0;
            
            while (temp1>0)
            {
                d++;
                temp1=temp1/10;

                
            }
            while(temp!=0)
            {
                int rem=temp%10;
                sum=sum+Math.pow(rem,d);
                temp=temp/10;
            }
            if((int)sum==i)
            {
            total=total+i;    
            }
            sum=0;
        }
        return total;


    }
}
