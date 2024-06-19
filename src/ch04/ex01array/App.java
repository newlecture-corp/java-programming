package ch04.ex01array;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        // int[] kors = new int[3];
        int[] kors = {3,5,6};

        // kors[0] = 3;
        // kors[1] = 50;
        // kors[2] = 50;
        // kors[3] = 60;

        System.out.println(Arrays.toString(kors));

        kors[1]++;

        System.out.println(Arrays.toString(kors));


    }    
}
