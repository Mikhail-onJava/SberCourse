package functional.task1;

/*
Задача 1
Создать таймер, который считает время выполнения метода, используя Runnable.
 */
public class Main {
    
    public static void main(String[] args) {
        System.out.println("Classic");
        Timer timer = new Timer();
        timer.measureTime(new SimpleSummator());
        System.out.println(timer.timeNanoseconds);
    
        System.out.println("Анонимный класс");
        Timer timer1 = new Timer();
        timer1.measureTime(new Runnable() {
            @Override
            public void run() {
                long sum = 0;
                for (int i = 1; i < 1_000_000_000; ++i) {
                    sum += i;
                }
                
                System.out.println(sum);
            }
        });
        System.out.println(timer1.timeNanoseconds);
        System.out.println("Лямбда");
        Timer timer2 = new Timer();
        timer2.measureTime(() -> {
            long sum = 0;
            for (int i = 1; i < 1_000_000_000; ++i) {
                sum += i;
            }
    
            System.out.println(sum);
        });
    
        System.out.println(timer2.timeNanoseconds);
    
    }
    
    
}
