package ru.job4j.condition;

public class Rectangle {
    public static double diagonal(double length, double width) {
        // Вычисление диагонали прямоугольника по теореме Пифагора
        return Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));
    }
}
