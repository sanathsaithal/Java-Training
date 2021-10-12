import java.util.*;
class Day
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String[] days={"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
int n;
System.out.println("enter number between 1-7");
n=sc.nextInt();
System.out.println(days[n-1]);
}
}