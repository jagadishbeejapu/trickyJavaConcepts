package com.trickyJavaConcepts;

import java.io.FileNotFoundException;

class Test {
    void hello() {

    }


}

class main extends  Test{
    void hello()   throws RuntimeException  {
        System.out.println("works");
    }
    public static void main(String args[]) {
        main s = new main();
        s.hello();
    }
}
