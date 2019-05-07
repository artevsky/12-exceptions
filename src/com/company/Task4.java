package com.company;

//4.	Повторить предыдущее упражнение, но наследуя свой класс от класса RuntimeException.
//        Добавить вконструктор своего класса возможность указания сообщения.

public class Task4 {
    String string;

    public void task4(String string) {
        this.string = string;

        try {
            methodExcp4();
        } catch (MyRuntimeException e) {
            e.printStackTrace();
        }
    }

    private void methodExcp4() throws MyRuntimeException {
        throw new MyRuntimeException(string);
    }
}
