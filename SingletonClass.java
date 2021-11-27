package com.trickyJavaConcepts;

import java.util.ArrayList;

public class SingletonClass {
    static SingletonClass singletonInstance = null;
    public  String name="Testing ";
    private SingletonClass(){}
    public static SingletonClass getInstance(){
        if (singletonInstance==null){
             singletonInstance =  new SingletonClass();
        }
              return  singletonInstance;
        }

    }

    class Main{
        public static void main(String[] args) {
            SingletonClass obj1 = SingletonClass.getInstance();
            SingletonClass obj2 = SingletonClass.getInstance();
            obj1.name= obj1.name+" success";
            System.out.println(obj1.name);
            System.out.println(obj2.name);
        }
    }
