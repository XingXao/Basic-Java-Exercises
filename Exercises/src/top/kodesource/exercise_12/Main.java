/*
Напишите программу на Java, которая принимает три числа в качестве входных данных для вычисления и печати среднего числа.
 */

package top.kodesource.exercise_12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите число: ");
        int firstNum = input.nextInt();
        System.out.print("Введите второе число: ");
        int secondNum = input.nextInt();
        System.out.print("Введите третье число: ");
        int thirdNum = input.nextInt();
        int avarage = (firstNum + secondNum + thirdNum) / 3;
        System.out.println("Среднне число: " + avarage);
    }
}
