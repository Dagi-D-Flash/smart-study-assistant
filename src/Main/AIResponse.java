package GeniusGuide_System;

public class AIResponse {

    private String answer;
    private int responseId;

    public AIResponse() {}

    // Removed deprecated finalize()

    public String getResponse() {
        return answer; // return the actual answer field
    }

    public void setResponse(String answer) {
        this.answer = answer;
    }

    public int getResponseId() {
        return responseId;
    }

    public void setResponseId(int responseId) {
        this.responseId = responseId;
    }
}
