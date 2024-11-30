package model.exceptions;

public class ChildWithoutResponsibleException extends RuntimeException {
    public ChildWithoutResponsibleException(String message) {
      super(message);
    }
}
