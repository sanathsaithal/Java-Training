class ResultException extends RuntimeException
{
	String message;
	
	ResultException(String message) {
		this.message=message;
	}
	
	@Override
	public String getMessage() {
		return message;
	}
}