/*CIS/SWE/24/005
  WUNUKEN AMAYIKAI
   SOFTWARE ENGINEERING*/

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {

        // Create Scanner to receive user input
        Scanner input = new Scanner(System.in);

        // Ask for first name
        System.out.print("Enter your first name: ");
        String firstName = input.nextLine();

        // Ask for last name
        System.out.print("Enter your last name: ");
        String lastName = input.nextLine();

        // Display the welcome message
        System.out.println("Welcome, " + lastName + " " + firstName);

        input.close();
    }
}

