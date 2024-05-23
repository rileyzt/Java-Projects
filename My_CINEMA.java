/**
 * Objective: 
 * This program is a movie ticket booking system for a cinema. It allows users to select a city, 
 * choose a cinema category, select a movie and date, purchase tickets, buy snacks and drinks, 
 * and cancel tickets if needed. The program handles user input, validates choices, and calculates 
 * the total cost of tickets and food items.
 */
import java.io.*;

public class My_CINEMA {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String title = "******************WELCOME TO MY CINEMA*****************";
        String list[] = new String[19]; // for Storing Movie names.
        list[0] = "KURBAAN"; list[1] = "TWILIGHT"; list[2] = "A CHRISTMAS CAROL"; list[3] = "TUM MILE";
        list[4] = "2012"; list[5] = "AJAB PREM KI GHAJAB KAHANI"; list[6] = "EK NIRANJAN"; list[7] = "AARYA 2";
        list[8] = "KANDEIN KADHALAI"; list[9] = "PARICHAYA"; list[10] = "MAGADHEERA"; list[11] = "AADHAVAN";
        list[12] = "PAJHASSIRAJA"; list[13] = "ALL THE BEST"; list[14] = "KURRADU"; list[15] = "JULIE AND JULIA";
        list[16] = "MOORU GUTTO ONDHU SULLU"; list[17] = "VILLAGE LO VINAYAKUDU"; list[18] = "MANASAARE";

        String city[] = new String[6]; // for Storing City names.
        city[0] = "BANGALORE"; city[1] = "CHANDIGARH"; city[2] = "DELHI"; city[3] = "HYDERABAD"; city[4] = "MUMBAI"; city[5] = "KOLKATA";

        String cityN, movie, ans, ans1; // declaration of String variables
        int flag, flag1, flag2, flag3, catg, quantity, date, bvrg, tot_bvrg, snck, tot_snck, tot_fd, tot_d, ch; // declaration of Integer variables
        flag = flag1 = flag2 = flag3 = tot_fd = tot_d = 0;

