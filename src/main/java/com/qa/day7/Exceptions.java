package com.qa.day7;

public class Exceptions {
    public static void main(String[] args) {
        Exceptions exceptionTask = new Exceptions();
        exceptionTask.method1(3,8);
    }
    public int method1(int a, int b) {
        int c = 0;
        Integer d = b;
        d = 0;
        try {
            c = a / b;
            if (a > b) {
                System.out.println(c);
            } else {
                throw new GreaterThanException("error, cannot divide by greater number");
            }
        }
        catch (GreaterThanException error){
            System.out.println(error.getMessage());
        }
        //catch(ArithmeticException error){
        //   System.out.println("error, cannot " + error.getMessage());
        //}
        // catch(NullPointerException error2){
        // System.out.println("error2, cannot " + error2.getMessage());
        //}
        //catch(Exception error3){
        //  System.out.println("error3, cannot " + error3.getMessage());
        //}
        finally{
            System.out.println(c);
            return c;
        }
    }
}
