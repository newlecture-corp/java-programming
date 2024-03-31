package ch01.ex02string;

public class App {
    public static void main(String[] args) {
        String greetring1 = new String("Hello");
        String greetring2 = "Hello";
        String greetring3 = "Hello";

        System.out.println(greetring1 == greetring3);
        System.out.println(greetring1.equals(greetring3));
    }
}
