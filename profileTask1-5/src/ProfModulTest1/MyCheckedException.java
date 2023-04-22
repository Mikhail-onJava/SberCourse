package ProfModulTest1;


public class MyCheckedException extends Throwable {
    public MyCheckedException() {

        super("Ошибка, нет явного победителя, необходим повтор соревнования");
    }
}


