package com.company;

public class MyRuntimeException extends RuntimeException {

//    private RuntimeException _myRunException;
//    public MyRuntimeException(String er, RuntimeException e){
//        super(er);
//        _myRunException = e;
//    }

    public MyRuntimeException(String er) {
        super(er);
    }

//    public RuntimeException get_myRunException() {
//        return (_myRunException);
//    }

}
