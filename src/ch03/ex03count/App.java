package ch03.ex03count;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        int count = 0;
        int numberCount = 0;
        int nanCount = 0;
        {
            FileInputStream fis = new FileInputStream("res/kors.data");        
            Scanner scan = new Scanner(fis);
                    
            while(scan.hasNextLine())
            {
                String line = scan.nextLine(); // 85  
                count++;
                if(isNumeric(line))
                    numberCount++;
                if(!isNumeric(line))
                    nanCount++;
            }
            
            scan.close();
            fis.close();     
        }

        System.out.printf("count:%d\n", count);
        System.out.printf("numberCount:%d\n", numberCount);
        System.out.printf("nanCount:%d\n", nanCount);
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
