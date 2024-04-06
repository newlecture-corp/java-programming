package ch03.ex03count;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        int count = 0;
        int numberCount = 0;
        int nanCount = 0;
        int total = 0;
        double avg = 0;
        {
            FileInputStream fis = new FileInputStream("res/kors.data");        
            Scanner scan = new Scanner(fis);
                    
            while(scan.hasNextLine())
            {
                String line = scan.nextLine(); // 85  
                count++;
                if(isNumeric(line)){
                    numberCount++; 
                    total+=Integer.parseInt(line);
                }
                //if(!isNumeric(line))
                else
                    nanCount++;
                
            }
            
            scan.close();
            fis.close();     
        }

        avg = ((double)total)/numberCount;

        System.out.printf("count:%d\n", count);
        System.out.printf("numberCount:%d\n", numberCount);
        System.out.printf("nanCount:%d\n", nanCount);
        System.out.printf("total:%d\n", total);
        System.out.printf("avg:%.2fn", avg);
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
