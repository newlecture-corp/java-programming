package ch03.ex02if;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("res/kors.data");        
        Scanner scan = new Scanner(fis);
        FileOutputStream fos = new FileOutputStream("res/kors.out");
        PrintStream out = new PrintStream(fos);

        while(scan.hasNextInt())
        {
            int kor = scan.nextInt(); // 85                
            out.print(kor);

            if(scan.hasNextInt()) // 마지막이 아닐 때만
                out.print(" ");
        }
        
        scan.close();
        fis.close();
        out.close();
        fos.close();
    }
}
