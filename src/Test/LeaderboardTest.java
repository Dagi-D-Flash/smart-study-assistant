package GeniusGuide_System;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class LeaderboardTest {

    private Leaderboard leaderboard;
    private Student mockStudent;

    @BeforeEach
    void setUp() {
        leaderboard = new Leaderboard();
        mockStudent = new Student(); // use the real Student class
    }

    @Test
    @DisplayName("Update ranking should execute without exceptions")
    void testUpdateRanking() {
        assertDoesNotThrow(() -> leaderboard.updateRanking(mockStudent));
    }

    @Test
    @DisplayName("Default leaderboard ID should be zero")
    void testDefaultLeaderboardId() {
        assertEquals(0, getField(leaderboard, "leaderboardId"));
    }

    // Helper method to access private fields
    private int getField(Leaderboard lb, String fieldName) {
        try {
            var field = Leaderboard.class.getDeclaredField(fieldName);
            field.setAccessible(true);
            return field.getInt(lb);
        } catch (Exception e) {
            fail("Failed to access field: " + fieldName);
            return -1;
        }
    }
}
