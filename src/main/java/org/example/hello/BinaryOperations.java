package org.example.hello;

public class BinaryOperations {
    public static void main(String[] args) {
//        increment();
//        bitCondition();
        bitMove();
    }

    private static void increment() {
        int x = 1;
        int y = x++;
        int z = ++x;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }

    private static void bitCondition() {
        System.out.println(1 & 2);
        System.out.println(1 | 2);
        System.out.println(1 ^ 2);

        System.out.println(1 & 3);
        System.out.println(1 | 3);
        System.out.println(1 ^ 3);


    }

    private static void bitMove() {
        System.out.println(8 << 1);
        System.out.println(-8 >> 1);
        System.out.println(-8 >>> 1);
    }
}
