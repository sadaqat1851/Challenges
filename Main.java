import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        
        System.out.println("Good Morning " + name);
        System.out.println(name + ", also tell your age.");
        
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        
       
        
        input.close(); // Closing the scanner to prevent resource leaks
    }
}
