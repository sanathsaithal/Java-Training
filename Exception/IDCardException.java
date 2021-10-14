class IDCardException extends Exception
{
	String message;
	
	IDCardException(String message) {
		this.message=message;
	}
	
	@Override
	public String getMessage() {
		return message;
	}
}