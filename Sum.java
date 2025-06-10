import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Welcome to my Calculator!");
        System.out.println("Please Enter First Number: ");
        int firstnumber = input.nextInt();
        System.out.println("Please Enter Second Number: ");
        int secondnumber = input.nextInt();
        int sum = firstnumber + secondnumber;
        System.out.println("Sum of your number is : " + sum);
    }
}