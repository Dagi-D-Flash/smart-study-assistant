package GeniusGuide_System;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;

class QuizAttemptTest {

    private QuizAttempt quizAttempt;

    @BeforeEach
    void setUp() {
        quizAttempt = new QuizAttempt();
    }

    @Test
    @DisplayName("Default fields should be null or zero")
    void testDefaultFields() throws Exception {
        var attemptDate = QuizAttempt.class.getDeclaredField("attemptDate");
        attemptDate.setAccessible(true);
        assertNull(attemptDate.get(quizAttempt));

        var attemptId = QuizAttempt.class.getDeclaredField("attemptId");
        attemptId.setAccessible(true);
        assertEquals(0, attemptId.get(quizAttempt));

        var score = QuizAttempt.class.getDeclaredField("score");
        score.setAccessible(true);
        assertEquals(0, score.get(quizAttempt));
    }

    @Test
    @DisplayName("calculateScore returns an integer")
    void testCalculateScore() {
        int result = quizAttempt.calculateScore();
        assertEquals(0, result);
    }

    @Test
    @DisplayName("Setters and getters work correctly")
    void testSettersAndGetters() {
        Date date = new Date();
        quizAttempt.setAttemptDate(date);
        quizAttempt.setAttemptId(101);
        quizAttempt.setScore(95);

        assertEquals(date, quizAttempt.getAttemptDate());
        assertEquals(101, quizAttempt.getAttemptId());
        assertEquals(95, quizAttempt.getScore());
    }
}
