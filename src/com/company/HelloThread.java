package com.company;

public class HelloThread extends Thread {


    @Override
    public void run() {
        System.out.println("Hello World " + Thread.currentThread().getName());;
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());

        HelloThread helloThread1 = new HelloThread();
        HelloThread helloThread2 = new HelloThread();
        HelloThread helloThread3 = new HelloThread();
        HelloThread helloThread4 = new HelloThread();

        Thread.sleep(500);
        helloThread1.start();
        Thread.sleep(500);
        helloThread2.start();
        Thread.sleep(500);
        helloThread3.start();
        Thread.sleep(500);
        helloThread4.start();


    }
}
