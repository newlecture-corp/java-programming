package ch03.ex16fornested;

public class App {
    public static void main(String[] args) {

        for(int i=0; i<50; i++)       
            System.out.printf("%d ", i%10+1);

        System.out.println("\n-----------------------------------");

        for(int j=0; j<5; j++)
            for(int i=0; i<10; i++)
                System.out.printf("%d ", i+1);

        System.out.println("\n-----------------------------------");

        for(int j=0; j<5; j++)
            for(int i=0; i<10-j; i++)
                System.out.printf("%d ", i+1);

        System.out.println("\n-----------------------------------");

        for(int y=0; y<5; y++){
            for(int x=0; x<10-y; x++)
                System.out.printf("%d ", x+1);

            System.out.println();
        }

        System.out.println("\n-----------------------------------");

        for(int y=0; y<10; y++){
            for(int x=0; x<10; x++)
                if(y==x)
                    System.out.printf("%c", '★');
                else
                    System.out.printf("%c", '　');

            System.out.println();
        }
        
    }
}
