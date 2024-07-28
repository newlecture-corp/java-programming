package ch04.ex02load;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        
        // 데이터 로드
        int capacity = 3;
        int size = 0;
        int[] kors = new int[capacity];
        int[] engs = new int[capacity];
        {
            FileInputStream fis = new FileInputStream("res/exams.csv");
            Scanner scan = new Scanner(fis);

            scan.nextLine(); // KOR,ENG,MATH

            
            for(int i=0; scan.hasNextLine(); i++)
            {
                String line = scan.nextLine(); // 10,90,50
                String[] tokens = line.split(","); // ["10","90","50"]

                int kor = Integer.parseInt(tokens[0]);

                if(capacity <= i){ // 공간이 부족하다면
                    // 공간을 늘려주고
                    // 1. 새로운 크기의 배열을 준비 temp
                    int[] temp = new int[capacity+1];

                    // 2. 기존 배열의 값들을 temp 배열로 이전
                    for(int j=0; j<capacity; j++)
                        temp[j] = kors[j];

                    // 3. temp 배열에 kors 이름을 부여한다.
                    kors = temp;
                    // 4. capacity 값을 변경
                    capacity += 1;
                }
                kors[i] = kor;
                size++;
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

        // for(int j=0; j<17; j++)
        //     for(int i=0; i<17-j; i++)            
        //         if(kors[0+i] < kors[1+i])
        //         {
        //             int temp;
        //             temp = kors[0+i];
        //             kors[0+i] = kors[1+i];
        //             kors[1+i] = temp;
        //         }

        Arrays.sort(kors);         
        
        // 배열 출력
        {
            System.out.printf("%x\n", kors.hashCode());
            System.out.println(Arrays.toString(kors));            

        }

    }    
}
