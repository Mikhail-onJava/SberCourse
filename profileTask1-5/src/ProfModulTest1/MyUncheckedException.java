package ProfModulTest1;

public class MyUncheckedException extends IndexOutOfBoundsException {

    public MyUncheckedException(String message) {
        super("Такого индекса не существует");
        System.out.println(message);
    }
}
