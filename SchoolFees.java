import java.util.Scanner;

/**
 * Objective: This program simulates a fee management system where users can 
 * select different types of fees (e.g., admission, security deposit, annual charges, 
 * monthly fees, transport fees, and optional charges), deposit the required amount, 
 * and view their total balance.
 */
public class HelloWorld1 {

    public static void main(String[] args) {

        // Create a Scanner object for reading user input
        Scanner in = new Scanner(System.in);

        // Variable to store the user's main menu choice
        int userChoice;

        // Variables for sub-menu choices
        int userChoiceMonthlyFee, userOptionalMonthlyFee;

        // Flags to track if certain fees have already been paid
        int ADMISSIONflag = 0;  
        int SECURITYflag = 0;
        int TRANSPORTflag = 0;

        // Flags to track when to quit loops
        boolean mainQuit = false;  
        boolean monthlyQuit = false;
        boolean optionalQuit = false;
        boolean transportQuit = false;

        // Variable to store the total balance
        float balance = 0f;

        // Main menu loop
        do {

            // Display main menu options
            System.out.println("1. ADMISSION FEE :");
            System.out.println("2. SECURITY DEPOSIT :");
            System.out.println("3. ANNUAL CHARGES :");
            System.out.println("4. MONTHLY FEE :");
            System.out.println("5. MONTHLY TRANSPORT FEES :");
            System.out.println("6. OPTIONAL CHARGES");
            System.out.print("Your choice, 0 to quit: ");

            // Get the user's choice from the main menu
            userChoice = in.nextInt();

            // Handle the user's choice
            switch (userChoice) {

                case 1:  // Admission Fee
                    float admitionFee;  // Variable to store the admission fee amount
                    System.out.print("Amount to deposit: ");
                    admitionFee = in.nextFloat();  // Get the admission fee amount from the user
                    if (ADMISSIONflag == 0) {  // Check if the admission fee has not already been paid
                        if (admitionFee == 16000) {  // Check if the entered amount is correct
                            balance += admitionFee;  // Add the amount to the balance
                            System.out.println("Rs: " + admitionFee + " has been deposited successfully.");
                            ADMISSIONflag = 1;  // Set the flag to indicate the fee has been paid
                        } else {
                            System.out.println("Amount is incorrect. Please try again.");
                        }
                    } else {
                        System.out.println("You have already deposited your Admission fee.");
                    }
                    break;

                case 2:  // Security Deposit
                    if (SECURITYflag == 0) {  // Check if the security deposit has not already been paid
                        float SECURITY;  // Variable to store the security deposit amount
                        System.out.print("Amount to deposit: ");
                        SECURITY = in.nextFloat();  // Get the security deposit amount from the user
                        if (SECURITY == 4000) {  // Check if the entered amount is correct
                            balance += SECURITY;  // Add the amount to the balance
                            System.out.println("Rs: " + SECURITY + " has been deposited successfully. Your balance: Rs = " + balance);
                            SECURITYflag = 1;  // Set the flag to indicate the fee has been paid
                        } else {
                            System.out.println("Amount is incorrect. Please try again.");
                        }
                    } else {
                        System.out.println("You have already deposited your Security fee.");
                    }
                    break;

                case 3:  // Annual Charges
                    float annualCharge;  // Variable to store the annual charge amount
                    System.out.print("Annual Charge Amount to deposit: ");
                    annualCharge = in.nextFloat();  // Get the annual charge amount from the user
                    if (annualCharge == 1800) {  // Check if the entered amount is correct
                        balance += annualCharge;  // Add the amount to the balance
                        System.out.println("Rs: " + annualCharge + " has been deposited successfully. Your balance: Rs = " + balance);
                    } else {
                        System.out.println("Amount is incorrect. Please try again.");
                    }
                    break;

                case 4:  // Monthly Fee
                    System.out.println("*******ENTER YOUR MONTHLY FEES***********");
                    float mtfx;  // Variable to store the monthly tuition fee for NR-X
                    float mtfxiToXii;  // Variable to store the monthly tuition fee for XI-XII
                    monthlyQuit = false;  // Reset the monthly menu quit flag

                    // Monthly fee sub-menu loop
                    do {
                        // Display Monthly Fee menu options
                        System.out.println("1. MONTHLY TUITION FEE (NR-X):");
                        System.out.println("2. MONTHLY TUITION FEE (XI-XII):");
                        System.out.println("3. MAINTENANCE CHARGES:");
                        System.out.println("4. MONTHLY COMPUTER FEE (STD 1-X):");
                        System.out.println("5. MONTHLY COMPUTER FEE (STD XI-XII):");
                        System.out.println("6. MONTHLY LABORATORY FEES (STD IX & X ONLY):");
                        System.out.println("7. MONTHLY LABORATORY FEES (STD IX & X ONLY):");
                        System.out.print("Your choice, 0 to quit: ");
                        userChoiceMonthlyFee = in.nextInt();  // Get the user's choice from the monthly fee menu

                        // Handle the user's choice in the monthly fee menu
                        switch (userChoiceMonthlyFee) {
                            case 1:
                                System.out.print("MONTHLY TUITION FEE(X) Amount to deposit: ");
                                mtfx = in.nextFloat();  // Get the monthly tuition fee amount for NR-X
                                if (mtfx == 1200) {  // Check if the entered amount is correct
                                    balance += mtfx;  // Add the amount to the balance
                                    System.out.println("Rs: " + mtfx + " has been deposited successfully. Your balance: Rs = " + balance);
                                } else {
                                    System.out.println("Amount is incorrect. Please try again.");
                                }
                                break;

                            case 2:
                                System.out.print("MONTHLY TUITION FEE(XI & XII) Amount to deposit: ");
                                mtfxiToXii = in.nextFloat();  // Get the monthly tuition fee amount for XI-XII
                                if (mtfxiToXii == 1500) {  // Check if the entered amount is correct
                                    balance += mtfxiToXii;  // Add the amount to the balance
                                    System.out.println("Rs: " + mtfxiToXii + " has been deposited successfully. Your balance: Rs = " + balance);
                                } else {
                                    System.out.println("Amount is incorrect. Please try again.");
                                }
                                break;

                            case 0:
                                monthlyQuit = true;  // Set the flag to exit the monthly fee menu
                                break;

                            default:
                                System.out.println("Wrong choice. Please try again.");
                                break;
                        }
                    } while (!monthlyQuit);  // Continue looping until the user chooses to quit

                    System.out.println("Bye!");
                    break;

                case 5:  // Monthly Transport Fees
                    if (TRANSPORTflag == 0) {  // Check if the transport fee has not already been paid
                        System.out.println("*******************************************************************");
                        System.out.println("******PAY YOUR TRANSPORT FEES AFTER SEEING YOUR LOCATION ***********");
                        System.out.println("*******************************************************************");
                        transportQuit = false;  // Reset the transport menu quit flag

                        // Transport fee sub-menu loop
                        do {
                            // Display Transport Fee menu options
                            System.out.println("1. Ulhaas / Joteram / Gangpur   [fare charge Rs.430]:");
                            System.out.println("2. Burdwan Town / DM Bungalow / Kalna Gate / Saktigarh / Bursul [fare charge Rs. 530]:");
                            System.out.println("3. Rasulpur / Agriculture farm / Raipur [fare charge Rs. 630]: ");
                            System.out.println("4. Kalanabagram / Bishnupur [fare charge Rs.680 ]:");
                            System.out.println("5. Memari / Palla Road/ Atagarh / Kashiara Polempur to Sehera bazaar [fare charge Rs. 730]:");
                            System.out.println("6. Magalmari More / Palsit / Putunda / Renesha [fare charge Rs. 930 ]:");
                            System.out.println("7. Boinchee [fare charge Rs. 1130]:");
                            System.out.print("Your choice, 0 to quit: ");
                            userChoiceMonthlyFee = in.nextInt();  // Get the user's choice from the transport fee menu

                            // Handle the user's choice in the transport fee menu
                            switch (userChoiceMonthlyFee) {
                                case 1:
                                    System.out.println("*******************************************************************");
                                    System.out.println("****** YOUR TRANSPORT FEES IS SUCCESSFULLY PAID *********");
                                    System.out.println("*******************************************************************");
                                    balance += 430;  // Add the fare to the balance
                                    TRANSPORTflag = 1;  // Set the flag to indicate the fee has been paid
                                    break;

                                case 2:
                                    System.out.println("*******************************************************************");
                                    System.out.println("****** YOUR TRANSPORT FEES IS SUCCESSFULLY PAID *********");
                                    System.out.println("*******************************************************************");
                                    balance += 530;  // Add the fare to the balance
                                    TRANSPORTflag = 1;  // Set the flag to indicate the fee has been paid
                                    break;

                                case 3:
                                    System.out.println("*******************************************************************");
                                    System.out.println("****** YOUR TRANSPORT FEES IS SUCCESSFULLY PAID *********");
                                    System.out.println("*******************************************************************");
                                    balance += 630;  // Add the fare to the balance
                                    TRANSPORTflag = 1;  // Set the flag to indicate the fee has been paid
                                    break;

                                case 4:
                                    System.out.println("*******************************************************************");
                                    System.out.println("****** YOUR TRANSPORT FEES IS SUCCESSFULLY PAID *********");
                                    System.out.println("*******************************************************************");
                                    balance += 680;  // Add the fare to the balance
                                    TRANSPORTflag = 1;  // Set the flag to indicate the fee has been paid
                                    break;

                                case 5:
                                    System.out.println("*******************************************************************");
                                    System.out.println("****** YOUR TRANSPORT FEES IS SUCCESSFULLY PAID *********");
                                    System.out.println("*******************************************************************");
                                    balance += 730;  // Add the fare to the balance
                                    TRANSPORTflag = 1;  // Set the flag to indicate the fee has been paid
                                    break;

                                case 6:
                                    System.out.println("*******************************************************************");
                                    System.out.println("****** YOUR TRANSPORT FEES IS SUCCESSFULLY PAID *********");
                                    System.out.println("*******************************************************************");
                                    balance += 930;  // Add the fare to the balance
                                    TRANSPORTflag = 1;  // Set the flag to indicate the fee has been paid
                                    break;

                                case 7:
                                    System.out.println("*******************************************************************");
                                    System.out.println("****** YOUR TRANSPORT FEES IS SUCCESSFULLY PAID *********");
                                    System.out.println("*******************************************************************");
                                    balance += 1130;  // Add the fare to the balance
                                    TRANSPORTflag = 1;  // Set the flag to indicate the fee has been paid
                                    break;

                                case 0:
                                    transportQuit = true;  // Set the flag to exit the transport fee menu
                                    break;

                                default:
                                    System.out.println("Wrong choice. Please try again.");
                                    break;
                            }
                        } while (!transportQuit);  // Continue looping until the user chooses to quit

                        System.out.println("Bye!");
                    } else {
                        System.out.println("*******************************************************************");
                        System.out.println("****** YOUR TRANSPORT FEES HAS BEEN ALREADY PAID *********");
                        System.out.println("*******************************************************************");
                    }
                    break;

                case 6:  // Optional Charges
                    System.out.println("******* OPTIONAL MONTHLY FEES ***********");
                    optionalQuit = false;  // Reset the optional menu quit flag

                    // Optional charges sub-menu loop
                    do {
                        // Display Optional Fees menu options
                        System.out.println("1. MONTHLY Karate fee 300/pm:");
                        System.out.println("2. MONTHLY Swimming fee 50/pm:");
                        System.out.print("Your choice, 0 to quit: ");
                        userOptionalMonthlyFee = in.nextInt();  // Get the user's choice from the optional fee menu

                        // Handle the user's choice in the optional fee menu
                        switch (userOptionalMonthlyFee) {
                            case 1:
                                float karate;  // Variable to store the karate fee amount
                                System.out.print("MONTHLY Karate fee Amount to deposit: ");
                                karate = in.nextFloat();  // Get the karate fee amount from the user
                                if (karate == 300) {  // Check if the entered amount is correct
                                    balance += karate;  // Add the amount to the balance
                                    System.out.println("Rs: " + karate + " has been deposited successfully. Your balance: Rs = " + balance);
                                } else {
                                    System.out.println("Amount is incorrect. Please try again.");
                                }
                                break;

                            case 2:
                                float swimming;  // Variable to store the swimming fee amount
                                System.out.print("MONTHLY Swimming fee Amount to deposit: ");
                                swimming = in.nextFloat();  // Get the swimming fee amount from the user
                                if (swimming == 50) {  // Check if the entered amount is correct
                                    balance += swimming;  // Add the amount to the balance
                                    System.out.println("Rs: " + swimming + " has been deposited successfully. Your balance: Rs = " + balance);
                                } else {
                                    System.out.println("Amount is incorrect. Please try again.");
                                }
                                break;

                            case 0:
                                optionalQuit = true;  // Set the flag to exit the optional fee menu
                                break;

                            default:
                                System.out.println("Wrong choice. Please try again.");
                                break;
                        }
                    } while (!optionalQuit);  // Continue looping until the user chooses to quit

                    System.out.println("Bye!");
                    break;

                case 0:  // Exit Main Menu
                    mainQuit = true;  // Set the flag to exit the main menu
                    break;

                default:
                    System.out.println("Wrong choice. Please try again.");
                    break;
            }
        } while (!mainQuit);  // Continue looping until the user chooses to quit the main menu

        // Display the total amount to be paid
        System.out.println("AMOUNT YOU HAVE TO PAY=========" + balance);
        System.out.println("Bye!");
    }
}
