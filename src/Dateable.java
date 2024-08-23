//There is a folk rule stating you should only date someone who is at least seven years older than half your age. For example, an 18-year-old needs to date somebody at least 16 years old ( 7 + ( 18 / 2 ) ).

//Produce a program that stores your age as an integer in a variable named age. The program then computes and displays the age of the youngest person for whom dating meets the folk rule.

//A sample program run could be :

//Prompt + input: Enter your age: 19

//Output: 19-year olds should date somebody who is at least 16 years old.

//Another sample program run could be:

//Prompt + input: Enter your age: 22

//Output: 22-year olds should date somebody who is at least 18 years old.


import java.util.Scanner;

public class Dateable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age:");
    int yourAge = -1;
    while (yourAge < 0) {
        try {
            yourAge = Integer.parseInt(scanner.nextLine());
        }
        catch (NumberFormatException e) {
            System.out.println("Please enter a valid number!");
        }
        System.out.println(yourAge + "-year olds should date somebody who is at least " + (yourAge/2+7) + " years old.");
    }
    }
}
