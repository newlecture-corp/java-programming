package ch03.ex03count;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        int count = 0;
        {
            FileInputStream fis = new FileInputStream("res/kors.data");        
            Scanner scan = new Scanner(fis);
                    
            while(scan.hasNextLine())
            {
                scan.nextLine(); // 85  
                count++;
            }
            
            scan.close();
            fis.close();     
        }

        System.out.printf("count:%d\n", count);
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
