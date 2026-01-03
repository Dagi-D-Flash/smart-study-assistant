import GeniusGuide_System.String;

/**
 * @author dagim
 * @version 1.0
 * @created 28-Dec-2025 7:54:09 AM
 */
public abstract class User  {

	private String email;
	private String fullName;
	private String password;
	private String role;
	private int userId;

	public User (){

	}

	public void finalize() throws Throwable {

	}
	/**
	 * 
	 * @param email
	 * @param password
	 */
	public boolean login(String email, String password){
		return false;
	}

	public void logout(){

	}

	/**
	 * 
	 * @param email
	 */
	public void resetPassword(String email){

	}
}//end User 