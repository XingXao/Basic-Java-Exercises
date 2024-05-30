/*
Напишите Java-программу для печати суммы (сложения), умножения, вычитания, деления и остатка двух чисел.
Тестовые данные:
Введите первое число: 125
Введите второе число: 24
Ожидаемый результат :
125 + 24 = 149
125 - 24 = 101
125 х 24 = 3000
125/24 = 5
125 мод 24 = 5
 */

package top.kodesource.exercise_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int firstNum = input.nextInt();

        System.out.println("Введите второе число: ");
        int secondNum = input.nextInt();

        System.out.println(firstNum + " + " + secondNum + " = " + (firstNum + secondNum));
        System.out.println(firstNum + " - " + secondNum + " = " + (firstNum - secondNum));
        System.out.println(firstNum + " * " + secondNum + " = " + (firstNum * secondNum));
        System.out.println(firstNum + " / " + secondNum + " = " + (firstNum / secondNum));
        System.out.println(firstNum + " мод " + secondNum + " = " + (firstNum % secondNum));

    }
}
