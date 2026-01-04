package GeniusGuide_System;

public class Question {

    private String correctAnswer;
    private int questionId;
    private String questionText;
    public Quiz m_Quiz; // kept as-is (association)

    public Question() {}

    // Business logic
    public boolean validateAnswer(String answer) {
        if (correctAnswer == null || answer == null) {
            return false;
        }
        return correctAnswer.equalsIgnoreCase(answer.trim());
    }

    // Getters & setters (needed for testing)
    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }
}
