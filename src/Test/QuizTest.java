package GeniusGuide_System;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class QuizTest {

    private Quiz quiz;
    private Question question;

    @BeforeEach
    void setUp() {
        quiz = new Quiz();
        question = new Question();
        question.setCorrectAnswer("A");
    }

    @Test
    @DisplayName("New quiz should have zero total marks")
    void testInitialTotalMarks() {
        assertEquals(0, quiz.calculateTotalMarks());
    }

    @Test
    @DisplayName("Adding a question should increase total marks")
    void testAddQuestionIncreasesMarks() {
        quiz.addQuestion(question);
        assertEquals(1, quiz.calculateTotalMarks());
    }

    @Test
    @DisplayName("Question count should increase when question is added")
    void testQuestionCount() {
        quiz.addQuestion(question);
        quiz.addQuestion(new Question());
        assertEquals(2, quiz.getQuestionCount());
    }

    @Test
    @DisplayName("Adding null question should throw exception")
    void testAddNullQuestion() {
        assertThrows(IllegalArgumentException.class, () -> quiz.addQuestion(null));
    }

    @Test
    @DisplayName("Quiz ID setter and getter should work")
    void testQuizIdSetterGetter() {
        quiz.setQuizId(5);
        assertEquals(5, quiz.getQuizId());
    }

    @Test
    @DisplayName("Quiz title setter and getter should work")
    void testQuizTitleSetterGetter() {
        quiz.setTitle("Mid Exam");
        assertEquals("Mid Exam", quiz.getTitle());
    }
}
