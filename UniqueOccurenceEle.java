package Java;
import java.util.Scanner;
public class UniqueOccurenceEle 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(isUniqueOccurencearray(arr));
        sc.close();


    }
    public static boolean isUniqueOccurencearray(int a[])
    {
        int b[]=new int[a.length];
        int k=0;
        for(int i=0;i<a.length;i++)
        {  
            int c=0;
            for(int j=0;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    c++;
                }
            }
            b[k++]=c;
        }
        for(int i=0;i<k;i++)
        {
            for(int j=i+1;j<k;j++)
            {
                if(b[i]==b[j])
                {
                    return false;
                }

            }
        }
        return true;


    }
    
}
