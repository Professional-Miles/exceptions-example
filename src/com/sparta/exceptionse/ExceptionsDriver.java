package com.sparta.exceptionse;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class ExceptionsDriver {

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        System.err.println("Hello");
        int c = 0; //a/b;
        System.out.println(c);
        DateFormat df = DateFormat.getDateInstance();
        try {
            System.out.println(df.parse("2021-09-28"));
        } catch(ParseException pe){
            System.err.println(pe.getMessage());
        }
    }

}
