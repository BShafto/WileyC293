package LargestOf3ExceptionHandlingProjectDay6;

public class LargestOf3NegativeException extends Exception{

	private String errorCode;
	
	public LargestOf3NegativeException(String errorCode) {
		this.setErrorCode(errorCode);
	}
	
	public String getErrorCode() {
		return errorCode;
	}
	
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
}
