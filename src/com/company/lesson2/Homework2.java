package com.company.lesson2;

import java.sql.SQLOutput;

public class Homework2 {
    public static void main(String[] args) {
        System.out.println(checkSum(10, 5));
        System.out.println();
        printCheckNum(4);
        System.out.println();
        System.out.println(checkNum(-3));
        System.out.println();
        printText("Hello World!", 3);
        System.out.println();
        System.out.println(checkYear(2022));
    }

    /* 1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно),
     если да – вернуть true, в противном случае – false.*/
    public static boolean checkSum(int a, int b) {
        if ((a + b) >= 10 && (a + b) <= 20) {
            return true;
        } else {
            return false;
        }
    }

    /* 2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
    положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.*/
    public static void printCheckNum(int a) {
        if (a >= 0) {
            System.out.println(a + "- положительное число");
        } else {
            System.out.println(a + "- отрицательное число");
        }
    }

    /* 3. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное,
и вернуть false если положительное.*/
    public static boolean checkNum(int a) {
        return a < 0;
    }

    /* 4. Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль указанную строку,
указанное количество раз;*/
    public static void printText(String str, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(str);
        }
    }

    /* 5. * Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false).
     *? Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.*/
    public static boolean checkYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}
