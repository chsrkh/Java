//Program to count the number of armstrong numbers in the user given range.
import java.util.Scanner;
public class CountOfArmstrongNumsInRange 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int s=countOfArmstrongNumsInRange(a,b);
        System.out.println("The number of all the armstrong numbers between " + a + " and " + b + " is " + s);
        scanner.close();
    }
    
    public static int countOfArmstrongNumsInRange(int a,int b)
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
            total=total+1; 
            }
            sum=0;
        }
        return total;


    }
}
