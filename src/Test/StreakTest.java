package GeniusGuide_System;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;

class StreakTest {

    private Streak streak;

    @BeforeEach
    void setUp() {
        streak = new Streak();
    }

    @Test
    @DisplayName("Default fields should be zero or null")
    void testDefaultFields() {
        assertEquals(0, getField(streak, "currentStreak"));
        assertNull(getField(streak, "lastActiveDate"));
        assertEquals(0, getField(streak, "streakId"));
    }

    @Test
    @DisplayName("updateStreak should not throw exception")
    void testUpdateStreak() {
        assertDoesNotThrow(() -> streak.updateStreak());
    }

    // Helper method to access private fields
    private Object getField(Streak s, String fieldName) {
        try {
            var field = Streak.class.getDeclaredField(fieldName);
            field.setAccessible(true);
            return field.get(s);
        } catch (Exception e) {
            fail("Failed to access field: " + fieldName);
            return null;
        }
    }
}
