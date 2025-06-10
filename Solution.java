/*public class Assignment{
    public static void main(String[] args){
        int myInt = 9;
        System.out.println(myInt);
        int newInt = myInt;
        System.out.println(newInt);
    }
}

//Challenege # 7 
public class SwapNumbers {
    public static void main(String[] args){
        int firstnumber = 10;
        int secondnumber = 30;
        System.out.println("Before Swap:");
        System.out.println("First Number: " + firstnumber);
        System.out.println("Second Number: " + secondnumber);
        System.out.println("Swapping the numbers...");
        int temp = firstnumber;
        firstnumber = secondnumber;
        secondnumber = temp;
        System.out.println("After Swap:");
        System.out.println("First Number: " + firstnumber);
        System.out.println("Second Number: " + secondnumber);
    }
}*/

/*import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Swap Numbers Program!");
        System.out.println("Please enter the value A :");
        int a = input.nextInt();
        System.out.println("Please enter the value B :");
        int b = input.nextInt();

        int c = a;
        a = b;
        b = c;
        System.out.println("Value of A is: " + a);
        System.out.println("Value of B is: " + b);
        input.close();

    }
}



public class Arthimetics{
    public static void main(String[] args){
        float a = 20;
        float b = 7;

        float sum = a + b;
        float differnce = a - b;
        float multiplication = a * b;
        float division = a/b;
        float modulus = a % b;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + differnce);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
        System.out.println("Modulus: : " + modulus);
    }
}
 public class MultipleOperator{
    public static void main(String[] args){
        int a = 2;
        int b = 6;
        int c = 4;

        int result = a + b * c; 
        System.out.println("Result of a + b * c: " + result);
        int result2 = (b / a) + c * a;
        System.out.println("Result of (b / a) + c * a: " + result2);
    }
 }
import java.util.Scanner;
 public class ShortHand{
    public static void main(String[] args) {
        int a = 10;
        Scanner input = new Scanner(System.in);
        int x1 = input.nextInt(); 
        a = a + x1;
        System.out.println("Value of A is: " + a);
        int x2 = input.nextInt();
        a = a - x2;
        System.out.println("Value of A is: " + a);
        int x3 = input.nextInt();
        a = a *  x3;
        System.out.println("Value of A is: " + a);
        int x4 = input.nextInt();
        a = a / x4;
       System.out.println("Value of A is: " + a);
    }
 }
import java.util.scanner;
public class WeirdNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number N:");
        int N = input.nextInt();
        if(N % 2 == 0){
            System.out.println("Even quantity");
        } else if(N % 2 ==0 && N >= 2 && N <= 5){
            System.out.println("Not Weird");
        } else if(N % 2 == 0 && N >= 6 && N <= 20){
            System.out.println("Weird");
        } else if(N % 2 == 0 && N > 20){
            System.out.println("Not Weird");
        } else {
            System.out.println("Weird");
        }
       
        
    }
}*/

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();
        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        scan.close();
    }
}