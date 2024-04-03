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

        while(scan.hasNextLine())
        {
            String line = scan.nextLine(); // 85  
            int kor = 0;
            if(isNumeric(line)){
                kor = Integer.parseInt(line);              
            }
            out.print(kor);

            if(scan.hasNextLine()) // 마지막이 아닐 때만
                out.println();
        }
        
        scan.close();
        fis.close();
        out.close();
        fos.close();
    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
