package ch03.ex12remind;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        
        // filtering, res/remind.data->res/valid.data
        {
            FileInputStream fis = new FileInputStream("res/remind.data"); 
            FileOutputStream fos = new FileOutputStream("res/valid.data");       
            Scanner scan = new Scanner(fis);
            PrintStream out = new PrintStream(fos);
                    
            while(scan.hasNextLine())
            {
                String line = scan.nextLine(); // 85  
                
                if(isNumeric(line)){
                    // System.out.println(line);
                    out.print(line);

                    if(scan.hasNextLine())
                        out.println();

                }                
            }
            
            scan.close();
            fis.close();   
            out.close();
            fos.close();    

        }

        // mapping, res/valid.data->grade.data
        {
            FileInputStream fis = new FileInputStream("res/valid.data"); 
            FileOutputStream fos = new FileOutputStream("res/grade.data");       
            Scanner scan = new Scanner(fis);
            PrintStream out = new PrintStream(fos);
                    
            while(scan.hasNextLine())
            {
                String line = scan.nextLine(); // 85  
                
                int score = Integer.parseInt(line);

                if(score == 100)
                    out.print("A+");
                else if(90 <= score && score <= 99)
                    out.print("A");
                else if(80 <= score && score <= 89)
                    out.print("B");
                else if(70 <= score && score <= 79)
                    out.print("C");
                else if(60 <= score && score <= 69)
                    out.print("D");
                else
                    out.print("F");
                
                if(scan.hasNextLine())
                    out.println();
                    
            }
            
            scan.close();
            fis.close();   
            out.close();
            fos.close();
        }

        // reducing : count, res/valid.data
        int count = 0;
        {
            // 코드를 작성하세요.
            FileInputStream fis = new FileInputStream("res/valid.data");      
            Scanner scan = new Scanner(fis);
                
            while(scan.hasNextLine())
            {
                scan.nextLine(); // 85  
                            
                count++;
            }
            
            scan.close();
            fis.close();  

            System.out.printf("count is %d\n",count);
        }

        // reducing : total, res/valid.data
        int total = 0;
        {
            // 코드를 작성하세요.
            FileInputStream fis = new FileInputStream("res/valid.data");      
            Scanner scan = new Scanner(fis);
                
            while(scan.hasNextLine())
            {
                String line = scan.nextLine(); // 85  
                            
                total += Integer.parseInt(line);
            }
            
            scan.close();
            fis.close();   

            System.out.printf("total is %d\n",total);
        }

        // reducing : avg
        {
            double avg = 0;
            // 코드를 작성하세요.
            avg = total / (double)count;
            
            System.out.printf("avg is %6.2f\n",avg);
        }
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
