package main.tasks.exceptions;

public class MyWrongOperatorException extends MyBaseException {

  public MyWrongOperatorException(String errorMessage) {
    super(errorMessage);
  }

  public MyWrongOperatorException() {
    super("Недопустимый оператор для калькулятора");
  }


}
