package GeniusGuide_System;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class NotificationTest {

    private Notification notification;

    @BeforeEach
    void setUp() {
        notification = new Notification();
    }

    @Test
    @DisplayName("Send notification should not throw exceptions")
    void testSendNotification() {
        assertDoesNotThrow(() -> notification.sendNotification());
    }

    @Test
    @DisplayName("Default fields should be null")
    void testDefaultFields() {
        assertNull(getField(notification, "message"));
        assertNull(getField(notification, "sentDate"));
        assertNull(getField(notification, "m_User"));
        assertEquals(0, getField(notification, "notificationId"));
    }

    // Helper method to access private fields
    private Object getField(Notification notif, String fieldName) {
        try {
            var field = Notification.class.getDeclaredField(fieldName);
            field.setAccessible(true);
            return field.get(notif);
        } catch (Exception e) {
            fail("Failed to access field: " + fieldName);
            return null;
        }
    }
}
