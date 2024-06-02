/*
Напишите программу на Java, чтобы сложить два двоичных числа.
Входные данные:
Введите первое двоичное число: 10
Введите второе двоичное число: 11
Ожидаемый результат

 Сумма двух двоичных чисел: 101
 */

package top.kodesource.exercise_17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i = 0, remainder = 0;
        int[] sum = new int[20];
        Scanner input = new Scanner(System.in);
        System.out.println("Введите перое число");
        long binary1 = input.nextLong();
        System.out.println("Введите второе число");
        long binary2 = input.nextLong();

        while (binary1 != 0 || binary2 != 0) {
            sum[i++] = (int) ((binary1 % 10 + binary2 % 10 + remainder) % 2);
            remainder = (int) ((binary1 % 10 + binary2 % 10 + remainder) / 2);
            binary1 = binary1 / 10;
            binary2 = binary2 / 10;
        }
        if (remainder != 0) {
            sum[i++] = remainder;
        }
        --i;
        System.out.print("Sum of two binary numbers: ");
        while (i >= 0) {
            System.out.print(sum[i--]);
        }
        System.out.print("\n");

    }
}

