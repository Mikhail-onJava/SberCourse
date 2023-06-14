package ProfModuleTest1;

/*unchecked (неконтролируемые/непроверяемые исключения), к которым относятся ошибки Error (например, OutOfMemoryError),
        обрабатывать которые не рекомендуется и исключения времени выполнения, представленные классом RuntimeException
        и его наследниками (например, NullPointerException),
        которые могут не обрабатываться блоком catch и не быть описанными в сигнатуре метода.*/

public class MyUncheckedException extends IndexOutOfBoundsException {

    public MyUncheckedException(String message) {
        super("Такого индекса не существует");
        System.out.println(message);
    }
}
