package ch17pc05;

import java.util.Scanner;
import static ch17pc05.AccountValidator.*;


/**
 * 
 * @author frank
 */
public class Ch17pc05 {

    /**
     * The Main Method
     * @param args String[] The command line arguments
     */
    public static void main(String[] args) {
        // Variables
        int[] validNumbers = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 8080152, 4562555, 5552012, 5050552, 7825877, 1250255, 1005231, 6545231, 3852085, 7576651, 7881200, 4581002};
        int x = 0;
        
        IntQuickSorter.quickSort(validNumbers);
        
        // Instantiate Scanner
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Welcome to Account Number Validator.");
        System.out.print("Please enter an integer (7 digits): ");
        x = keyboard.nextInt();
        System.out.println("Calculating...");
        
        if (validated(validNumbers, x)) {
            System.out.println("The account number is valid.");
        } else {
            System.out.println("The account number is invalid.");
        }
    }
}
