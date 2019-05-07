package com.company;

import org.apache.log4j.Logger;

//Написать код, который создаст, а затем отловит ArrayIndexOutOfBoundsException.


public class Task2 {

    private static final Logger LOGGER = Logger.getLogger(Task2.class);

    int array[] = new int[5];

    public void createArray() {
        try {
            for (int i = 0; i < 6; i++) {
                array[i] = i;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
//            e.printStackTrace();
            LOGGER.info("START===============================");
            LOGGER.debug("Task Exc: ", e);
            LOGGER.info("END)===============================");
        }
    }
}
