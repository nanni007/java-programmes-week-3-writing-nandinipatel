package javaprogramsweek3writing;

import java.util.Scanner;

/**
 * 1. Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */
public class Programme_1_OddEvenTernaryOperator {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int number = scan.nextInt();
        isItOddOrEvenNumber(number);
        //close scanner
        scan.close();
    }
    //checking the number is even or odd
    public static void isItOddOrEvenNumber(int number){
        //ternary operator is used
        String evenOrOdd = (number%2==0)?"Even" : "Odd";
        System.out.println("The number " + number + " is " + evenOrOdd + " number.");
    }
}
