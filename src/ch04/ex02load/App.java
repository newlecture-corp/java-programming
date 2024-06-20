package ch04.ex02load;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        
        // 데이터 로드
        int[] kors = new int[18];
        int[] engs = new int[18];
        {
            FileInputStream fis = new FileInputStream("res/exams.csv");
            Scanner scan = new Scanner(fis);

            scan.nextLine(); // KOR,ENG,MATH

            for(int i=0; i<18; i++)
            {
                String line = scan.nextLine(); // 10,90,50
                String[] tokens = line.split(","); // ["10","90","50"]

                int kor = Integer.parseInt(tokens[0]);
                kors[i] = kor;
            }

            // {
            //     String line = scan.nextLine(); // 20,30,40
            //     String[] tokens = line.split(","); // ["20","30","40"]

            //     int kor = Integer.parseInt(tokens[0]);
            //     kors[1] = kor;
            // }


            scan.close();
            fis.close();
        }

        // 배열 출력
        {
            System.out.println(Arrays.toString(kors));
        }

        //  자리바꾸기
        {
             int temp;
             temp = kors[4];
             kors[4] = kors[5];
             kors[5] = temp;
        }

        // 배열 출력
        {
            System.out.println(Arrays.toString(kors));
        }

    }    
}
