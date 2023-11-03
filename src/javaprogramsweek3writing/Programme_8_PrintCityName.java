package javaprogramsweek3writing;

import java.util.Scanner;

public class Programme_8_PrintCityName {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Alphabet between A to F: ");
        char city = scan.next().charAt(0);
        //object creation
        Programme_8_PrintCityName obj = new Programme_8_PrintCityName();
        obj.printCityName(city);
        //close scanner
        scan.close();
    }
//printing city name
    public void printCityName(char city){
        if (city=='A' || city=='a'){
            System.out.println("Aberdeen");
        }else if(city=='B'||city=='b'){
            System.out.println("Belfast");
        }else if (city=='C'||city=='c'){
            System.out.println("Cambridge");
        }else if (city=='D'||city=='d'){
            System.out.println("Derby");
        }else if (city=='E'||city=='e'){
            System.out.println("Edinburgh");
        }else if (city=='F'||city=='f'){
            System.out.println("Feltham");
        }else {
            System.out.println("Invalid input. Enter alphabet between A to F");
        }
    }
}
