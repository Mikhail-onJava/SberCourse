package functional.task1;

public class SimpleSummator implements Runnable {
    
    @Override
    public void run() {
        long sum = 0;
        for(int i = 1; i< 1_000_000_000; ++i) {
            sum += i;
        }
    
        System.out.println(sum);
    }
}
