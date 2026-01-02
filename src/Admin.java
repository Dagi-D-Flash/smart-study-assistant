package GeniusGuide_System;


/**
 * @author dagim
 * @version 1.0
 * @created 28-Dec-2025 7:54:08 AM
 */
public class Admin extends User  {

	private int adminId;

	public Admin(){

	}

	public void finalize() throws Throwable {
		super.finalize();
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

	public void manageMaterials(){

	}

	public void manageQuizzes(){

	}

	public void manageUsers(){

	}

	/**
	 * 
	 * @param email
	 */
	public void resetPassword(String email){

	}
}//end Admin