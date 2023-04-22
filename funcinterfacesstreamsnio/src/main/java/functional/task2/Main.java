package functional.task2;

/*
Задача 2
С помощью функционального интерфейса выполнить подсчет квадрата числа:
 */
public class Main {
    
    public static void main(String[] args) {
        Square s = (int x) -> x * x;
        
        int a = 3;
        System.out.println(s.calculate(a));
    }
}
