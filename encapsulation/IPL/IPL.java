import java.util.*;
class IPL
{
	int num=0;
	TeamInfo[] team=new TeamInfo[num];
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		String ans;
		IPL ipl=new IPL();
		do
		{
			System.out.println("enter your choice\n 1. Insert \t 2. Display \t 3. Update \t 4. Exit");
			int choice=sc.nextInt();
			if(choice==1)
				ipl.setValue();
			else if(choice==2)
				ipl.getValue();
			else if(choice==3)
				ipl.update();
			else
				break;
			System.out.println("do u want to continue yes/no");
			ans=sc.next();
		}while(ans.equals("yes"));
	}
	
	void setValue()
	{
		System.out.println("enter no of team");
		num=sc.nextInt();
		team=new TeamInfo[num];
		for(int i=0;i<num;i++)
		{
			TeamInfo info=new TeamInfo();
					
			Scanner sc=new Scanner(System.in);
			System.out.println("enter team name");
			String teamName=sc.next();
			System.out.println("enter team captian");
			String captian=sc.next();
			System.out.println("enter team owner");
			String teamOwner=sc.next();
			System.out.println("enter no of wins");
			byte trophy=sc.nextByte();
					
			info.setTeamName(teamName);
			info.setCaptian(captian);
			info.setTeamOwner(teamOwner);
			info.setTrophy(trophy);
					
			team[i]=info;
		}
	}
	
	void getValue()
	{
		System.out.println("Team Name  Captian  Team Owner  Trophy");
		for(int i=0;i<num;i++)
		{
			TeamInfo info=team[i];
					
			String teamName=info.getTeamName();
			String captian=info.getCaptian();
			String teamOwner=info.getTeamOwner();
			byte trophy=info.getTrophy();
				
			System.out.println(teamName+"\t"+captian+"\t"+teamOwner+"\t"+trophy);
		}
	}
	
	void update()
	{
		boolean flag=false;
		System.out.println("enter team name to update");
		String tName=sc.next();
		for(int i=0;i<num;i++)
		{
			TeamInfo info=team[i];
			
			if(info.getTeamName().equals(tName))
			{
				System.out.println("enter updated wins");
				byte nTrophy=sc.nextByte();
				
				info.setTrophy(nTrophy);
				flag=true;
				break;
			}
			else{
				flag=false;
			}
		}
		if(flag==false)
		{
			System.out.println("team not found");
		}
	}		
}
	

		