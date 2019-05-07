package com.company;

//Бросить одно из существующих в JDK исключений, отловить его и выбросить своё собственное, указав в качестве причины отловленное.

import java.io.FileInputStream;
import java.io.IOException;

public class Task5 {
    public void method5() throws MyPersonalException {
        try {
            byte [] buffer = new byte[128];
            FileInputStream fis =
                    new FileInputStream("file.txt");
            while (fis.read(buffer) > 0){
                //
            }
        } catch (IOException e) {
            throw new MyPersonalException(e.toString());
        }
    }

    public void task5(){
        try {
            method5();
        } catch (MyPersonalException e) {
            e.printStackTrace();
        }
    }

}