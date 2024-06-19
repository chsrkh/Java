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
        int j=0,ele=0;
        int n[]=new int[a.length];
        for(int i=0;i<a.length;i++)
        {
            int c=0;
            for(int k=i+1;k<a.length;k++)
            {
                if(a[i]==a[k])
                c++;
            }
            n[j++] = c;
            
        }
            int m[] = new int[j+1];
            int x=0;
            for(int k=0;k<j;k++)
            {   
                int count=0;
                for(int i=k+1;i<n.length;i++)
                {
                    if (n[k]==n[i])
                    count++;
                }
                if (count==0)
                m[x++]=n[k];
            }
            int max=m[0];
            for (int i=1;i<m.length;i++)
            {
                if(m[i]>=max)
                max=m[i];
            }
            for (int i=0;i<a.length;i++)
            {
                int c=0;
                for (int k=0;k<a.length;k++)
                {
                    if(a[i]==a[k])
                    c++;
                }
                if (c==max)

                ele=a[i];
            }



        return ele;

    }    
}
