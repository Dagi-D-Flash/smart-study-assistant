package GeniusGuide_System;


/**
 * @author dagim
 * @version 1.0
 * @created 28-Dec-2025 7:54:08 AM
 */
public class Question {

	private String correctAnswer;
	private int questionId;
	private String questionText;
	public Quiz m_Quiz;

	public Question(){

	}

	public void finalize() throws Throwable {

	}
	/**
	 * 
	 * @param answer
	 */
	public boolean validateAnswer(String answer){
		return false;
	}
}//end Question