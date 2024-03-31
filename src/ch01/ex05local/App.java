package ch01.ex05local;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {

        int kor1 = 0;
        int kor2 = 0;
        int kor3 = 0;

        // 성적로드
        {
            FileInputStream fis = new FileInputStream("res/kors.txt");        
            Scanner scan = new Scanner(fis);

            kor1 = scan.nextInt(); // 85
            kor2 = scan.nextInt(); // 90
            kor3 = scan.nextInt(); // 100
            kor1++;

            scan.close();
            fis.close();
        }
        
        // 성적입력
        {
            Scanner scan = new Scanner(System.in);
            System.out.print("kor1:");
            kor1 = scan.nextInt();
            System.out.print("kor2:");
            kor2 = scan.nextInt();
            System.out.print("kor3:");
            kor3 = scan.nextInt();

            scan.close();
        }

        // 성적저장
        {
            FileOutputStream fos = new FileOutputStream("res/kors.txt");
            PrintStream out = new PrintStream(fos);

            out.print(kor1);
            out.print(" ");
            out.print(kor2);
            out.print(" ");
            out.print(kor3);

            out.close();
            fos.close();
        }

        // 성적출력
        {
            int total = kor1+kor2+kor3;
            float avg = total/3.0f;

            System.out.println("┌─────────────────┐");
            System.out.println("│     성적 출력   │");
            System.out.println("└─────────────────┘");
        
            System.out.printf("kor1 : %10d(%1$x), %1$o\n", kor1);        
            System.out.printf("kor2 : %d\n", kor2);        
            System.out.printf("kor3 : %-10d(%x)\n", kor3, kor3);
            System.out.printf("total : %d\n", total);
            System.out.printf("avg : %6.2f\n", avg);
        }
        
        
    }
}
