//Java program to calculate the total bill for staying in Hotel Heritage

import java.io.*;

// Define the Bill class
class Bill {
    // Arrays to store item names, rates, ordered items, amounts, and plates
    String item[] = { "FRIED RICE", "CHILLI CHICKEN", "MUTTON KOSHA", "TANDURI ROTI", "PANEER MASALA", "SAHI BIRIYANI",
            "CHICKEN MASALA", "MIXED CHOWMIN", "SABJI FRY", "COLD DRINKS" };
    double rate[] = { 150, 160, 250, 120, 30, 110, 160, 100, 130, 30 };
    String order[] = new String[10];
    double amt[] = new double[10];
    String ans;
    int plates[] = new int[10];
    int i, n = 0, no, x = 0;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // Constructor for Bill class
    Bill() {
        // Empty constructor
    }

    // Method to place orders
    public void putOrder() throws IOException {
        // Greeting and prompt for the number of guests and nights
        System.out.println("Welcome to HOTEL HERITAGE.");
        System.out.println("To begin, please indicate how many people will be staying. ");
        int numberOfGuests = Integer.parseInt(br.readLine());
        System.out.println("Thank you. Now please tell us how long you plan on staying at our fine HOTEL. ");
        int numberOfNights = Integer.parseInt(br.readLine());

        // Prompt user to choose room type
        System.out.println("Please choose room type");
        System.out.println("1. Super Delux");
        System.out.println("2. Delux");
        System.out.println("3. Normal Double");
        System.out.println("4. Normal Single");
        System.out.println("Please enter your choice");
        int ch1 = Integer.parseInt(br.readLine());

        // Calculate room rent based on room type and number of nights
        int rent = 0;
        if (ch1 == 1) {
            rent = (numberOfGuests * 1200) * numberOfNights;
        } else if (ch1 == 2) {
            rent = (numberOfGuests * 1000) * numberOfNights;
        } else if (ch1 == 3) {
            rent = (numberOfGuests * 750) * numberOfNights;
        } else if (ch1 == 4) {
            rent = (numberOfGuests * 500) * numberOfNights;
        } else {
            System.out.println("Wrong choice");
        }

        // Display the total bill for lodging
        System.out.println("Total bill for lodging=" + rent);

        // Display available menu items
        System.out.println("**********************************************");
        System.out.println("HOTEL HERITAGE - MENU CARD");
        System.out.println("*********************************************");
        System.out.println("Item No.         Item            Rate/plate");
        for (i = 0; i < 10; i++) {
            System.out.println((i + 1) + ":                " + item[i] + "------------------" + rate[i]);
        }

        // Prompt the user to order at least 2 items
        System.out.println("You have to order at least 2 items. Enter item number to place order\n");

        // Loop to take item orders
        while (true) {
            if (x == 10)
                break;
            System.out.println("Enter item number:");
            no = Integer.parseInt(br.readLine());
            order[x] = item[no - 1];
            amt[x] = rate[no - 1];
            System.out.println("How many plates?:");
            no = Integer.parseInt(br.readLine());
            plates[x] = no;
            x++;
            if (x > 1) {
                System.out.println("Any More Item ?(Y/N):");
                ans = br.readLine().toUpperCase();
                if (ans.equals("N"))
                    break;
            }
        }

        // Call method to show the bill
        showBill();
    }

    // Method to show the bill
    private void showBill() throws IOException {
        double bamt = 0, b;
        System.out.println("You have ordered\n");
        System.out.println("Item       Rate         No. of Plates");
        for (i = 0; i < x; i++) {
            System.out.println((i + 1) + ":" + order[i] + "---" + amt[i] + "---" + plates[i]);
        }

        // Option to cancel items
        while (true) {
            if (x < 2)
                break;
            System.out.println("Want to cancel any item (Y/N):");
            ans = br.readLine().toUpperCase();
            if (ans.equals("N"))
                break;
            System.out.println("Which item to cancel, enter item number:");
            no = Integer.parseInt(br.readLine());
            for (i = no - 1; i < x - 1; i++) {
                order[i] = order[i + 1];
                amt[i] = amt[i + 1];
                plates[i] = plates[i + 1];
            }
            x--;
        }

        // Display the final bill
        System.out.println("Cash Memo\n");
        System.out.println("*****************************************************************");
        System.out.println("Item          No. of plates      Rate           Amount\n");
        System.out.println("***************************************************************");
        for (i = 0; i < x; i++) {
            System.out.print(order[i] + "             " + plates[i] + "              " + amt[i] + "                      ");

            b = plates[i] * amt[i];
            System.out.println(b);
            bamt = bamt + b;
        }

        // Display the final bill amount with service charge
        System.out.println("Bill Amount Rs.                                     " + bamt);
        System.out.println("*******************");
        bamt = bamt + bamt * .125;
        System.out.println("Total Amount including service charge @ 12.5% Rs.                   " + bamt);
    }

    // Main method to start the program
    public static void main(String[] args) throws IOException {
        Bill bill = new Bill();  // Create an instance of Bill
        bill.putOrder();         // Call the putOrder method to start the order process
    }
}
