package com.company;

public class Task6 {
    int a;
    public void task6() {
        a = (int)(Math.random()*3);
        switch (a) {
            case 0:
                try {
                    throw new NullPointerException();
                } catch (NullPointerException e) {
                    System.out.println("oshibka1:");
                    e.printStackTrace();
                }
                break;
            case 1:
                try {
                    throw new ArithmeticException();
                } catch (ArithmeticException e) {
                    System.out.println("oshibka2:");
                    e.printStackTrace();
                }
                break;
            case 2:
                try {
                    throw new ClassCastException();
                } catch (ClassCastException e) {
                    System.out.println("oshibka3:");
                    e.printStackTrace();
                }
                break;
        }
    }
}
