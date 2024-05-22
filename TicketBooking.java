import java.io.*;

/**
 * Objective: This program simulates a train ticket booking system where the user can input
 * journey details, passenger details, and calculate the fare for the journey. It also generates
 * a summary of the booked tickets and the total fare in both numerical and word formats.
 */

class TicketBooking {
    // Variables for booking and storing passenger details
    int i, x = 0, index = 0, w = 0;
    int c = 0;
    String names[], adharNo[], gender[];
    String wnames[], wadharNo[], wgender[];
    int age[], wage[];
    String ans, start = "", end = "", trainname = "";
    int trainNo = 0;
    int startDistance, endDistance, fareDistance, fareCost;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int booked[] = new int[100];

    // Constructor to initialize arrays and set default values
    TicketBooking() {
        names = new String[100];
        adharNo = new String[100];
        gender = new String[100];
        age = new int[100];
        wnames = new String[100];
        wadharNo = new String[100];
        wgender = new String[100];
        wage = new int[100];
        for (int i = 0; i < 100; i++)
            booked[i] = -1;
    }

    // Method to take all necessary data from the user
    public void takeDataFromUser() throws Exception {
        jurneyDetails();
        passengerDetails();
        fareAmount();
    }

    // Method to input journey details from the user
    public void jurneyDetails() throws Exception {
        System.out.print("\nName Of The Boarding Station: ");
        start = br.readLine();
        System.out.print("\nName Of The Destination Station: ");
        end = br.readLine();
        System.out.print("\nTrain No. (5 digit): ");
        trainNo = Integer.parseInt(br.readLine());
        System.out.println("Enter the train name: ");
        trainname = br.readLine();
    }

    // Method to input passenger details from the user
    void passengerDetails() throws Exception {
        while (true) {
            System.out.print("##############################  Passenger Details  ###############################");
            System.out.print("\n");
            System.out.print("\nPassenger Name: ");
            names[x] = br.readLine();
            System.out.print("\nAdhar No. (12 digit): ");
            adharNo[x] = br.readLine();
            System.out.print("\nAge: ");
            age[x] = Integer.parseInt(br.readLine());
            System.out.print("\nGender: ");
            gender[x] = br.readLine();
            c++;
            x++;
            if (c == 6)
                break;
            System.out.print("\nAny More Member (y/n): ");
            ans = br.readLine();
            if (ans.equalsIgnoreCase("N"))
                break;
        }
    }

    // Method to calculate and display fare amount
    void fareAmount() throws Exception {
        int famt1 = 1800, famt = 0;
        System.out.print("\n Fare Amount Per Head (Rs.): " + famt1);

        for (i = 0; i < 100; i++) {
            if (booked[i] < 0)
                index++;
        }
        System.out.println("\n ################################### Welcome To Eastern Railway  ########################################\n");
        System.out.println("\n Confirmed Your Tickets\n");
        System.out.println("\n  Train No  Train Name  Passenger Name  Adhar No  Age  Gender  Fare (Rs.)   \n");

        for (i = x - c; i < x; i++) {
            for (int j = 0; j < 100; j++) {
                if (booked[j] == -1) {
                    booked[j] = 0;
                    break;
                }
            }
            if (age[i] <= 12) {
                famt += famt1 / 2;
                System.out.println("  " + trainNo + " " + trainname + "     " + names[i] + "             " + adharNo[i] + "     " + age[i] + "     " + gender[i] + "      " + (famt1 / 2));
            } else {
                famt += famt1;
                System.out.println("  " + trainNo + " " + trainname + "     " + names[i] + "              " + adharNo[i] + "    " + age[i] + "     " + gender[i] + "     " + famt1);
            }
        }
        System.out.println("");
        System.out.println("Total (Rs.): " + famt);
        System.out.println("In Words Rs: " + numToWord(famt));
    }

    // Method to convert number to words
    String numToWord(int n) {
        String str = "";
        int zero = 0, i, rev = 0, n1;
        n1 = n;
        while (true) {
            if (n % 10 == 0)
                zero++;
            else
                break;
            n = n / 10;
        }
        n = n1;
        for (i = n; i > 0; i = i / 10) {
            rev = rev * 10 + i % 10;
        }
        while (rev > 0) {
            switch (rev % 10) {
                case 0:
                    str = str + " Zero";
                    break;
                case 1:
                    str = str + " One";
                    break;
                case 2:
                    str = str + " Two";
                    break;
                case 3:
                    str = str + " Three";
                    break;
                case 4:
                    str = str + " Four";
                    break;
                case 5:
                    str = str + " Five";
                    break;
                case 6:
                    str = str + " Six";
                    break;
                case 7:
                    str = str + " Seven";
                    break;
                case 8:
                    str = str + " Eight";
                    break;
                case 9:
                    str = str + " Nine";
                    break;
            }
            rev = rev / 10;
        }
        for (i = 0; i < zero; i++)
            str = str + " Zero";
        return str;
    }

    // Main method to start the program
    public static void main(String args[]) throws Exception {
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        TicketBooking ob = new TicketBooking();
        char ch;
        while (true) {
            ob.takeDataFromUser();
            System.out.println("Any More (y/n):");
            ch = (char) br1.read();
            ch = Character.toLowerCase(ch);
            if (ch == 'n')
                break;
        }
    }
}
