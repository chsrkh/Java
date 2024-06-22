//Program to print Armstrong numbers in the user given range
import java.util.Scanner;
public class ArmstrongNumsInRange 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        armstrongNumsInRange(a,b);
        scanner.close();
    }
    
    public static void armstrongNumsInRange(int a,int b)
    {
        double sum=0;
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
                System.out.println(i);
            }
            sum=0;
        }


    }
}
