package org.morning_classes.day_1;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;

public class Threads {

    public static void main(String[] args){
        System.out.println("Inside: " + Thread.currentThread().getName());
//        new Thread(()-> {
//            System.out.println("Inside: " + Thread.currentThread().getName());
//            for (char ch = 'A'; ch<'Z'; ch ++){
//                System.out.println(ch);
//            }
//        }).start();
//        int[] numbers = {1,2,3,4,5,6,7,8};
//        new Thread(()-> {
//            System.out.println("Inside: " + Thread.currentThread().getName());
//            System.out.println(Arrays.stream(numbers).sum());
//        }).start();
//        Thread cook = new Thread(new Cook());
//        Thread eat = new Thread(new Eat());
//        cook.start();
//        try {
//            cook.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        eat.start();
//        new Thread(new Running()).start();
//        new Thread(new Running()).start();
//        new Thread(new Running()).start();
//        new Thread(new Running()).start();
//        DaemonThread dthread = new DaemonThread();
//        dthread.start();
//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        Alarm alarm = new Alarm();
        alarm.start();
        try {
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        alarm.interrupt();
        System.out.println("Main thread ended");
    }
}

class Thread1 extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("Thread1 ended");
    }
}

class Cook implements Runnable {
    public void run() {
        System.out.println("cooking");
        System.out.println("cooking is finished");
    }
}

class Eat implements Runnable {
    public void run() {
        System.out.println("eating");
    }
}

class Running implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Running");
    }
}

class Thread2 extends Thread {
    public void run() {
        System.out.println("thread: " + Thread.currentThread().getName());
        for (int i = 0; i < 100; i++) {
            System.out.println(LocalTime.now());
            try {
                Thread2.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
        }
        System.out.println("Thread1 ended");

    }
}

class Alarm extends Thread {
    public void run() {
        try {
            Thread2.sleep(5000);
            System.out.println("Awake");
        } catch (InterruptedException e) {
            System.out.println("Alarm is dismissed");
        }

    }
}

class DaemonThread extends Thread {
    public DaemonThread() {
        setDaemon(true);
    }

    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
                System.out.println("Background task running");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
