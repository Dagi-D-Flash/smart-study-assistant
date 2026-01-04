package GeniusGuide_System;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    private User testUser;

    @BeforeEach
    void setUp() {
        // Anonymous subclass since User is abstract
        testUser = new User() {};
    }

    @Test
    @DisplayName("Login should return false by default")
    void testLogin() {
        assertFalse(testUser.login("test@example.com", "password"));
    }

    @Test
    @DisplayName("Logout should execute without exceptions")
    void testLogout() {
        assertDoesNotThrow(() -> testUser.logout());
    }

    @Test
    @DisplayName("Reset password should execute without exceptions")
    void testResetPassword() {
        assertDoesNotThrow(() -> testUser.resetPassword("test@example.com"));
    }

    @Test
    @DisplayName("Default user fields should be null or zero")
    void testDefaultFields() {
        assertNull(getField(testUser, "email"));
        assertNull(getField(testUser, "fullName"));
        assertNull(getField(testUser, "password"));
        assertNull(getField(testUser, "role"));
        assertEquals(0, getField(testUser, "userId"));
    }

    // Helper method to access private fields
    private Object getField(User user, String fieldName) {
        try {
            var field = User.class.getDeclaredField(fieldName);
            field.setAccessible(true);
            return field.get(user);
        } catch (Exception e) {
            fail("Failed to access field: " + fieldName);
            return null;
        }
    }
}
