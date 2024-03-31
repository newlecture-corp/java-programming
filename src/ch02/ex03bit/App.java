package ch02.ex03bit;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("res/utf16.txt");
        Scanner scan = new Scanner(fis, "utf-16");
        String line = scan.nextLine();

        char ch = line.charAt(0);

        System.out.printf("%c\n",ch);

        // fis.read();
        // fis.read();

        // int b1 = fis.read(); // AC
        // int b2 = fis.read(); // 00

        // int ch = b1 << 8 | b2;

        // System.out.printf("%c\n", b1);
        // System.out.printf("%c\n", b2);
        // System.out.printf("%c\n", ch);
        scan.close();
        fis.close();
    }
}
