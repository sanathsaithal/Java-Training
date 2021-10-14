class PlaceException extends RuntimeException
{
	String message;
	
	PlaceException(String message) {
		this.message=message;
	}
	
	@Override
	public String getMessage() {
		return message;
	}
}