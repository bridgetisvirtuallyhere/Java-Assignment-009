/*
@author Bridget Acosta
10/27/2022
 */
import java.util.Scanner;

public class ArrayProcessing { //Create a class named ArrayProcessing

    private int[] Arr1; //One array that will hold 5 objects of type int
    private Scanner scanner; //One Scanner object

    ArrayProcessing() {
        //Creates the array and Scanner objects
        this.Arr1 = new int[5];
        this.scanner = new Scanner(System.in);
    }

    //Create a method named, getNumbers, with a return type of void and no parameters
    public void getNumbers() {
        /* Uses a for loop to prompt and grab five integers from the terminal window
         * using the Scanner object and assign each one to an array element
         */
        for (int i = 0; i < Arr1.length; i++) { //Do not use the constant 5 in the for-loop test, use the length field.
            System.out.println("Enter an Integer: ");
            Arr1[i] = scanner.nextInt();
        }
    }

    //Create a method named, processNumbers, with a return type of void and no parameters
    public void processNumbers() {
        /* Uses an appropriate loop statement to:
         * Call the method printMenu
         * Test the result returned from printMenu
         * calls one of the processing methods: add, mult, print, reverse
         */
        int choice;
        while (this.again()) {
            choice = this.printMenu();
            switch (choice) {
                case 1:
                    add();
                    break;
                case 2:
                    mult();
                    break;
                case 3:
                    print();
                    break;
                case 4:
                    reverse();
                    break;
            }
        }
    }

    //Create a method named, printMenu, with a return type of int and no parameters
    public int printMenu() {
        //Prints the following menu to the terminal window
        System.out.println("Choose an option to perform: 1) Add numbers 2) Multiply numbers 3) Print numbers 4) Print number in reverse");
        int option = scanner.nextInt(); //Grabs input from the Scanner object and returns it to the calling statement
        return option;
    }

    //Create a method named, add, with a return type of void and no parameters
    public void add() {
        //Uses a for loop and the array length field to sum the numbers in the array and print the final sum, with the appropriate label, only once to the terminal window
        int sum = 0;
        for (int i = 0; i < Arr1.length; i++) {
            sum += Arr1[i];
        }
        System.out.println("The sum of the array: " + sum);
    }

    //Create a method named, mult, with a return type of void and no parameters
    public void mult() {
        //Uses a for loop and the array length field to multiply the numbers in the array together and print the final product, with the appropriate label, only once to the terminal window
        int mult = 1;
        for (int product : Arr1) {
            mult *= product;
        }
        System.out.println("The product of the array: " + mult);
    }

    //Create a method named, print, with a return type of void and no parameters
    public void print() {
        //Uses a for loop and the array length field to print each number, with the appropriate label, in the array to the terminal window
        for (int i = 0; i < Arr1.length; i++) {
            System.out.println("Each number of the array: " + Arr1[i]);
        }
    }

    //Create a method named, reverse, with a return type of void and no parameters
    public void reverse() {
        //Uses a for loop and the array length field to print each number in the array IN REVERSE ORDER, with the appropriate label, to the terminal window
        for (int i = Arr1.length - 1; i >= 0; i--) {
            System.out.println("Array in reverse order: " + Arr1[i]);
        }
    }

    //Create a method named, again, with a return type of boolean and no parameters
    public boolean again() {
        //Prompts the user to enter the integer 1 to choose another option or 2 to exit
        System.out.println("Enter 1) to process this array 2) to exit");
        int choice = scanner.nextInt(); //Grabs an int from the terminal using the Scanner object
        //Tests the number entered and returns true if the int is a 1 and false if it is something else
        if (choice == 1) {
            return true;
        } else {
            System.out.println("Arrivederci!");
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayProcessing obj = new ArrayProcessing();
        obj.getNumbers(); //Calls the method getNumbers
        obj.processNumbers(); //Calls the method processNumbers
    }
}
