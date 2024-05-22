package ch03.ex16fornested;

public class App {
    public static void main(String[] args) {

        for(int i=0; i<50; i++)       
            System.out.printf("%d ", i%10+1);

        System.out.println("\n-----------------------------------");

        for(int j=0; j<5; j++)
            for(int i=0; i<10; i++)       
                System.out.printf("%d ", i+1);
        
    }
}
