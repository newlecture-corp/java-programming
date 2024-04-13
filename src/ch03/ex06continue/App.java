package ch03.ex06continue;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("res/letters.data");        
        Scanner scan = new Scanner(fis);
        // FileOutputStream fos = new FileOutputStream("res/kors.out");
        // PrintStream out = new PrintStream(fos);

        int index=0;
        while(scan.hasNextLine())
        {
            String line = scan.nextLine();
            
            if(index++ < 3)
                continue;

            System.out.printf("%s ", line);

            // index++;
        }
                

        scan.close();
        fis.close();
        // out.close();
        // fos.close();
    }
}
