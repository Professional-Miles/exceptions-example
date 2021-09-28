package com.sparta.exceptionse;

import java.text.DateFormat;
import java.text.ParseException;

public class ExceptionsWorker {

    public void myFunc() throws ArithmeticException{

        int a = 10;
        int b = 0;
        System.err.println("Hello");

        DateFormat df = DateFormat.getDateInstance();
        int c = a/b;
        System.out.println(c);

        try {

            new ArithmeticException("Hello from my method!");

        } finally {
            System.out.println("This got executed");
        }
    }

}
