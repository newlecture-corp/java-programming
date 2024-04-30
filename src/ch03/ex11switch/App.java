package ch03.ex11switch;

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
        }
        {
            System.out.println("─────────────────────────────────");
            System.out.println("Press any Key to Continue>");

            Scanner scan = new Scanner(System.in);
            scan.nextLine();
        }

        while(true){
            // input menu
            int menu;
            {
                clear();
                System.out.println("┌───────────────────────────────┐");
                System.out.println("│            Main Menu          │");
                System.out.println("└───────────────────────────────┘");
                System.out.println();
                System.out.println("1. List");
                System.out.println("2. Input");
                System.out.println("3. Exit");
                
                Scanner scan = new Scanner(System.in);
                System.err.print(">");
                menu = Integer.parseInt(scan.nextLine());
            }
            
            switch(menu)
            {
                // Test Score List
                case 1:{
                    {
                        clear();
                        System.out.println("┌───────────────────────────────┐");
                        System.out.println("│        Test Score List        │");
                        System.out.println("└───────────────────────────────┘");
                        FileInputStream fis = new FileInputStream("res/exams.csv");        
                        Scanner scan = new Scanner(fis);

                        if(scan.hasNextLine())        
                            scan.nextLine();

                        System.out.printf("%-4s %-4s %-4s %-4s %-6s %-6s\n",
                                        "NO", "KOR","ENG","MATH","TOTAL","AVG");
                        
                        // int total
                        int index=0;
                        while(scan.hasNextLine())
                        {
                            String line = scan.nextLine();
                            
                            String[] tokens = line.split(",");//["10","90","50"];
                            
                            int kor = Integer.parseInt(tokens[0]);
                            int eng = Integer.parseInt(tokens[1]);
                            int math = Integer.parseInt(tokens[2]);
                            int total = kor+eng+math;
                            double avg = total/3.0;
                
                            System.out.printf("%-4d %-4d %-4d %-4d %-6d %-6.2f\n", 
                                        index+1, kor,eng,math,total,avg);
                        
                            index++;
                        }                
                    }
                    {
                        System.out.println("─────────────────────────────────");
                        System.out.println("Press any Key to Continue>");

                        Scanner scan = new Scanner(System.in);
                        scan.nextLine();
                    }
                }
                break;
                // Test Score Input
                case 2:{
                    {
                        clear();
                        System.out.println("┌───────────────────────────────┐");
                        System.out.println("│        Test Score Input       │");
                        System.out.println("└───────────────────────────────┘");

                        Scanner scan = new Scanner(System.in);

                        int kor;
                        int eng;
                        int math;

                        do{
                            System.out.print("Kor:");
                            kor = Integer.parseInt(scan.nextLine());

                            if(!(0<=kor && kor<=100))
                                System.out.println("성적의 유효범위는 0~100입니다.");

                        }while(!(0<=kor && kor<=100));
                        
                        do{
                            System.out.print("Eng:");
                            eng = Integer.parseInt(scan.nextLine());

                            if(!(0<=eng && eng<=100))
                                System.out.println("성적의 유효범위는 0~100입니다.");

                        }while(!(0<=eng && eng<=100));

                        do{
                            System.out.print("Math:");
                            math = Integer.parseInt(scan.nextLine());

                            if(!(0<=math && math<=100))
                                System.out.println("성적의 유효범위는 0~100입니다.");

                        }while(!(0<=math && math<=100));
                        
                        
                        FileOutputStream fos = new FileOutputStream("res/exams.csv",true);
                        PrintStream out = new PrintStream(fos);

                        out.printf("\n%d,%d,%d",kor, eng, math);

                        out.close();
                        fos.close();

                    }
                    {
                        System.out.println("─────────────────────────────────");
                        System.out.println("Press any Key to Continue>");

                        Scanner scan = new Scanner(System.in);
                        scan.nextLine();
                    }
                }
                break;
                case 3:{
                    clear();
                    System.out.println("┌───────────────────────────────┐");
                    System.out.println("│             Bye~~             │");
                    System.out.println("└───────────────────────────────┘");
                    System.out.println();
                    break;
                }
                default:
                {
                    {
                        clear();
                        System.out.println("┌───────────────────────────────┐");
                        System.out.println("│              Error            │");
                        System.out.println("└───────────────────────────────┘");
                        System.out.println();
                        System.out.println("""
                            Value out of range. 
                            Please select a valid option from the menu                
                                """);
                    }
                    {
                        System.out.println("─────────────────────────────────");
                        System.out.println("Press any Key to Continue>");

                        Scanner scan = new Scanner(System.in);
                        scan.nextLine();
                    }
                }
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
