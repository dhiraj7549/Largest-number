import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class largest {
   
    public static void main(String []arg)
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the a value  =");
        a=sc.nextInt();
        System.out.print("Enter the b value =");
        b=sc.nextInt();
        System.out.print("Enter the c value =");
        c=sc.nextInt();
        if(a>b&&a>c)
		{
            System.out.print("Largest number is  a ="+a);
        }
        else if(b>a&&b>c)
        {
            System.out.print("Largest number is b ="+b); 
        }
        else
        {
            System.out.print("Largest number is c ="+c);  
        }
        }
	}
