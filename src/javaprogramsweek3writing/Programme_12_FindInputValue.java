package javaprogramsweek3writing;

import java.util.Scanner;

public class Programme_12_FindInputValue {
    public static void main(String[] args) {
        //Scanner declaration for reading from console
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any character: ");
        char ch = scan.next().charAt(0);
        //object creation
        Programme_12_FindInputValue obj = new Programme_12_FindInputValue();
        obj.checkInputValueIsAlphabetNumberOrSymbol(ch);
        //close scanner
        scan.close();
    }

    //find the input value is ALPHABET, DIGIT or SYMBOL
    public void checkInputValueIsAlphabetNumberOrSymbol(char ch) {
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is a ALPHABET");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a DIGIT");
        }else {
            System.out.println(ch + " is a SYMBOL");
        }
    }


}
