package com.sparta.exceptionse;

//import java.text.DateFormat;
//import java.text.ParseException;
//import java.util.Date;

public class ExceptionsDriver {

    //public static void main(String[] args) throws ParseException

    public static void main(String[] args) {

//        try {
//            int c = a/b;
//            System.out.println(c);
//            System.out.println(df.parse("2021-09-28"));
//        } catch(ParseException pe){
//            System.err.println(pe.getMessage());
//        } catch (ArithmeticException ae){
//            System.err.println("Arithmetic Exception");
//        } // catch (ParseException | ArithmeticException)

        ExceptionsWorker worker = new ExceptionsWorker();
        try {
            worker.myFunc();
        } catch (ArithmeticException e) {
            //never leave catch block empty
            //never print to system.out
            e.printStackTrace();
        } finally {
            System.out.println("This got executed");
        }

    }

}
