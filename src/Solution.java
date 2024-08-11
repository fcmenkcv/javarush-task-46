package com.javarush.task.pro.task04.task0408;

import java.util.Scanner;

/*
Максимум из введенных чисел
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Scanner console = new Scanner(System.in);
        int max = -2147483648;

        while (console.hasNextInt()) {
            int num = console.nextInt();
            if (num % 2 == 0) {
                if (num > max) {
                    max = num;
                }
            }
        }
        System.out.println(max);
    }
}
