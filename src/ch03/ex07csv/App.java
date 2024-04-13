package ch03.ex07csv;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("res/exams.data");        
        Scanner scan = new Scanner(fis);
        FileOutputStream fos = new FileOutputStream("res/exams.out");
        PrintStream out = new PrintStream(fos);

        int index=0;
        while(scan.hasNextLine())
        {
            String line = scan.nextLine();
            
            String[] tokens = line.split(",");//["10","90","50"];
            
            int kor = Integer.parseInt(tokens[0]);
            int eng = Integer.parseInt(tokens[1]);
            int math = Integer.parseInt(tokens[2]);

            System.out.printf("%d,%d,%d,%d,%f\n", kor,eng,math,total,avg);

            // index++;
        }
                

        scan.close();
        fis.close();
        // out.close();
        // fos.close();
    }
}
