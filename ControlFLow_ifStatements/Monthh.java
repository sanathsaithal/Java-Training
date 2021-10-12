import java.util.*;
class Monthh
{
public static void main(String []args)
{
int num;
Scanner sc=new Scanner(System.in);
System.out.println("enter number from 1-12");
num=sc.nextInt();
if(num==1)
System.out.println("january");
if(num==2)
System.out.println("february");
if(num==3)
System.out.println("march");
if(num==4)
System.out.println("april");
if(num==5)
System.out.println("may");
if(num==6)
System.out.println("june");
if(num==7)
System.out.println("july");
if(num==8)
System.out.println("august");
if(num==9)
System.out.println("september");
if(num==10)
System.out.println("october");
if(num==11)
System.out.println("november");
if(num==12)
System.out.println("december");
if(num>12)
System.out.println("enter valid number");
}
}