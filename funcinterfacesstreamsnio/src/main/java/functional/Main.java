package functional;

import java.util.ArrayList;
import java.util.function.*;

public class Main {
    
    public static void main(String[] args) {
//        Predicate — функциональный интерфейс для проверки соблюдения некоторого условия.
//        Если условие соблюдается, возвращает true, иначе — false:
        Predicate<Integer> integerPredicate = x -> x % 2 == 0;
        System.out.println(integerPredicate.test(3));
        System.out.println(integerPredicate.test(4));

//        Consumer (с англ. — “потребитель”) — функциональный интерфейс,
//        который принимает в качестве входного аргумента объект типа T, совершает некоторые действия,
//        но при этом ничего не возвращает:
        Consumer<String> stringConsumer = x -> System.out.println("Hello " + x + "!!!");
        stringConsumer.accept("Nikita");

//        Supplier (с англ. — поставщик) — функциональный интерфейс,
//        который не принимает никаких аргументов, но возвращает некоторый объект типа T:
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Elena");
        nameList.add("John");
        nameList.add("Alex");
        nameList.add("Jim");
        nameList.add("Sara");
        Supplier<String> randomName = () -> {
            int value = (int) (Math.random() * nameList.size());
            return nameList.get(value);
        };
    
        System.out.println(randomName.get());
    
//    Function — этот функциональный интерфейс
//    принимает аргумент T и приводит его к объекту типа R, который и возвращается как результат:
        Function<String, Integer> valueConverter = x -> Integer.valueOf(x);
//        Function<String, Integer> valueConverter = Integer::valueOf;
        System.out.println(valueConverter.apply("123"));
    
    
//    UnaryOperator — функциональный интерфейс,
//    принимает в качестве параметра объект типа T,
//    выполняет над ним некоторые операции и возвращает результат операций в виде объекта того же типа T:
        UnaryOperator<Integer> squareValue = x -> x*x;
        System.out.println(squareValue.apply(2));
        
    }
}
