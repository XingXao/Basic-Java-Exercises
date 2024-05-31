/*
Напишите программу на Java для печати лица. Перейти к редактору
Ожидаемый результат

+ "" "" "+
[| о о | ]
 |  ^  |
 | '-' |
+ ----- +
 */

package top.kodesource.exercise_16;

public class Main {
    public static void main(String[] args) {
        String[] array = new String[5];
        array[0] = "+\\\"\\\"\\\"\\\"\\\"+ ";
        array[1] = "[| o o |]";
        array[2] = " |  ^  |";
        array[3] = " | '-' |";
        array[4] = " +-----+";

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