        do {
            System.out.println();
            System.out.println(title);
            System.out.println("*********************************************************");
            System.out.println();
            System.out.println("<<< SELECT YOUR CURRENT CITY >>>");

            // City selection with input validation
            do {
                if (flag > 0) {
                    System.out.println("** INVALID INPUT ! TRY AGAIN **");
                }
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("** BANGALORE CHANDIGARH DELHI HYDERABAD MUMBAI KOLKATA **");
                System.out.println();
                System.out.print("ENTER THE CORRECT CITY NAME FOR YOUR CHOICE :");
                cityN = br.readLine();
                flag = 0;
                for (int i = 0; i < 6; i++) {
                    if (city[i].equalsIgnoreCase(cityN)) {
                        flag = 0;
                        break;
                    } else {
                        flag++;
                    }
                }
            } while (flag != 0);
            System.out.println("\f"); // to clear the screen for next window
            System.out.println(title);
            System.out.println("*********************************************************");
            System.out.println("<<< SELECT YOUR CATEGORY TO WATCH THE MOVIE >>>");

            // Category selection with input validation
            do {
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("** 1. " + cityN + " CLASSIC CINEMA GHOR **");
                System.out.println("** 2. " + cityN + " SUPER CLASSIC CINEMA GHOR **");
                System.out.println();
                System.out.print("ENTER THE CORRECT CATEGORY NUMBER FOR YOUR CHOICE :");
                catg = Integer.parseInt(br.readLine());
                if ((catg == 1) || (catg == 2)) {
                    flag1 = 0;
                } else {
                    System.out.println("*** INVALID INPUT *** PLEASE TRY AGAIN");
                    flag1++;
                }
            } while (flag1 != 0);
            System.out.println("\f"); // to clear the screen for next window
            System.out.println(title);
            System.out.println("*********************************************************");
            System.out.println("<<< INFORMATION >>>");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println();
            System.out.println("** CATCH THE LATEST MOVIES AT CINEMAS NEAR YOU **");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println();
            System.out.println("<<< SELECT YOUR DATE FOR THE MOVIE >>>");

            // Date selection with input validation
            do {
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("** 1. THURSDAY, 26 NOVEMBER [2023] **");
                System.out.println("** 2. FRIDAY,   27 NOVEMBER [2023] **");
                System.out.println("** 3. SATURDAY, 28 NOVEMBER [2023] **");
                System.out.println("** 4. SUNDAY,   29 NOVEMBER [2023] **");
                System.out.println("** 5. MONDAY,   30 NOVEMBER [2023] **");
                System.out.println("** 6. TUESDAY,  01 DECEMBER [2023] **");
                System.out.println("** 7. WEDNESDAY, 02 DECEMBER [2023] **");
                System.out.println();
                System.out.print("ENTER THE CORRECT NUMBER FOR YOUR SELECTED DATE :");
                date = Integer.parseInt(br.readLine());
                if ((date >= 1) && (date <= 7)) {
                    flag2 = 0;
                } else {
                    System.out.println("*** INVALID INPUT *** PLEASE TRY AGAIN");
                    flag2++;
                }
            } while (flag2 != 0);
            System.out.println("\f"); // to clear the screen for next window
            System.out.println(title);
            System.out.println("*********************************************************");
            System.out.println("<<< PLEASE ENTER THE NUMBER OF TICKETS >>>");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.print("ENTER THE NUMBER OF TICKETS :");
            quantity = Integer.parseInt(br.readLine());
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("\f"); // to clear the screen for next window
            System.out.println(title);
            System.out.println("*********************************************************");

            // Movie selection based on category with input validation
            if (catg == 1) {
                System.out.println("<<< MOVIE SELECTION >>>");
                do {
                    if (flag3 > 0) {
                        System.out.println("*** INVALID INPUT *** PLEASE TRY AGAIN");
                    }
                    System.out.println("************************** NOW SHOWING ***************************");
                    System.out.println("MOVIE NAME                    RATING      LANGUAGE    SHOW TIMINGS");
                    System.out.println();
                    System.out.println("KURBAAN                        A          HINDI       01:00pm,9:15pm");
                    System.out.println("TWILIGHT                       U/A        ENGLISH     06:15pm");
                    System.out.println("A CHRISTMAS CAROL              U          ENGLISH     03:20pm");
                    System.out.println("TUM MILE                       U/A        HINDI       06:15pm,9:20pm");
                    System.out.println("2012                           U/A        ENGLISH     12:45pm,1:05pm,3:20pm,9:05pm");
                    System.out.println("AJAB PREM KI GHAJAB KAHANI     U          HINDI       10:30am,12:45pm,1:05pm");
                    System.out.println("MANASAARE                      U/A        KANNADA     09:00pm");
                    System.out.println();
                    System.out.print("ENTER THE NAME OF YOUR SELECTED MOVIE :");
                    movie = br.readLine();
                    for (int i = 0; i < 19; i++) {
                        if (list[i].equalsIgnoreCase(movie)) {
                            flag3 = 0;
                            break;
                        } else {
                            flag3++;
                        }
                    }
                } while (flag3 != 0);
                System.out.println();
                System.out.println("<<< PLEASE COLLECT YOUR BILL >>>");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Movie Selected :" + movie);
                System.out.println("The Total Cost is Rs. " + (quantity * 110));
                System.out.print("Your Seat Number/s is/are ");
                for (int i = 1; i <= quantity; i++) {
                    System.out.print(17 + i + " ");
                }
                System.out.println();
            }
            if (catg == 2) {
                System.out.println("<<< MOVIE SELECTION >>>");
                do {
                    if (flag3 > 0) {
                        System.out.println("*** INVALID INPUT *** PLEASE TRY AGAIN");
                    }
                    System.out.println("************************** NOW SHOWING ***************************");
                    System.out.println("MOVIE NAME                    RATING      LANGUAGE    SHOW TIMINGS");
                    System.out.println();
                    System.out.println("EK NIRANJAN                    A          TELUGU      01:00pm,9:15pm");
                    System.out.println("AARYA 2                        U/A        TELUGU      06:15pm");
                    System.out.println("KANDEIN KADHALAI               U          TAMIL       03:20pm");
                    System.out.println("PARICHAYA                      U/A        KANNADA     06:15pm,9:20pm");
                    System.out.println("MAGADHEERA                     U/A        TELUGU      12:45pm,1:05pm,3:20pm,9:05pm");
                    System.out.println("AADHAVAN                       U          TAMIL       10:30am,12:45pm,1:05pm");
                    System.out.println("PAJHASSIRAJA                   U/A        MALAYALAM   09:00pm");
                    System.out.println("ALL THE BEST                   U          HINDI       09:00pm");
                    System.out.println("KURRADU                        U          TELUGU      09:00pm");
                    System.out.println("JULIE AND JULIA                U/A        ENGLISH     09:00pm");
                    System.out.println("MOORU GUTTO ONDHU SULLU        U/A        KANNADA     09:00pm");
                    System.out.println("VILLAGE LO VINAYAKUDU          U          TELUGU      09:00pm");
                    System.out.println();
                    System.out.print("ENTER THE NAME OF YOUR SELECTED MOVIE :");
                    movie = br.readLine();
                    for (int i = 0; i < 19; i++) {
                        if (list[i].equalsIgnoreCase(movie)) {
                            flag3 = 0;
                            break;
                        } else {
                            flag3++;
                        }
                    }
                } while (flag3 != 0);
                System.out.println();
                System.out.println("<<< PLEASE COLLECT YOUR BILL >>>");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Movie Selected :" + movie);
                System.out.println("The Total Cost is Rs. " + (quantity * 120));
                System.out.print("Your Seat Number/s is/are ");
                for (int i = 1; i <= quantity; i++) {
                    System.out.print(17 + i + " ");
                }
                System.out.println();
            }
            System.out.println();
            System.out.println("***********************EXPERIENCE THE DIFFERENCE****************************");
            System.out.println();
            System.out.println("WOULD YOU LIKE TO ORDER SOME SNACKS & BEVERAGES FOR YOUR MOVIE ?");
            System.out.println();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("* ENTER 'Y' FOR YES & 'N' FOR NO *");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println();
            ans = br.readLine();
            if (ans.equalsIgnoreCase("y")) {
                System.out.println();
                System.out.println("************** WELCOME TO THE FOOD COURT ****************");
                System.out.println("************** SNACKS AVAILABLE : ****************");
                System.out.println();
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("S/N FOOD NAME                PRICE");
                System.out.println("1. BURGER                    Rs. 50.00");
                System.out.println("2. PIZZA                     Rs. 70.00");
                System.out.println("3. SAMOSA                    Rs. 20.00");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("ENTER THE SERIAL NUMBER FOR YOUR SELECTED SNACK :");
                snck = Integer.parseInt(br.readLine());
                System.out.println("ENTER THE QUANTITY :");
                tot_snck = Integer.parseInt(br.readLine());
                if (snck == 1) {
                    tot_fd = (tot_snck * 50);
                    System.out.println("YOUR BILL IS Rs. " + (tot_snck * 50));
                } else if (snck == 2) {
                    tot_fd = (tot_snck * 70);
                    System.out.println("YOUR BILL IS Rs. " + (tot_snck * 70));
                } else if (snck == 3) {
                    tot_fd = (tot_snck * 20);
                    System.out.println("YOUR BILL IS Rs. " + (tot_snck * 20));
                }
                System.out.println("WOULD YOU LIKE TO ORDER BEVERAGES TOO?");
                System.out.println();
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("* ENTER 'Y' FOR YES & 'N' FOR NO *");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                ans1 = br.readLine();
                if (ans1.equalsIgnoreCase("y")) {
                    System.out.println("************** BEVERAGES AVAILABLE : **************");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("S/N BEVERAGE NAME          PRICE");
                    System.out.println("1. PEPSI [300ml]           Rs. 20.00");
                    System.out.println("2. 7UP   [300ml]           Rs. 20.00");
                    System.out.println("3. SLICE [300ml]           Rs. 15.00");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("ENTER THE SERIAL NUMBER FOR YOUR SELECTED BEVERAGE :");
                    bvrg = Integer.parseInt(br.readLine());
                    System.out.println("ENTER THE QUANTITY :");
                    tot_bvrg = Integer.parseInt(br.readLine());
                    if (bvrg == 1) {
                        tot_d = (tot_bvrg * 20);
                        System.out.println("YOUR BILL IS Rs. " + (tot_bvrg * 20));
                    } else if (bvrg == 2) {
                        tot_d = (tot_bvrg * 20);
                        System.out.println("YOUR BILL IS Rs. " + (tot_bvrg * 20));
                    } else if (bvrg == 3) {
                        tot_d = (tot_bvrg * 15);
                        System.out.println("YOUR BILL IS Rs. " + (tot_bvrg * 15));
                    }
                } else {
                    tot_d = 1;
                }
            } else {
                tot_fd = 1;
                tot_d = 1;
            }
            System.out.println("\f"); // to clear the screen for next window
            System.out.println(title);
            System.out.println("*********************************************************");
            System.out.println("<<< PLEASE COLLECT YOUR FINAL BILL >>>");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("The Total Cost of Food is Rs. " + tot_fd);
            System.out.println("The Total Cost of Beverage is Rs. " + tot_d);
            System.out.println("Your Final Bill is Rs. " + ((quantity * 110) + (quantity * 120) + tot_fd + tot_d));
            System.out.println();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("* ENTER 'Y' TO BOOK ANOTHER TICKET & 'N' TO EXIT *");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            ans = br.readLine();
        } while (ans.equalsIgnoreCase("y"));
        System.out.println();
        System.out.println("THANK YOU FOR USING MY CINEMA! ENJOY YOUR MOVIE!");
        System.out.println();
    }
}
