package GeniusGuide_System;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    private Student student;

    @BeforeEach
    void setUp() {
        student = new Student();
    }

    @Test
    @DisplayName("Default fields should be zero or null")
    void testDefaultFields() {
        assertEquals(0, getField(student, "studentId"));
        assertEquals(0, getField(student, "totalPoints"));
        assertNull(getField(student, "m_QuizAttempt"));
        assertNull(getField(student, "m_Streak"));
        assertNull(getField(student, "m_AIRequest"));
        assertNull(getField(student, "m_Leaderboard"));
    }

    @Test
    @DisplayName("login should return false by default")
    void testLogin() {
        assertFalse(student.login("test@example.com", "password"));
    }

    @Test
    @DisplayName("logout should not throw exception")
    void testLogout() {
        assertDoesNotThrow(() -> student.logout());
    }

    @Test
    @DisplayName("resetPassword should not throw exception")
    void testResetPassword() {
        assertDoesNotThrow(() -> student.resetPassword("test@example.com"));
    }

    @Test
    @DisplayName("askAIQuestion returns null by default")
    void testAskAIQuestion() {
        assertNull(student.askAIQuestion("What is Java?"));
    }

    @Test
    @DisplayName("takeQuiz returns null by default")
    void testTakeQuiz() {
        assertNull(student.takeQuiz(1));
    }

    // Helper method to access private fields
    private Object getField(Student s, String fieldName) {
        try {
            var field = Student.class.getDeclaredField(fieldName);
            field.setAccessible(true);
            return field.get(s);
        } catch (Exception e) {
            fail("Failed to access field: " + fieldName);
            return null;
        }
    }
}
