package GeniusGuide_System;

import java.util.ArrayList;
import java.util.List;

public class Quiz {

    private int quizId;
    private String title;
    private int totalMarks;
    private List<Question> questions;

    public Quiz() {
        this.questions = new ArrayList<>();
        this.totalMarks = 0;
    }

    public void addQuestion(Question question) {
        if (question == null) {
            throw new IllegalArgumentException("Question cannot be null");
        }
        questions.add(question);
        totalMarks += 1; // simple rule: each question = 1 mark
    }

    public int calculateTotalMarks() {
        return totalMarks;
    }

    // Getters & setters (needed for testing)
    public int getQuizId() {
        return quizId;
    }

    public void setQuizId(int quizId) {
        this.quizId = quizId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getQuestionCount() {
        return questions.size();
    }
}
