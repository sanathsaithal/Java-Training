class Cricket
{
public static void main(String args[])
{
Teamm t=new Teamm();

System.out.println("team name"+t.teamName);
System.out.println("captian"+t.captian);
System.out.println("owner"+t.owner);
System.out.println("total game"+t.totalGame);
System.out.println("wins"+t.win);
System.out.println("lost"+t.lose);

t.getValue();
t.display();

t.teamName="sam";
t.captian="sanath";
t.owner="ddd";
t.totalGame=10;
t.win=3;
t.lose=45;

System.out.println("team name"+t.teamName);
System.out.println("captian"+t.captian);
System.out.println("owner"+t.owner);
System.out.println("total game"+t.totalGame);
System.out.println("wins"+t.win);
System.out.println("lost"+t.lose);

}
}