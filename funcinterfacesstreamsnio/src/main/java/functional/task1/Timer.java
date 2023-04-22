package functional.task1;

public class Timer {
    
    public long timeNanoseconds = 0;
    
    public void measureTime(Runnable runnable) {
        long start = System.nanoTime();
        runnable.run();
        timeNanoseconds += System.nanoTime() - start;
    }
    
}
