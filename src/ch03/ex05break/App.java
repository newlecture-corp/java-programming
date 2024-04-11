package ch03.ex05break;

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
            
            if(line.equals("O"))
                break;
            
            index++;
            // if(!line.equals("O"))
            //     index++;
            // else
            //     break;
        }
        
        System.out.printf("index:%d\n", index);
        

        scan.close();
        fis.close();
        // out.close();
        // fos.close();
    }
}
