package ch01.ex01file;

import java.io.FileOutputStream;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {        

        int x = 'A';
        System.out.println(x);
        x = x + 1;
        System.out.println(x);

        char c = 'A';
        
        FileOutputStream fos = new FileOutputStream("res/test.txt");
        fos.write(c);
        fos.write(x);
        fos.write('e');
        fos.flush();
        fos.close();

        System.out.println("작업완료");
    }
}
