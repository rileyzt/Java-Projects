//Java Program to calculate the bill of staying in a resort

import java.io.*;

// Define the Bill1 class
class Bill1 {
  // Arrays to store item names, rates, ordered items, amounts, and pieces
  String item[] = { "CRICKET BAT", "BALL", "TENNIS", "GLOVES", "LONG TENNIS", "CRICKET PAD", "FOOTBALL", "CHESS BOARD",
      "SPORTS SHOE", "WICKET" };
  double rate[] = { 550, 160, 250, 220, 430, 310, 160, 120, 1230, 30 };
  String order[] = new String[10];
  double amt[] = new double[10];
  String ans;
  int pieces[] = new int[10];
  int i, n = 0, no, x = 0;
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  // Constructor for Bill1 class
  Bill1() {
    // Empty constructor
  }

  // Method to place orders
  public void putOrder() throws IOException {
    // Greeting and prompt for the number of guests and nights
    System.out.println("Welcome to St John's Central Retreat for the Mentally Fatigued.");
    System.out.println("To begin, please indicate how many people will be staying. ");
    int numberOfGuests = Integer.parseInt(br.readLine());
    System.out.println("Thank you. Now please tell us how long you plan on staying at our fine resort. ");
    int numberOfNights = Integer.parseInt(br.readLine());

    // Calculate room costs based on the number of guests and nights
    int singleRoom = numberOfGuests * 95 * numberOfNights;
    int doubleRoom = numberOfGuests * 80 * numberOfNights;
    int supplementalSingle = numberOfGuests * 65;
    int supplementalDouble = numberOfGuests * 50;

    // Display the cost of the stay
    if (numberOfNights <= 2 && numberOfGuests == 1) {
      System.out.println("For " + numberOfGuests + " guest staying for " +
          numberOfNights + " nights, it will cost " + "€" + singleRoom);
    } else if (numberOfNights <= 2 && numberOfGuests > 1) {
      System.out.println("For " + numberOfGuests + " guests staying for " +
          numberOfNights + " nights, it will cost " + "€" + doubleRoom);
    } else if (numberOfNights > 2 && numberOfGuests == 1) {
      System.out.println("For " + numberOfGuests + " guest staying for " +
          numberOfNights + " nights, it will cost " + "€" + supplementalSingle);
    }

    // Display available sports shop items
    System.out.println("**********************************************");
    System.out.println("........THE HERITAGE SPORTS SHOP......");
    System.out.println("*********************************************");
    System.out.println("Item No.         Item            Rate/piece");
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
      System.out.println("How many pieces?:");
      no = Integer.parseInt(br.readLine());
      pieces[x] = no;
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
    System.out.println("Item       Rate         No. of Pieces");
    for (i = 0; i < x; i++) {
      System.out.println((i + 1) + ":" + order[i] + "---" + amt[i] + "---" + pieces[i]);
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
        pieces[i] = pieces[i + 1];
      }
      x--;
    }

    // Display the final bill
    System.out.println("Cash Memo\n");
    System.out.println("*****************************************************************");
    System.out.println("Item          No. of pieces      Rate           Amount\n");
    System.out.println("***************************************************************");
    for (i = 0; i < x; i++) {
      System.out.print(order[i] + "             " + pieces[i] + "              " + amt[i] + "                      ");

      b = pieces[i] * amt[i];
      System.out.println(b);
      bamt = bamt + b;
    }

    // Apply discount based on the total amount
    if (bamt > 2500) {
      System.out.println("You have a discount of rupees 150");
      bamt = bamt - 150;
    } else if (bamt > 1500 && bamt <= 2500) {
      System.out.println("You have a discount of rupees 100");
      bamt = bamt - 100;
    } else {
      System.out.println("You have a discount of rupees 50");
      bamt = bamt - 50;
    }

    // Display the final bill amount with service charge
    System.out.println("Bill Amount Rs.                                     " + bamt);
    System.out.println("*******************");
    bamt = bamt + bamt * .125;
    System.out.println("Total Amount including service charge @ 12.5% Rs.                   " + bamt);
  }

  // Main method to start the program
  public static void main(String[] args) throws IOException {
    Bill1 bill = new Bill1(); // Create an instance of Bill1
    bill.putOrder(); // Call the putOrder method to start the order process
  }
}
