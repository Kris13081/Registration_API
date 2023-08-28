package selfproject.registeration.util;

public class RegistrationResponse {
    private final boolean success;
    private final String message;
    private final String error;

    public RegistrationResponse(boolean success, String message, String error) {
        this.success = success;
        this.message = message;
        this.error = error;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }

    public String getError() {
        return error;
    }
}
