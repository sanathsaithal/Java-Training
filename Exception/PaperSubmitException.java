class PaperSubmitException extends RuntimeException
{
	String message;
	
	PaperSubmitException(String message) {
		this.message=message;
	}
	
	@Override
	public String getMessage() {
		return message;
	}
}