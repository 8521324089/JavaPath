import java.sql.SQLOutput;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MyExecutorThread {
    public static int factorial(int i) throws InterruptedException {
        Thread.sleep(100);
        if(i ==0)return 1;
        return i*factorial(i-1);
    }

    public static void main(String[] args) throws InterruptedException {
        long time=System.currentTimeMillis();
        ExecutorService executor= Executors.newFixedThreadPool(3);

        for (int i = 0; i < 10; i++) {
            int finalI = i;
            executor.submit(()->{
                try {
                    System.out.println(factorial(finalI));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }
        executor.shutdown();
        executor.awaitTermination(100, TimeUnit.SECONDS);
        System.out.println("Waiting Time = "+(System.currentTimeMillis()-time));
    }
}
