package org.example.hello;

public class ChangeAB implements Changer {


    public void changeVar(int a, int b) {

        print(a, b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("changed parameters");
        print(a, b);
    }

    public static void print(int a, int b) {
        System.out.println("b = " + b);
        System.out.println("a = " + a);
    }
}
