package com.company;

//Написать метод, который в 50% случаев бросает исключение.
//Вызвать этот метод в конструкции try-catch-finally. Протестировать работу блока finally.


public class Task7 {
    public void task7() {
        int rand;

        rand = (int) (Math.random() * 2);

        try {
            if (rand == 1) throw new Exception();
            System.out.println("it`s OK");
        } catch (Exception e) {
            System.out.println("it`s exception");
        } finally {
            System.out.println("!");
        }
    }
}
