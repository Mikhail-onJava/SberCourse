package ProfModuleTest1;

// Исключения (Exceptions) делятся на несколько классов, но все они имеют общего предка — класс Throwable
public class MyCheckedException extends Throwable {
    public MyCheckedException() {

        super("Ошибка, нет явного победителя, необходим повтор соревнования");
    }
}


