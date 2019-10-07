package java_basics;

import static java_basics.MyUtils.*;

public class Methods {
    public static void main(String[] args) { //access modifiers
        System.out.println("x");
        printSomeJunk(); //Methods.printSomeJunk();
        printSomeJunk("bu string olmalı");
        printSomeJunk(5555);
        printSomeJunk(66666L);
        int summary = sum2Numbers(25,66, args[0] != null ? Boolean.parseBoolean(args[0]) : false);

        if (summary > 100)
            System.out.println("summary is bigger than 100");
        else
            System.out.println("summary is smaller than 100");
    }
}