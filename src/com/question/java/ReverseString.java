package com.question.java;

/**
 * Created by Aditya Konda on 2/22/2020.
 */
public class ReverseString {

    public static void main(String [] args){

        String input = "aditya";
        char[] try1 = input.toCharArray();

        System.out.println(input.length());

        for (int i = input.length() -1 ; i >= 0; i--){
            System.out.print(try1[i]);
        }
    }
}
