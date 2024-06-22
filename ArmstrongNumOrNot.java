// Program to check given number is Armstrong number or not.
import java.util.Scanner;
public class ArmstrongNumOrNot 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        boolean result=armstrong(num);
        if(result==true)
        System.out.println(num+" is an armstrong number");
        else
        System.out.println(num+" is not an armstrong number");
        sc.close();
        
    }
    public static boolean armstrong(int num)
    {
        int temp1=num;
        int temp=temp1;
        double sum=0;
        int d=0;
        while (temp1>0) 
        {
            d++;
            temp1=temp1/10;            
        }

        while(num>0)
        {
            int rem=num%10;
            sum=sum+Math.pow(rem,d);
            num=num/10;
        }
        if(temp==sum)
        return true;
        else
        return false;
        
    }
    
}

