package ch02.ex01logical;

import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        System.out.print("x:");
        int x = scan.nextInt();
        System.out.println(x == 3);      
        System.out.println(x == 0 || x == 2);      
        System.out.println(-2<x && x<=2);
        System.out.println(x>-2 && x<=2);
        
    }
}
