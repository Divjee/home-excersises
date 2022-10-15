package io.codelex.questions.exercise1;

public class NotEnoughFundsException extends RuntimeException {

    String notEnough;
    public NotEnoughFundsException(String notEnough) {
        this.notEnough = notEnough;
    }

    @Override
    public String getMessage() {
        return notEnough;
    }
}
