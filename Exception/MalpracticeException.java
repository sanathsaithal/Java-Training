class MalpracticeException extends Exception
{
	String message;
	
	MalpracticeException(String message) {
		this.message=message;
	}
	
	@Override
	public String getMessage() {
		return message;
	}
}