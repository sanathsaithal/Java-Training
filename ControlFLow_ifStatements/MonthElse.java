import java.util.*;
class MonthElse
{
public static void main(String []args)
{
int num;
Scanner sc=new Scanner(System.in);
System.out.println("enter number from 1-12");
num=sc.nextInt();
if(num==1)
System.out.println("january");
else if(num==2)
System.out.println("february");
else if(num==3)
System.out.println("march");
else if(num==4)
System.out.println("april");
else if(num==5)
System.out.println("may");
else if(num==6)
System.out.println("june");
else if(num==7)
System.out.println("july");
else if(num==8)
System.out.println("august");
else if(num==9)
System.out.println("september");
else if(num==10)
System.out.println("october");
else if(num==11)
System.out.println("november");
else if(num==12)
System.out.println("december");
else
System.out.println("enter valid number");
}
}