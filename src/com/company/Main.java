package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num1 = input.nextInt();
        for ( int i = 1; i < 11; i++){
            int times = i * num1;
            System.out.println(i + " times " + num1 + " = " + times);
        }
    }
}
