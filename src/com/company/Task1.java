package com.company;

//Объявите переменную со значением null.
//Вызовите метод у этой переменной.
//Отловите возникшее исключение.

public class Task1 {
    public static void task1() {

        try {
            Integer val = null;
            val.equals(val);
        } catch (Exception e) {
            System.out.println("task1 exceptions");
        }
    }
}
