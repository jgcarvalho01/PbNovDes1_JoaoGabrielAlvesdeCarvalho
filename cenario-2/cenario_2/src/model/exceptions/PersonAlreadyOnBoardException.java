package model.exceptions;

public class PersonAlreadyOnBoardException extends RuntimeException {
    public PersonAlreadyOnBoardException(String message) {
      super(message);
    }
}
