import java.util.*;
class ArrayException
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		String choice;
		ArrayException aa=new ArrayException();
		
		do {
			System.out.println("enter choice 1. StackOverfolw 2. Array Exception 3. String Exception 4. Input missmatch 5. NullPointer  6. Arithmatic Exception  7. Number Exception");
			int ch=sc.nextInt();
			if(ch==1)
			{
				sc.nextLine();
				System.out.println("enter name");
				String name=sc.nextLine();
				aa.stackOverfolw(name);
				
			}
			else if(ch==2)
			{
				aa.ArrayExceptionn();
				
			}
			else if(ch==3)
			{
				sc.nextLine();
				System.out.println("enter a string");
				String str=sc.nextLine();
				System.out.println("enter substring");
				int substr=sc.nextInt();
				aa.stringOutOfBound(str,substr);
			}
			else if(ch==4)
			{
				aa.inputMissmatch();
			}
			
			else if(ch==5)
			{
				aa.nullPointer();
			}
			else if(ch==6)
			{
				sc.nextLine();
				System.out.println("enter a number");
				int b=sc.nextInt();
				aa.arithmaticException(b);
			}
			else if(ch==7)
			{
				sc.nextLine();
				System.out.println("enter name");
				String name=sc.nextLine();
				aa.numberFormat(name);
			}
			System.out.println("continue");
			choice=sc.next();
		}
			while(choice.equals("yes"));
	}
	
	void stackOverfolw(String name)
	{
		try
		{
		System.out.println(name);
		stackOverfolw(name);
		}
		catch(StackOverflowError e)
		{
		System.out.println(e);
		}
	}
	
	void ArrayExceptionn()
	{
		try{
		String[] name={"sanath","sam","ram","sita"};
		System.out.println(name[5]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
	}
	
	void stringOutOfBound(String str,int substr)
	{
		try{
		System.out.println(str.length());
		System.out.println(str.substring(substr));
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
	}
	
	void inputMissmatch()
	{
		try{
		System.out.println("enter name");
		int name=sc.nextInt();
		}
		catch(InputMismatchException e)
		{
			System.out.println(e);
		}
	}
	
	void nullPointer()
	{
		try{
		String name=null;
		System.out.println(name.toString());
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
	}
	
	int arithmaticException(int b)
	{
		int a=0;
		try{
		a=b/0;
		System.out.println(a);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}return 0;
	}
	
	void numberFormat(String name)
	{
		try{
		System.out.println(name);
		int b=Integer.parseInt(name);
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}
	}
}
