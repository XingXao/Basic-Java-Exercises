/*
Напишите Java-программу для печати площади и периметра прямоугольника.
Тестовые данные:
Ширина = 5,6 Высота = 8,5

Ожидаемый результат
Площадь 5,6 * 8,5 = 47,60
Периметр 2 * (5,6 + 8,5) = 28,20
 */

package top.kodesource.exercise_13;

public class Main {
    public static void main(String[] args) {
        double width = 5.6;
        double height = 8.5;

        System.out.println("площадь прямоугольника: " + width * height);
        System.out.println("периметр прямоугольника: " + 2 * (width + height));

    }
}
