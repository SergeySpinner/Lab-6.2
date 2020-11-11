package com.jetbrains;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        FirstClass temp1 = new FirstClass();
        SecondClass temp2 = new SecondClass();
        Scanner checkConsole = new Scanner(System.in);
        int temp;
        System.out.print("Write down the number: ");
        temp = checkConsole.nextInt();
        System.out.println("Work of First Class: " + temp1.count(temp));
        System.out.println("Work of Second Class: " + temp2.count(temp));
    }
}