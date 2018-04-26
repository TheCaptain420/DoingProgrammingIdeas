package ThreadWork;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Threads1000 {
    static int balance=0;
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int i = 0; i <1000; i++) {
            executorService.execute(new number());
            System.out.println(""+i);
        }
        executorService.shutdown();
        System.out.println(balance);
    }


}
class number implements  Runnable{

    @Override
    public void run() {
        Threads1000.balance++;
    }
}