import java.io.*;

/**
 * The Library class simulates a library book issue and return system for students.
 * It calculates the fine based on the delay in returning the book.
 */
class Library {
    // Declare variables to hold student and book information
    String name, regd_no, cl, sec, book, author, issue, ret;
    double fine, price;
    int datediff;
    String s1, s2;

    /**
     * The main function to start the program.
     * It creates an instance of the Library class and calls the take method.
     */
    public static void main(String args[]) throws IOException {
        Library libraryObject = new Library();
        libraryObject.take();
    }

    /**
     * Method to take input from the user.
     * It collects student details and book issue/return dates.
     */
    void take() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Student Name:");
        name = br.readLine();
        System.out.println("Enter Student Regd. No:");
        regd_no = br.readLine();
        System.out.println("Enter Class:");
        cl = br.readLine();
        System.out.println("Enter Section:");
        sec = br.readLine();
        System.out.println("Enter Name of the Book issue:");
        book = br.readLine();
        System.out.println("Enter Author Name of the Book:");
        author = br.readLine();
        System.out.println("Enter Date of Issue of the Book (dd/mm/yyyy):");
        issue = br.readLine().trim();
        System.out.println("Enter Date of Return of the Book (dd/mm/yyyy):");
        ret = br.readLine().trim();
        s1 = issue;
        s2 = ret;
        diff();
    }

    /**
     * Method to calculate the difference in days between the issue date and the return date.
     */
    void diff() {
        int d, d1, m, m1, y, y1;
        d1 = 0;
        d = 0;
        m1 = 0;
        m = 0;
        datediff = 0;
        int p, q;

        // Extracting the day, month, and year from the issue date
        p = issue.indexOf("/");
        d = Integer.parseInt(issue.substring(0, p));
        q = issue.lastIndexOf("/");
        m = Integer.parseInt(issue.substring(p + 1, q));
        y = Integer.parseInt(issue.substring(q + 1));

        // Extracting the day, month, and year from the return date
        p = ret.indexOf("/");
        d1 = Integer.parseInt(ret.substring(0, p));
        q = ret.lastIndexOf("/");
        m1 = Integer.parseInt(ret.substring(p + 1, q));
        y1 = Integer.parseInt(ret.substring(q + 1));

        // Calculating the difference in days
        int a = dayno(d, m, y);
        int b = dayno(d1, m1, y1);
        datediff = Math.abs(a - b);
        System.out.println("Output : Difference = " + datediff + " days.");

        fine();
    }

    /**
     * Method to check if a year is a leap year.
     * @param z The year to check.
     * @return 29 if the year is a leap year, otherwise 28.
     */
    int isLeap(int z) {
        if ((z % 400 == 0) || ((z % 100 != 0) && (z % 4 == 0)))
            return 29;
        else
            return 28;
    }

    /**
     * Method to find the day number from the year.
     * @param _d The day.
     * @param _m The month.
     * @param _y The year.
     * @return The day number.
     */
    int dayno(int _d, int _m, int _y) {
        int month[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int dn = 0;
        month[2] = isLeap(_y);
        for (int i = 1; i < _m; i++) {
            dn = dn + month[i];
        }
        dn = dn + _d;
        for (int i = 1000; i < _y; i++) {
            if (isLeap(i) == 29)
                dn = dn + 366;
            else
                dn = dn + 365;
        }
        return dn;
    }

    /**
     * Method to calculate the fine based on the number of days the book is overdue.
     */
    void fine() {
        if (datediff <= 5)
            fine = 0;
        else if (datediff > 5 && datediff <= 10)
            fine = 2 * datediff;
        else if (datediff > 10 && datediff <= 15)
            fine = 5 * datediff;
        else
            fine = fine + 10 * datediff;
        show();
    }

    /**
     * Method to display the student and book details along with the fine amount.
     */
    void show() {
        System.out.println("Name of the student: " + name);
        System.out.println("Regd No of the student: " + regd_no);
        System.out.println("Class of the student: " + cl);
        System.out.println("Section of the student: " + sec);
        System.out.println("Book issued to the student: " + book);
        System.out.println("Author of the Book: " + author);
        System.out.println("Book issued on: " + s1);
        System.out.println("Return Date of the Book: " + s2);
        System.out.println("Fine Amount: " + fine);
    }
}
