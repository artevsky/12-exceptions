package com.company;

//Создать собственный класс-исключение - наследник класса Exception.
//Создать метод, выбрасывающий это исключение.
//Вызвать этот метод и отловить исключение. Вывести stacktrace в консоль.

public class Task3 {

    String string = "kyky exception";

    public void task3() {
        try {
            methodExcp3();
        } catch (MyPersonalException e) {
            e.printStackTrace();
        }
    }

    private void methodExcp3() throws MyPersonalException {
        throw new MyPersonalException(string);
    }
}
