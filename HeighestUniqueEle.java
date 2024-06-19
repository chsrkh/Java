package Java;
import java.util.Scanner;
public class HeighestUniqueEle
{
    public static void main(String[] args) 
    {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int a[]=new int[n];
     for(int i=0;i<n;i++)
     a[i]=sc.nextInt();
     int ele=heighestUniqueEle(a);
     System.out.println("The heighest unique element is: "+ele);
     sc.close();
    }
    public static int heighestUniqueEle(int a[])
    {
        int ele=0;
        int j=0;
        for(int i=0;i<a.length;i++)
        {
            for(int k=0;j<a.length;j++)
            {

            }






        return ele;

    }    
}
