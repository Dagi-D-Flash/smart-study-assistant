package GeniusGuide_System;


/**
 * @author dagim
 * @version 1.0
 * @created 28-Dec-2025 7:54:09 AM
 */
public class Student extends User  {

	private int studentId;
	private int totalPoints;
	public QuizAttempt m_QuizAttempt;
	public Streak m_Streak;
	public AIRequest m_AIRequest;
	public Leaderboard m_Leaderboard;

	public Student(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
	/**
	 * 
	 * @param question
	 */
	public AIResponse askAIQuestion(String question){
		return null;
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

	/**
	 * 
	 * @param quizId
	 */
	public QuizAttempt takeQuiz(int quizId){
		return null;
	}

	public void viewDashboard(){

	}

	public void viewLeaderboard(){

	}
}//end Student