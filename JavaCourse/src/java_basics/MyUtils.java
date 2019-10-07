package java_basics;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class MyUtils {
    //method overloading
    //polymorphism
    public static void printSomeJunk() {
        System.out.println("Some bla bla bla");
    }

    public static void printSomeJunk(String value) {
        System.out.println(value + " string olarak eklendi (String)");
    }

    public static void printSomeJunk(int value) {
        System.out.println(value + " integer olarak eklendi (Integer)");
    }

    public static void printSomeJunk(Object obje) {
        if (obje == null) { //eğer null gelirse kod göçmesin ve ekrana tipi yazsın.
            //System.out.println(obje.getClass().getName());
            System.out.println(obje);
            return;
        }

        switch (obje.getClass().getName()) { //reflection
            case "java.lang.String":
                System.out.println(obje + " string olarak eklendi");
                break;
            case "java.lang.Integer":
                System.out.println(obje + " integer olarak eklendi");
                break;
            default:
                System.out.println(obje + " obje olarak eklendi");
                break;
        }
    }

    public static int sum2Numbers(int a, int b) {
        int result = a + b;
        System.out.println(result);

        return result;
    }

    public static int sum2Numbers(int a, int b, boolean c) {
        int result = a + b;

        if (c) {
            System.out.println(result);
        }

        return result;
    }
}
