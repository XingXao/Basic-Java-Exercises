/*
Напишите программу Java, которая принимает два числа в качестве входных данных и отображает произведение двух чисел.
Тестовые данные:
Введите первое число: 25
Введите второе число: 5
Ожидаемый результат :
25 х 5 = 125
 */

package top.kodesource.exercise_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int firstNum = input.nextInt();
        System.out.println("Введите второе число: ");
        int secondNum = input.nextInt();
        System.out.print(firstNum + " * " + secondNum + " = " + firstNum * secondNum);

    }
}
