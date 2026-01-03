package GeniusGuide_System;

public class AIRequest {

    private String question;
    private int requestId;
    public AIResponse m_AIResponse; // make sure AIResponse exists

    public AIRequest() {}

    // Removed deprecated finalize()

    public void sendRequest() {
        // placeholder for sending request
    }

    // Getters and setters (optional, useful for testing)
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public AIResponse getAIResponse() {
        return m_AIResponse;
    }

    public void setAIResponse(AIResponse m_AIResponse) {
        this.m_AIResponse = m_AIResponse;
    }
}
