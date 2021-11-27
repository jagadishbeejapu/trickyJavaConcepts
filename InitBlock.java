package com.trickyJavaConcepts;

public class InitBlock {

    {
        System.out.println("init block");
    }

    public InitBlock(){
        System.out.println("defualt constuctor");
    }
    public InitBlock(String name){
        System.out.println("parameterized constructor with param as : "+name);
    }

    public static void main(String[] args) {
        InitBlock obj = new InitBlock();
        InitBlock obj2 = new InitBlock("Tricky Problem");
    }
}

     //output:
     //init block
    //defualt constuctor
    //init block
    //parameterized constructor with param as : Tricky Problem
