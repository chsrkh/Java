// Program to print student grade for the user given marks m1,m2,m3.
package Java;
import java.util.Scanner;
public class StudentGrade 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int m1=sc.nextInt();
        int m2=sc.nextInt();
        int m3=sc.nextInt();
        int total=m1+m2+m3;
        int avg=total/3;
        if (avg>=90)
        System.out.println(" Grade : A");
        else if (avg>=80)
        System.out.println(" Grade : B");
        else if (avg>=70)
        System.out.println(" Grade : C");
        else if (avg>=60)
        System.out.println(" Grade : D");
        else if (avg>=50)
        System.out.println(" Grade : E");
        else if (avg>=40)
        System.out.println(" Grade : F");
        else 
        System.out.println(" Grade : Fail");
        sc.close();
    }

    
}
