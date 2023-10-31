//DinhMinhAnh20214991
//Example 6.4: MonthDays;
package LAB01;
import java.util.Scanner;


public class MonthDays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };

        int year;
        String month;

        // input month
        do {
            System.out.print(" Dinh Minh Anh 20214991 - Enter a month (ex: January, Jan, 1 ): ");
            month = input.nextLine().trim().toLowerCase();
            if (!isValidMonth(month)) {
                System.out.println("Invalid month input. Please enter a valid month.");
            }
        } while (!isValidMonth(month));

        //input year
        do {
            System.out.print("Dinh Minh Anh 20214991 - Enter a year: ");
            if (input.hasNextInt()) {
                year = input.nextInt();
                if (year >= 0) {
                    break;
                }
            }
            input.nextLine(); // Consume invalid input
        } while (true);

        int daysInMonth = getDaysInMonth(month, year);
        if (daysInMonth > 0) {
            System.out.println("Dinh Minh Anh 20214991 - Month " + month + " " + "Year" + " " + year + " has " + daysInMonth + " days.");
        } else {
            System.out.println("Dinh Minh Anh 20214991 - Invalid month or year.");
        }
    }
 //check Month
    public static boolean isValidMonth(String month) {
        String[] validInputs = {
            "january", "jan", "1",
            "february", "feb", "2",
            "march", "mar", "3",
            "april", "apr", "4",
            "may", "5",
            "june", "jun", "6",
            "july", "jul", "7",
            "august", "aug", "8",
            "september", "sep", "9",
            "october", "oct", "10",
            "november", "nov", "11",
            "december", "dec", "12"
        };

        for (int i = 0; i < validInputs.length; i++) {
            if (validInputs[i].equals(month)) {
                return true;
            }
        }

        return false;
    }

    public static int getDaysInMonth(String month, int year) {
        int[] daysInMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        int monthNumber = getMonthNumber(month);
        if (monthNumber == 2 && isLeapYear(year)) {
            return 29;
        } else if (monthNumber >= 1 && monthNumber <= 12) {
            return daysInMonth[monthNumber];
        }

        return 0;
    }

    public static int getMonthNumber(String month) {
        switch (month) {
            case "january":
            case "jan":
            case "1":
                return 1;
            case "february":
            case "feb":
            case "2":
                return 2;
            case "march":
            case "mar":
            case "3":
                return 3;
            case "april":
            case "apr":
            case "4":
                return 4;
            case "may":
            case "5":
                return 5;
            case "june":
            case "jun":
            case "6":
                return 6;
            case "july":
            case "jul":
            case "7":
                return 7;
            case "august":
            case "aug":
            case "8":
                return 8;
            case "september":
            case "sep":
            case "9":
                return 9;
            case "october":
            case "oct":
            case "10":
                return 10;
            case "november":
            case "nov":
            case "11":
                return 11;
            case "december":
            case "dec":
            case "12":
                return 12;
            default:
                return 0;
        }
    }
//check LeapYear
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}


