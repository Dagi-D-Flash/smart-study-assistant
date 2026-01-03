package GeniusGuide_System;

public class Student extends User {

    private int studentId;
    private int totalPoints;
    public QuizAttempt m_QuizAttempt;
    public Streak m_Streak;
    public AIRequest m_AIRequest;
    public Leaderboard m_Leaderboard;

    public Student() {} // no-arg constructor

    // Remove finalize()

    public AIResponse askAIQuestion(String question) {
        return null; // placeholder
    }

    @Override
    public boolean login(String email, String password) {
        return false;
    }

    @Override
    public void logout() {}

    @Override
    public void resetPassword(String email) {}

    public QuizAttempt takeQuiz(int quizId) {
        return null;
    }

    public void viewDashboard() {}

    public void viewLeaderboard() {}
}
