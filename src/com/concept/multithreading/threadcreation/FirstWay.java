package com.concept.multithreading.threadcreation;

/**
 * Created by Thanmayi on 3/2/2020.
 */

public class FirstWay extends Thread{

    @Override
    public void run() {

        for(int i=0; i <= 10; i++){

            System.out.println(i+" Helllo");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        super.run();
    }

    public static void main(String args[]){

        System.out.println("test");

        FirstWay obj1 = new FirstWay();
        obj1.start();

        FirstWay obj2 = new FirstWay();
        obj2.start();

        FirstWay obj3 = new FirstWay();
        obj3.start();
    }
}
