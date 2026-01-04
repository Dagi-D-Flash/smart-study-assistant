package GeniusGuide_System;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class QuestionTest {

    private Question question;

    @BeforeEach
    void setUp() {
        question = new Question();
        question.setCorrectAnswer("Java");
    }

    @Test
    @DisplayName("Correct answer should return true")
    void testValidateAnswerCorrect() {
        assertTrue(question.validateAnswer("Java"));
    }

    @Test
    @DisplayName("Correct answer with different case should return true")
    void testValidateAnswerIgnoreCase() {
        assertTrue(question.validateAnswer("java"));
    }

    @Test
    @DisplayName("Incorrect answer should return false")
    void testValidateAnswerWrong() {
        assertFalse(question.validateAnswer("Python"));
    }

    @Test
    @DisplayName("Null answer should return false")
    void testValidateAnswerNull() {
        assertFalse(question.validateAnswer(null));
    }

    @Test
    @DisplayName("Default fields should be zero/null")
    void testDefaultValues() throws Exception {
        var idField = Question.class.getDeclaredField("questionId");
        idField.setAccessible(true);
        assertEquals(0, idField.getInt(question));

        var textField = Question.class.getDeclaredField("questionText");
        textField.setAccessible(true);
        assertNull(textField.get(question));
    }
}
