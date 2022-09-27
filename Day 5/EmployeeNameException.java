package EmployeeAssignmentDay5;

public class EmployeeNameException extends RuntimeException {

	private String errorCode;
		
	public EmployeeNameException(String errorCode) {
		//super(message);
		this.setErrorCode(errorCode);
	}
	
	public String getErrorCode() {
		return errorCode;
	}
	
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	

}
