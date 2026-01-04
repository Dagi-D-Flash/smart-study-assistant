package GeniusGuide_System;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class ResultTest {

    private Result result;

    @BeforeEach
    void setUp() {
        result = new Result();
    }

    @Test
    @DisplayName("Default fields should be null or zero")
    void testDefaultFields() {
        assertNull(getField(result, "grade"));
        assertFalse((boolean) getField(result, "passed"));
        assertEquals(0, getField(result, "resultId"));
        assertNull(getField(result, "m_QuizAttempt"));
    }

    @Test
    @DisplayName("generateResult returns a non-null string")
    void testGenerateResult() {
        String output = result.generateResult(80);
        assertNotNull(output);
    }

    // Helper method to access private fields
    private Object getField(Result res, String fieldName) {
        try {
            var field = Result.class.getDeclaredField(fieldName);
            field.setAccessible(true);
            return field.get(res);
        } catch (Exception e) {
            fail("Failed to access field: " + fieldName);
            return null;
        }
    }
}
