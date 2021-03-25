package org.example.hello;

import java.util.Arrays;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("Hello World");
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        Changer changer = new ChangeAB();
        changer.changeVar(a, b);
        ChangeAB.print(a, b);

        ChangeAB changeAB = (ChangeAB) changer;
    }

}