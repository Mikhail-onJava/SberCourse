package main.tasks;


import main.tasks.exceptions.MyDivisionByZeroException;
import main.tasks.exceptions.MyInputException;
import main.tasks.exceptions.MyIntOverflowException;
import main.tasks.exceptions.MyWrongOperatorException;

import java.util.Scanner;

public class Calc {
    private static final Scanner scanner = new Scanner(System.in);

    private static int a;
    private static int b;
    private static char c;

    public static void main(String[] args) {
        input();
        int result = calculate();
        System.out.println(result);
    }

    public static void input() {
        try {
            a = scanner.nextInt();
            c = scanner.next().charAt(0);
            b = scanner.nextInt();
        } catch (RuntimeException e) {
            // throw - оператор позволяет принудительно выбросить исключение
            throw new MyInputException();
        }
    }

    public static int calculate() {
/*    switch (c) {
      case '+':
        return sum();
      case '-':
        return sub();
      case '/':
        return integerDiv();
      case '*':
        return mul();
      default:
        throw new MyWrongOperatorException();
    }*/
        return switch (c) {
            case '+' -> sum();
            case '-' -> sub();
            case '/' -> integerDiv();
            case '*' -> mul();
            default -> throw new MyWrongOperatorException();
        };
    }

    private static int sum() {
        try {
            //переполнение инта
            //return a + b
            return Math.addExact(a, b);
        } catch (ArithmeticException e) {
            throw new MyIntOverflowException();
        }
    }

    private static int sub() {
        try {
            //переполнение инта
            //return a - b;
            return Math.subtractExact(a, b);
        } catch (ArithmeticException e) {
            throw new MyIntOverflowException();
        }
    }

    private static int integerDiv() {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            throw new MyDivisionByZeroException();
        }
    }

    private static int mul() {
        try {
            //return a * b;
            return Math.multiplyExact(a, b);
        } catch (ArithmeticException e) {
            throw new MyIntOverflowException();
        }
    }

}
