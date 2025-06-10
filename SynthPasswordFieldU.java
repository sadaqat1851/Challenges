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
    //shorthand operators
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
uniary operators
public class Crement{
    public static void main(String[] args) {
        int a = 10;
   
        System.out.println(--a);
        System.out.println(a);
           
    }
}
//Challenge # 8
import java.util.Scanner;

import javax.swing.plaf.synth.SynthPasswordFieldUI;
public class ArthimeticOperators{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Arithmetic Operators Program!");
        System.out.println("please enter the value of A: ");
        int A = input.nextInt();
        System.out.println("please enter the value of B:");
        int B = input.nextInt();
        int sum = A + B;
        System.out.println("Sum of A and B is: " + sum);
        int difference = A - B;
        System.out.println("Difference of A and B is: " + difference);
        int mutiplication = A * B;
        System.out.println("Multiplication of A and B is: " + mutiplication);
        int division = A / B;
        System.out.println("Division of A and B is: " + division);
        int modulus = A % B;
       System.out.println("Modulus of A and B is:" + modulus);
       input.close();
    }
}*/

import java.util.Scanner;
public class Sadaqat{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Product of Floating Values");
        float a = input.nextFloat();
        float b = input.nextFloat();
        float product = a * b;
        System.out.println("The product of float numbers: " + product); 
        input.close();
    }
}