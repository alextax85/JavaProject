import java.util.Scanner;

public class main {
    public static void main(String[] args) {
       // String name =("Alexandr");
       //int count = name.length();
       //System.out.println(count);
        System.out.println("Enter your name:");
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        System.out.println("Enter your age:");
        int age = console.nextInt();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);


            }

}
