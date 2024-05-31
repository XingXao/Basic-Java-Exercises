/*
Напишите программу на Java для замены двух переменных.
 */

package top.kodesource.exercise_15;

public class Main {
    public static void main(String[] args) {
        int a = 71;
        int b = 38;
        int temp;

        System.out.println("переменная a = " + a + "\nпеременная b = " +b);
        System.out.println("поменяем местами");
        temp = a;
        a = b;
        b = temp;
        System.out.println("переменная a = " + a + "\nпеременная b = " +b);
    }
}
