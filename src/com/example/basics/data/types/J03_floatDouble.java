package com.example.basics.data.types;

public class J03_floatDouble {
    public static void main(String[] args) {
        float number = 10.5f;
        // dodawaj literkę "f" po liczbie. Wtedy Java wie że to Float
        double bigNumber = 23.45653;
        // W tym wypadku typ "double" - dla javy domyślnie to typ Double

        System.out.println("Number:" + number
                + " bigNumber:" + bigNumber);

    }
}
