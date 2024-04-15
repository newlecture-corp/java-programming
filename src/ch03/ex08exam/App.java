package ch03.ex08exam;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {

        // 인트로
        {

        }

        while(true){
            // 성적출력
            {
                clear();
                FileInputStream fis = new FileInputStream("res/exams.csv");        
                Scanner scan = new Scanner(fis);
                FileOutputStream fos = new FileOutputStream("res/exams.out");
                PrintStream out = new PrintStream(fos);
        
        
                if(scan.hasNextLine())        
                    scan.nextLine();
        
                out.printf("%-4s%-4s,%-4s,%-6s,%6s\n","KOR","ENG","MATH","TOTAL","AVG");
        
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
        
                    System.out.printf("%-4d%-4d,%-4d,%-6d,%6.2f\n", kor,eng,math,total,avg);
        
                    if(scan.hasNextLine())
                        out.println();
        
                    // index++;
                }
                        
        
                scan.close();
                fis.close();
                out.close();
                fos.close();

                System.out.println("성적을 입력하려면 아무키나 누르세요.");

                Scanner scanner = new Scanner(System.in);
                scanner.nextLine();     
            }

            // 성적입력
            {
                clear();
                Scanner scan = new Scanner(System.in);
                System.out.println("성적입력");

                System.out.println("성적목록을 조회하려면 아무키나 누르세요.");                
                scan.nextLine();
            }
        }

        
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
