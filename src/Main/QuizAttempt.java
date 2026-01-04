package GeniusGuide_System;

import java.util.Date;

public class QuizAttempt {

    private Date attemptDate;
    private int attemptId;
    private int score;

    public QuizAttempt() {}

    // Removed deprecated finalize()

    public int calculateScore() {
        return 0; // placeholder
    }

    // Getters and setters (optional, for testing or future use)
    public Date getAttemptDate() {
        return attemptDate;
    }

    public void setAttemptDate(Date attemptDate) {
        this.attemptDate = attemptDate;
    }

    public int getAttemptId() {
        return attemptId;
    }

    public void setAttemptId(int attemptId) {
        this.attemptId = attemptId;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
