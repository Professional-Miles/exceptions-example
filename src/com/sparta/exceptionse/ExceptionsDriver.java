package com.sparta.exceptionse;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class ExceptionsDriver {

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        System.err.println("Hello");

        DateFormat df = DateFormat.getDateInstance();
        try {
            int c = a/b;
            System.out.println(c);
            System.out.println(df.parse("2021-09-28"));
        } catch(ParseException pe){
            System.err.println(pe.getMessage());
        } catch (ArithmeticException ae){
            System.err.println("Arithmetic Exception");
        }
    }

}
