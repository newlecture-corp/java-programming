package ch03.ex04elseif;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("res/nums.data");        
        Scanner scan = new Scanner(fis);
        // FileOutputStream fos = new FileOutputStream("res/kors.out");
        // PrintStream out = new PrintStream(fos);

        while(scan.hasNextLine())
        {
            String line = scan.nextLine();
            int num = Integer.parseInt(line);

            if(num%3==0)
                System.out.printf("[%d] ", num);    
            else if(num%2==0)
                System.out.printf("(%d) ", num);  
            else
                System.out.printf("%d ", num);
            
        }
        
        scan.close();
        fis.close();
        // out.close();
        // fos.close();
    }
}
