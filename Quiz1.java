import java.io.*;

/**
 * Objective: This program simulates a quiz game where the user is presented with multiple choice questions.
 * The user must answer each question correctly to gain points. If the user answers four questions incorrectly in a row,
 * they are disqualified from the quiz.
 */
class Quiz1 {
    int score;  // To store the total score of the user
    int x;  // Unused variable
    String a = "";  // To store the user's name
    int n;  // To store the user's choice for each question
    String ans = "";  // Unused variable
    int wrongAnsCount = 0;  // To count the number of consecutive wrong answers
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  // To read input from the user

    // Method to conduct the quiz
    public void quiz() throws Exception {

        // Display quiz instructions to the user
        System.out.println("\n\t\t\tINSTRUCTIONS SHOULD BE READ CAREFULLY");
        System.out.println("\n\tYou have 4 multiple choice questions.");
        System.out.println("\tEach question has 4 choices.");
        System.out.println("\tEnter the answer number as your answer");
        System.out.println("\tEach correct answer will give you 2 points");
        System.out.println("****************************************************************");
        
        // Prompt the user to enter their name
        System.out.println("Enter your name please....:");
        a = (br.readLine());  // Read the user's name
        System.out.println("\n");
        System.out.println("..............Welcome..................");
        System.out.println("\n");

        // Question 1
        System.out.println("Q1. What is RAM?\n");
        System.out.println("1) RANDOM ACCESS MEMORY ");
        System.out.println("2) READ ACCESS MEMORY ");
        System.out.println("3) RANDOM ABSORB MEMORY ");
        System.out.println("4) READ ACCUMULATE MEMORY ");
        System.out.println("\nChoose your answer please................ ");
        n = Integer.parseInt(br.readLine());  // Read the user's choice

        // Evaluate the user's answer for question 1
        switch (n) {
            case 1:
                System.out.println("Right answer");
                wrongAnsCount = 0;  // Reset the wrong answer count
                score = 2;  // Update the score
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("Wrong answer");
                wrongAnsCount++;  // Increment the wrong answer count
                break;
            default:
                System.out.println("ENTER WRONG KEY. SO, YOU HAVE NO CHANCE TO ANSWER THIS QUESTION");
        }

        // Question 2
        System.out.println("\nYour next question is......");
        System.out.println("\nQ2. What is WWW?");
        System.out.println("1) RANDOM ACCESS MEMORY ");
        System.out.println("2) READ ACCESS MEMORY ");
        System.out.println("3) World Wide Web ");
        System.out.println("4) READ ACCUMULATE MEMORY ");
        System.out.println("\nChoose your answer please................ ");
        n = Integer.parseInt(br.readLine());  // Read the user's choice

        // Evaluate the user's answer for question 2
        switch (n) {
            case 1:
            case 2:
            case 4:
                System.out.println("Wrong answer");
                wrongAnsCount++;  // Increment the wrong answer count
                break;
            case 3:
                System.out.println("Right answer");
                wrongAnsCount = 0;  // Reset the wrong answer count
                score += 2;  // Update the score
                break;
            default:
                System.out.println("ENTER WRONG KEY. SO, YOU HAVE NO CHANCE TO ANSWER THIS QUESTION");
        }

        // Question 3
        System.out.println("\nYour next question is......");
        System.out.println("\nQ3. What is OS?");
        System.out.println("1) OPTICAL STORE ");
        System.out.println("2) OPERATING SYSTEM ");
        System.out.println("3) ORGANIZED STORE ");
        System.out.println("4) OPTICAL SYSTEM ");
        System.out.println("\nChoose your answer please................ ");
        n = Integer.parseInt(br.readLine());  // Read the user's choice

        // Evaluate the user's answer for question 3
        switch (n) {
            case 1:
            case 3:
            case 4:
                System.out.println("Wrong answer");
                wrongAnsCount++;  // Increment the wrong answer count
                break;
            case 2:
                System.out.println("Right answer");
                wrongAnsCount = 0;  // Reset the wrong answer count
                score += 2;  // Update the score
                break;
            default:
                System.out.println("ENTER WRONG KEY. SO, YOU HAVE NO CHANCE TO ANSWER THIS QUESTION");
        }

        // Question 4
        System.out.println("\nYour next question is......");
        System.out.println("\nQ4. What is WORA?");
        System.out.println("1) WRITE ONCE READ ANYWHERE ");
        System.out.println("2) WRITE ORTHOGONALLY READ ANYTIME ");
        System.out.println("3) WRITE ONCE READ ANYTIME ");
        System.out.println("4) WRITE ONCE RANDOMLY ANYWHERE ");
        System.out.println("\nChoose your answer please................ ");
        n = Integer.parseInt(br.readLine());  // Read the user's choice

        // Evaluate the user's answer for question 4
        switch (n) {
            case 1:
                System.out.println("Right answer");
                wrongAnsCount = 0;  // Reset the wrong answer count
                score += 2;  // Update the score
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("Wrong answer");
                wrongAnsCount++;  // Increment the wrong answer count
                break;
            default:
                System.out.println("ENTER WRONG KEY. SO, YOU HAVE NO CHANCE TO ANSWER THIS QUESTION");
        }

        // Additional questions if the user has not reached 4 consecutive wrong answers
        if (wrongAnsCount < 4) {
            // Question 5
            System.out.println("\nYour next question is......");
            System.out.println("\nQ5. What is JVM?");
            System.out.println("1) Java Virtual Movement ");
            System.out.println("2) Java Virtual Machine ");
            System.out.println("3) Java Versatile Machine ");
            System.out.println("4) Just Virtual Machine ");
            System.out.println("\nChoose your answer please................ ");
            n = Integer.parseInt(br.readLine());  // Read the user's choice

            // Evaluate the user's answer for question 5
            switch (n) {
                case 1:
                case 3:
                case 4:
                    System.out.println("Wrong answer");
                    wrongAnsCount++;  // Increment the wrong answer count
                    break;
                case 2:
                    System.out.println("Right answer");
                    wrongAnsCount = 0;  // Reset the wrong answer count
                    score += 2;  // Update the score
                    break;
                default:
                    System.out.println("ENTER WRONG KEY. SO, YOU HAVE NO CHANCE TO ANSWER THIS QUESTION");
            }
        }

        if (wrongAnsCount < 4) {
            // Question 6
            System.out.println("\nYour next question is......");
            System.out.println("\nQ6. What is PC?");
            System.out.println("1) PERSONAL COMPUTER ");
            System.out.println("2) PARENT COMPUTER ");
            System.out.println("3) BOTH OF ALL ");
            System.out.println("4) WRITE ONCE RANDOMLY ANYWHERE ");
            System.out.println("\nChoose your answer please................ ");
            n = Integer.parseInt(br.readLine());  // Read the user's choice

            // Evaluate the user's answer for question 6
            switch (n) {
                case 1:
                    System.out.println("Right answer");
                    wrongAnsCount = 0;  // Reset the wrong answer count
                    score += 2;  // Update the score
                    break;
                case 2:
                case 3:
                case 4:
                    System.out.println("Wrong answer");
                    wrongAnsCount++;  // Increment the wrong answer count
                    break;
                default:
                    System.out.println("ENTER WRONG KEY. SO, YOU HAVE NO CHANCE TO ANSWER THIS QUESTION");
            }
        }

        if (wrongAnsCount < 4) {
            // Question 7
            System.out.println("\nYour next question is......");
            System.out.println("\nQ7. What is WORA?");
            System.out.println("1) WRITE ONCE READ ANYWHERE ");
            System.out.println("2) WRITE ORTHOGONALLY READ ANYTIME ");
            System.out.println("3) WRITE ONCE READ ANYTIME ");
            System.out.println("4) WRITE ONCE RANDOMLY ANYWHERE ");
            System.out.println("\nChoose your answer please................ ");
            n = Integer.parseInt(br.readLine());  // Read the user's choice

            // Evaluate the user's answer for question 7
            switch (n) {
                case 1:
                    System.out.println("Right answer");
                    wrongAnsCount = 0;  // Reset the wrong answer count
                    score += 2;  // Update the score
                    break;
                case 2:
                case 3:
                case 4:
                    System.out.println("Wrong answer");
                    wrongAnsCount++;  // Increment the wrong answer count
                    break;
                default:
                    System.out.println("ENTER WRONG KEY. SO, YOU HAVE NO CHANCE TO ANSWER THIS QUESTION");
            }
        }

        if (wrongAnsCount < 4) {
            // Question 8
            System.out.println("\nYour next question is......");
            System.out.println("\nQ8. What is WORA?");
            System.out.println("1) WRITE ONCE READ ANYWHERE ");
            System.out.println("2) WRITE ORTHOGONALLY READ ANYTIME ");
            System.out.println("3) WRITE ONCE READ ANYTIME ");
            System.out.println("4) WRITE ONCE RANDOMLY ANYWHERE ");
            System.out.println("\nChoose your answer please................ ");
            n = Integer.parseInt(br.readLine());  // Read the user's choice

            // Evaluate the user's answer for question 8
            switch (n) {
                case 1:
                    System.out.println("Right answer");
                    wrongAnsCount = 0;  // Reset the wrong answer count
                    score += 2;  // Update the score
                    break;
                case 2:
                case 3:
                case 4:
                    System.out.println("Wrong answer");
                    wrongAnsCount++;  // Increment the wrong answer count
                    break;
                default:
                    System.out.println("ENTER WRONG KEY. SO, YOU HAVE NO CHANCE TO ANSWER THIS QUESTION");
            }
        }

        if (wrongAnsCount < 4) {
            // Question 9
            System.out.println("\nYour next question is......");
            System.out.println("\nQ9. What is WORA?");
            System.out.println("1) WRITE ONCE READ ANYWHERE ");
            System.out.println("2) WRITE ORTHOGONALLY READ ANYTIME ");
            System.out.println("3) WRITE ONCE READ ANYTIME ");
            System.out.println("4) WRITE ONCE RANDOMLY ANYWHERE ");
            System.out.println("\nChoose your answer please................ ");
            n = Integer.parseInt(br.readLine());  // Read the user's choice

            // Evaluate the user's answer for question 9
            switch (n) {
                case 1:
                    System.out.println("Right answer");
                    wrongAnsCount = 0;  // Reset the wrong answer count
                    score += 2;  // Update the score
                    break;
                case 2:
                case 3:
                case 4:
                    System.out.println("Wrong answer");
                    wrongAnsCount++;  // Increment the wrong answer count
                    break;
                default:
                    System.out.println("ENTER WRONG KEY. SO, YOU HAVE NO CHANCE TO ANSWER THIS QUESTION");
            }
        }

        if (wrongAnsCount < 4) {
            // Question 10
            System.out.println("\nYour next question is......");
            System.out.println("\nQ10. What is WORA?");
            System.out.println("1) WRITE ONCE READ ANYWHERE ");
            System.out.println("2) WRITE ORTHOGONALLY READ ANYTIME ");
            System.out.println("3) WRITE ONCE READ ANYTIME ");
            System.out.println("4) WRITE ONCE RANDOMLY ANYWHERE ");
            System.out.println("\nChoose your answer please................ ");
            n = Integer.parseInt(br.readLine());  // Read the user's choice

            // Evaluate the user's answer for question 10
            switch (n) {
                case 1:
                    System.out.println("Right answer");
                    wrongAnsCount = 0;  // Reset the wrong answer count
                    score += 2;  // Update the score
                    break;
                case 2:
                case 3:
                case 4:
                    System.out.println("Wrong answer");
                    wrongAnsCount++;  // Increment the wrong answer count
                    break;
                default:
                    System.out.println("ENTER WRONG KEY. SO, YOU HAVE NO CHANCE TO ANSWER THIS QUESTION");
            }
        } else {
            // If the user has answered four questions incorrectly in a row, they are disqualified
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Your wrong answer count is 4");
            System.out.println("As per the rule of our Quiz, if you continuously give 4 wrong answers you are out of the Quiz");
        }

        // Display the user's final score
        System.out.println(" ");
        System.out.println(".......................................................");
        System.out.println(a);
        System.out.println("Your score is="); System.out.println(score);
    }

    // Main method to start the quiz
    public static void main(String[] args) throws Exception {
        Quiz1 quiz = new Quiz1();  // Create an instance of Quiz1
        quiz.quiz();  // Start the quiz
    }
}
