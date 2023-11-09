package org.morning_classes.day_3;

import java.util.concurrent.*;

public class Main {
    static ExecutorService executorService = Executors.newFixedThreadPool(10);
    public static void execute(){
        Executor executor = new MyExecutor();
        executor.execute(()-> System.out.println("Hello from Executor!"));
        executor.execute(() -> {
            for(int i=1; i<4; i++){
                System.out.println(i);
            }
        });
    }

    public static void execute2(){
        executorService.submit(new Task("task1"));
        executorService.submit(new Task("task2"));
        executorService.submit(new Task("task3"));
    }

    public static void executeScheduled(){
        ScheduledExecutorService exeService = Executors.newSingleThreadScheduledExecutor();
        exeService.scheduleWithFixedDelay(new Task("task4", "scheduled task execution "), 2,1, TimeUnit.SECONDS);
    }

    public static void executeFuture(int a, int b){
        ExecutorService executor = Executors.newFixedThreadPool(10);
        Future<Integer> future = executor.submit(() -> a*b);
            try {
                System.out.println("result: " + future.get(5,TimeUnit.SECONDS));
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                e.printStackTrace();
            }
        executor.shutdown();
    }

    public static void main(String[] args) {
        executeFuture(4,5);
        //executorService.shutdown();
    }
}
