import java.util.*;
class Exam
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		Exam exam=new Exam();
		exam.ageException();
		exam.hallTicketException();
		exam.malpracticeException();
		exam.iDCardException();
		exam.placeException();
		exam.questionPaperException();
		exam.paperSubmitException();
		exam.resultException();
	}
	
	void ageException()
	{
	System.out.println("enter age");
		int age=sc.nextInt();
		try{
			if(age>18) {
				System.out.println("elegible to write exam");
			}
			else {
				throw new AgeException("not eligible");
			}
		}
		catch(AgeException e) {
			System.err.print(e.getMessage());
		}
	}
	
	void hallTicketException()
	{
		sc.nextLine();
		System.out.println("check for hall ticket");
		String check=sc.nextLine();
		try{
			if(check.equals("yes"))
			{
				System.out.println("allow to write exam");
			}
			else {
				throw new HallTicketException("not eligible");
			}
		}
		catch(HallTicketException e)
		{
			System.err.println(e.getMessage());
		}
	}
	
	void malpracticeException()
	{
		System.out.println("check for malpractice yes/no");
		String checkm=sc.nextLine();
		try{
			if(checkm.equals("no"))
			{
				System.out.println("let him complete exam");
			}
			else {
				throw new MalpracticeException("suspend him");
			}
		}
		catch(MalpracticeException e)
		{
			System.err.print(e.getMessage());
		}
	}
	
	void iDCardException()
	{
		System.out.println("check for ID cards yes/no");
		String checki=sc.nextLine();
		try{
			if(checki.equals("yes"))
			{
				System.out.println("let him to write exam");
			}
			else {
				throw new IDCardException("collect finr amd let him to write");
			}
		}
		catch(IDCardException e)
		{
			System.err.print(e.getMessage());
		}
	}
	
	void placeException()
	{
		System.out.println("check student is in his place yes/no");
		String checkp=sc.nextLine();
		try{
			if(checkp.equals("yes"))
			{
				System.out.println("let him to write exam");
			}
			else {
				throw new PlaceException("send him tp his respective place");
			}
		}
		catch(PlaceException e)
		{
			System.err.print(e.getMessage());
		}
	}
	
	void questionPaperException()
	{
		System.out.println("check student wrote anything in questionpaper yes/no");
		String checkq=sc.nextLine();
		try{
			if(checkq.equals("no"))
			{
				System.out.println("let him write exam");
			}
			else {
				throw new QuestionPaperException("give warning");
			}
		}
		catch(QuestionPaperException e)
		{
			System.err.print(e.getMessage());
		}
	}
	
	void paperSubmitException()
	{
		System.out.println("check student submitted answer sheets yes/no");
		String checka=sc.nextLine();
		try{
			if(checka.equals("yes"))
			{
				System.out.println("let him go from exam hall");
			}
			else {
				throw new PaperSubmitException("dont let him go out");
			}
		}
		catch(PaperSubmitException e)
		{
			System.err.print(e.getMessage());
		}
	}
	
	void resultException()
	{
		System.out.println("Student result pass/fail");
		String checkr=sc.nextLine();
		try{
			if(checkr.equals("pass"))
			{
				System.out.println("let him enjoy holidays");
			}
			else {
				throw new ResultException("let him attend suplimentary classes");
			}
		}
		catch(ResultException e)
		{
			System.err.print(e.getMessage());
		}
	}
}
				