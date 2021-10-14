public class AgeException extends Exception
{
	String message;
	
	AgeException(String message) {
	this.message=message;
	}
	
	@Override
	public String getMessage(){
	return message;
	}
}