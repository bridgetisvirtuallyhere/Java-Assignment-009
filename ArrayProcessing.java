import java.util.Scanner;

public class ArrayProcessing { //Create a class named ArrayProcessing

    private int[] Arr1; //One array that will hold 5 objects of type int
    private Scanner scanner; //One Scanner object

    ArrayProcessing() {

        //Creates the array and Scanner objects
        this.Arr1 = new int[5];
        this.scanner = new Scanner(System.in);
        getNumbers(); //Calls the method getNumbers
        processNumbers(); //Calls the method processNumbers

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
        int i;
        for (i = 0; i < 5; i++) {
            if (printMenu() == 1) {
                add();
            } else if (printMenu() == 2) {
                multi();
            } else if (printMenu() == 3) {
                print();
            } else if (printMenu() == 4) {
                reverse();
            }
        }

        //Create a method named, printMenu, with a return type of int and no parameters
        public int printMenu () {
            System.out.println("Choose an option to perform: 1) Add numbers 2) Multiply numbers 3) Print numbers /n4) Print number in reverse");
        }

        public static void main (String[]args){
            ArrayProcessing obj = new ArrayProcessing();
        }
    }
}
