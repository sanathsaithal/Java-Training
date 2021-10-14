class QuestionPaperException extends RuntimeException
{
	String message;
	
	QuestionPaperException(String message) {
		this.message=message;
	}
	
	@Override
	public String getMessage() {
		return message;
	}
}