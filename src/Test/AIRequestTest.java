package GeniusGuide_System;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class AIRequestTest {

    private AIRequest aiRequest;

    @BeforeEach
    void setUp() {
        aiRequest = new AIRequest();
    }

    @Test
    @DisplayName("Default fields should be null/zero")
    void testDefaultFields() throws Exception {
        var question = AIRequest.class.getDeclaredField("question");
        question.setAccessible(true);
        assertNull(question.get(aiRequest));

        var requestId = AIRequest.class.getDeclaredField("requestId");
        requestId.setAccessible(true);
        assertEquals(0, requestId.get(aiRequest));

        var response = AIRequest.class.getDeclaredField("m_AIResponse");
        response.setAccessible(true);
        assertNull(response.get(aiRequest));
    }

    @Test
    @DisplayName("sendRequest should not throw exception")
    void testSendRequest() {
        assertDoesNotThrow(() -> aiRequest.sendRequest());
    }

    @Test
    @DisplayName("Setters and getters work correctly")
    void testSettersAndGetters() {
        AIResponse response = new AIResponse();
        aiRequest.setQuestion("What is AI?");
        aiRequest.setRequestId(10);
        aiRequest.setAIResponse(response);

        assertEquals("What is AI?", aiRequest.getQuestion());
        assertEquals(10, aiRequest.getRequestId());
        assertEquals(response, aiRequest.getAIResponse());
    }
}
