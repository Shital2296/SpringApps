package in.shital.exception;

public class UserNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4565841404507401620L;
	
	public UserNotFoundException() {
	
	}
	
	public UserNotFoundException(String msg) {
		super(msg);
	}

}

//User Defined Exception class