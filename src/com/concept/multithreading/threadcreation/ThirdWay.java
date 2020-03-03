package com.concept.multithreading.threadcreation;

/**
 * Created by Thanmayi on 3/2/2020.
 */
public class ThirdWay {



    public static void main(String args[]){

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {

                for (int i =0; i<=10;i++){

                    System.out.println(i+" - Hello from thread1");
                }

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });
        Thread thread2 = new Thread(() -> {

            for (int i =0; i<=10;i++){

                System.out.println(i+" - Hello from thread2");
            }

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        });

        thread1.start();
        thread2.start();

    }
}
