package ch03.ex08testscore;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        // Test Score ... Intro
        clear();
        {                        
            System.out.println("┌───────────────────────────────┐");
            System.out.println("│  Test Score Management System │");
            System.out.println("└───────────────────────────────┘");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("─────────────────────────────────");
            System.out.println("Press any Key to Continue>");
            Scanner scan = new Scanner(System.in);
            scan.nextLine();
        }

        while(true){
            // Test Score List
            clear();
            {
                System.out.println("┌───────────────────────────────┐");
                System.out.println("│        Test Score List        │");
                System.out.println("└───────────────────────────────┘");
               
                System.out.println("─────────────────────────────────");
                System.out.println("Press any Key to Continue>");

                Scanner scan = new Scanner(System.in);
                scan.nextLine();
            }

            // Test Score Input
            clear();
            {
                int kor = 1;
                int eng = 2;

                FileOutputStream fos = new FileOutputStream("res/exams.csv",true);
                PrintStream out = new PrintStream(fos);


                System.out.println("─────────────────────────────────");
                System.out.println("Press any Key to Continue>");
                Scanner scan = new Scanner(System.in);
                scan.nextLine();

            }
        }


        /*
        FileInputStream fis = new FileInputStream("res/exams.csv");        
        Scanner scan = new Scanner(fis);
        


        if(scan.hasNextLine())        
            scan.nextLine();

        out.println("KOR,ENG,MATH,TOTAL,AVG");

        int index=0;
        // int total
        while(scan.hasNextLine())
        {
            String line = scan.nextLine();
            
            String[] tokens = line.split(",");//["10","90","50"];
            
            int kor = Integer.parseInt(tokens[0]);
            int eng = Integer.parseInt(tokens[1]);
            int math = Integer.parseInt(tokens[2]);
            int total = kor+eng+math;
            double avg = total/3.0;

            out.printf("%d,%d,%d,%d,%.2f", kor,eng,math,total,avg);

            if(scan.hasNextLine())
                out.println();

            // index++;
        }
                

        scan.close();
        fis.close();
        // out.close();
        // fos.close();
         */
    }

    public static void clear() {
        try {
            String operatingSystem = System.getProperty("os.name");
            if (operatingSystem.contains("Windows")) {
                ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "cls");
                Process startProcess = pb.inheritIO().start();
                startProcess.waitFor();
            } else {
                ProcessBuilder pb = new ProcessBuilder("clear");
                Process startProcess = pb.inheritIO().start();
                startProcess.waitFor();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
