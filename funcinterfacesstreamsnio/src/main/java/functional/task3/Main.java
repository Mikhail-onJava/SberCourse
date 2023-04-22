package functional.task3;

//получить значение PI через наш интерфейс
public class Main {
    public static void main(String[] args) {
        MyInterface myInterface = () -> Math.PI;
        System.out.println(myInterface.getPiValue());
        MyInterface myInterface1;
        myInterface1 = () -> 3.14;
        System.out.println(myInterface1.getPiValue());
        
    }
}
