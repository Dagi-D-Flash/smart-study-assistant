package GeniusGuide_System;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class AIResponseTest {

    private AIResponse aiResponse;

    @BeforeEach
    void setUp() {
        aiResponse = new AIResponse();
    }

    @Test
    @DisplayName("Default fields should be null/zero")
    void testDefaultFields() throws Exception {
        var answer = AIResponse.class.getDeclaredField("answer");
        answer.setAccessible(true);
        assertNull(answer.get(aiResponse));

        var responseId = AIResponse.class.getDeclaredField("responseId");
        responseId.setAccessible(true);
        assertEquals(0, responseId.get(aiResponse));
    }

    @Test
    @DisplayName("getResponse should return the answer")
    void testGetResponse() {
        aiResponse.setResponse("AI Answer");
        assertEquals("AI Answer", aiResponse.getResponse());
    }

    @Test
    @DisplayName("Setters and getters work correctly")
    void testSettersAndGetters() {
        aiResponse.setResponse("Test Answer");
        aiResponse.setResponseId(100);

        assertEquals("Test Answer", aiResponse.getResponse());
        assertEquals(100, aiResponse.getResponseId());
    }
}
