class HallTicketException extends Exception
{
	String message;
	
	HallTicketException(String message) {
	this.message=message;
	}
	
	@Override
	public String getMessage(){
	return message;
	}
}