package ch01.ex03print;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class App {
    public static void main(String[] args) throws IOException {

        int kor1 = 85;
        int kor2 = 90;
        int kor3 = 100;

        FileOutputStream fos = new FileOutputStream("res/kors.txt");
        PrintStream out = new PrintStream(fos);

        out.print(kor1);
        out.print(" ");
        out.print(kor2);
        out.print(" ");
        out.print(kor3);

        out.close();
        fos.close();

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
