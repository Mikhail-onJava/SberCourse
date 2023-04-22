package functional.task5;


/*
Создать параметризованный функциональный интерфейс (Generics)
На выходе получить:
1) Строку наоборот
2) Факториал числа
 */
public class Main {
    
    public static void main(String[] args) {
        MyGenericInterface<String> reverse = (str) -> new StringBuilder(str).reverse().toString();
        MyGenericInterface<Integer> factorial = (n) -> {
            int result = 1;
            for(int i = 1; i <= n; i++) {
                System.out.println(result);
                result = i * result;
            }
            
            return result;
        };
    
        System.out.println("Reverse:" + reverse.func("Lambda"));
        System.out.println("n factorial:" + factorial.func(5));
    }
}
