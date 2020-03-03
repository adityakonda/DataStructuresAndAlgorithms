package com.concept.multithreading.threadcreation;

/**
 * Created by Thanmayi on 3/2/2020.
 */
public class SecondWay implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i<= 10; i++){

            System.out.println(i+" Hello ");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String args[]){

       Thread thread1 = new Thread(new SecondWay());
       thread1.start();

        Thread thread2 = new Thread(new SecondWay());
        thread2.start();

        Thread thread3 = new Thread(new SecondWay());
        thread3.start();

    }
}
