import java.util.*;
class OddEven
{
public static void main(String[] args)
{
byte num;
Scanner sc=new Scanner(System.in);
System.out.println("enter number to check even or odd");
num=sc.nextByte();
if(num%2==0)
{
System.out.println("even");
}
else
{
System.out.println("odd");
}
}
}
