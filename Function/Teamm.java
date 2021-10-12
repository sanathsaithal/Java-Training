import java.util.*;
class Teamm
{
String teamName;
String captian;
String owner;
byte totalGame;
byte win;
byte lose;

void getValue()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter team name");
teamName=sc.next();
System.out.println("enter captian name");
captian=sc.next();
System.out.println("enter owner name");
owner=sc.next();
System.out.println("enter total game");
totalGame=sc.nextByte();
System.out.println("enter win");
win=sc.nextByte();
System.out.println("enter lose");
lose=sc.nextByte();
}
void display()
{
System.out.println("team name"+teamName);
System.out.println("captian"+captian);
System.out.println("owner"+owner);
System.out.println("total game"+totalGame);
System.out.println("wins"+win);
System.out.println("lost"+lose);
}
}