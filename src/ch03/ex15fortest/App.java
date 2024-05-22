package ch03.ex15fortest;

public class App {
    public static void main(String[] args) {
        // 1. for를 이용해서 숫자 1을 10개 출력하시오.
        for(int i=0; i<10; i++)
            System.out.printf("%d ", 1);

        System.out.println("----------------------------");

        // 2. for를 이용해서 숫자 1~10까지 10개 출력하시오.
        for(int i=0; i<10; i++)
            System.out.printf("%d ", i+1);

        System.out.println("----------------------------");

        // 문제 3 ) for 문을 이용해서 다음처럼 10 부터 1까지 출력하는 코드를 작성하시오. 
        for(int i=0; i<10; i++)
            System.out.printf("%d ", 10-i); // 10-0,10-1,10-2,10-3,

        System.out.println("----------------------------");

        // 문제 4 ) for 문을 이용해서 다음처럼 3 부터 7까지 5개의 숫자를 출력하는 코드를 작성하시오. 
        for(int i=0; i<5; i++)
            System.out.printf("%d ", 3+i); // 3+0,4+1,5+3,6,7

        System.out.println("----------------------------");

        // 문제 5 ) for 문을 이용해서 다음처럼 1 부터 9까지 숫자 중 홀수만 5개 출력하는 코드를 작성하시오. 
        // 1	3	5	7	9 공차수열 공차2, 초기항 1 => an = a1+(n-1)*d
        for(int i=0, n=1; i<5; i++, n++)
            System.out.printf("%d ", 1+(n-1)*2); // 

        System.out.println("----------------------------");


    }
}
