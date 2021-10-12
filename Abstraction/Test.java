class Test
{
	public static void main(String[] args)
	{
		Games games=new Cricket();
		
		//games.setBowling();
		//games.setBatting();
		games.where();
		
		Cricket cricket=(Cricket)games;
		cricket.where();
		
	}
}