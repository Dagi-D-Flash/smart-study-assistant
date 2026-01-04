package GeniusGuide_System;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class AdminTest {

    private Admin admin;

    @BeforeEach
    void setUp() {
        admin = new Admin();
    }

    @Test
    @DisplayName("Admin should login successfully with valid credentials")
    void testLoginSuccess() {
        assertTrue(admin.login("admin@mail.com", "password"));
        assertTrue(admin.isLoggedIn());
    }

    @Test
    @DisplayName("Admin login should fail with null credentials")
    void testLoginFailure() {
        assertFalse(admin.login(null, null));
        assertFalse(admin.isLoggedIn());
    }

    @Test
    @DisplayName("Logout should reset login state")
    void testLogout() {
        admin.login("admin@mail.com", "password");
        admin.logout();
        assertFalse(admin.isLoggedIn());
    }

    @Test
    @DisplayName("Managing users without login should throw exception")
    void testManageUsersWithoutLogin() {
        assertThrows(IllegalStateException.class, admin::manageUsers);
    }

    @Test
    @DisplayName("Managing quizzes after login should not throw exception")
    void testManageQuizzesAfterLogin() {
        admin.login("admin@mail.com", "password");
        assertDoesNotThrow(() -> admin.manageQuizzes());
    }

    @Test
    @DisplayName("Reset password with null email should throw exception")
    void testResetPasswordNull() {
        assertThrows(IllegalArgumentException.class, () -> admin.resetPassword(null));
    }

    @Test
    @DisplayName("Admin ID setter and getter should work")
    void testAdminIdSetterGetter() {
        admin.setAdminId(10);
        assertEquals(10, admin.getAdminId());
    }
}
