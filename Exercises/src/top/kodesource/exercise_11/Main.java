/*
Напишите Java-программу для печати области и периметра круга.
Тестовые данные:
Радиус = 7,5
Ожидаемый результат
Периметр = 47.12388980384689
Площадь = 176.71458676442586
 */

package top.kodesource.exercise_11;

public class Main {
    public static void main(String[] args) {
        double radius = 7.5;
        double circlePerimeter;
        double areaOfCircle;

        circlePerimeter = 2 * Math.PI * radius;
        areaOfCircle = Math.PI * (radius * radius);

        System.out.println(circlePerimeter);
        System.out.println(areaOfCircle);
    }
}
