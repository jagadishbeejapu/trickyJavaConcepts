package com.trickyJavaConcepts;

public class ChainedException {

    public static void main(String[] args) {
        try{
            Exception ex = new Exception();
            try {
                someMethod(null);
            }
            catch (NullPointerException nullException){
                ex.initCause(new NullPointerException("this is the real cause of the exception"));
            }

         throw  ex;
        }
        catch (Exception ex){
            System.out.println(ex);
            System.out.println(ex.getCause());

        }
    }

    private static void someMethod(String str) throws  NullPointerException{
        str.equals("blank");
    }
}
