package EmployeeAssignmentDay5;

public class EmployeeAgeException extends Exception {

private String errorCode;
		
	public EmployeeAgeException(String errorCode) {
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
