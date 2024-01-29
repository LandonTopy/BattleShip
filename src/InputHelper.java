import java.util.Scanner;
public class InputHelper {
    public static void main(String[] args) {
        //TestMethods
        Scanner scan = new Scanner(System.in);
        System.out.println(getRegExString(scan, "Enter your Birthday", "\\d{2}/\\d{2}/\\d{4}"));
        System.out.println(getDouble(scan, "Please enter a double value"));
        System.out.println(getRangedDouble(scan, "Please enter a double between 1-10", 1, 10));
        System.out.println(getInt(scan, "Please enter an int value"));
        System.out.println(getPositiveRangedInt(scan, "Please enter a positive int value that is not 0"));
        System.out.println(getYNConfirm(scan, "Yes or No [Y/N]"));
        System.out.println(getNonZeroLenString(scan, "Enter a string with at least 1 character"));
    }

    //This method loops until a valid input is received. Returns int value.
    public static int getInt(Scanner in, String prompt) {
        boolean done = false;
        int x = 0;
        System.out.println(prompt);
        do {
            if (in.hasNextInt()) {
                x = in.nextInt();
                done = true;
            } else {
                System.out.println("Invalid input. Please try again.");
            }
            in.nextLine(); //Buffer
        } while (!done);
        return x;
    }


    public static int getRangedInt (Scanner in, String prompt, int min, int max) {
        boolean done = false;
        int x = 0;
        System.out.println(prompt);
        do {
            if (in.hasNextInt()) {
                x = in.nextInt();
                if (x >= min && x <= max) {
                    done = true;
                } else {
                    System.out.println("Out of range. Please try again.");
                }
            } else {
                System.out.println("Invalid input. Please try again.");
            }
            in.nextLine(); //Buffer
        } while (!done);
        return x;
    }

    public static double getDouble(Scanner in, String prompt) {
        boolean done = false;
        double x = 0;
        System.out.println(prompt);
        do {
            if (in.hasNextDouble()) {
                x = in.nextDouble();
                done = true;
            } else {
                System.out.println("Invalid input. Please try again.");
            }
            in.nextLine(); //Buffer
        } while (!done);
        return x;
    }

    public static double getRangedDouble(Scanner in, String prompt, double min, double max) {
        boolean done = false;
        double x = 0;
        System.out.println(prompt);
        do {
            if (in.hasNextDouble()) {
                x = in.nextDouble();
                if (x >= min && x <= max) {
                    done = true;
                } else {
                    System.out.println("Out of range. Please try again.");
                }
            } else {
                System.out.println("Invalid input. Please try again.");
            }
            in.nextLine(); //Buffer
        } while (!done);
        return x;
    }

    public static int getPositiveRangedInt(Scanner in, String prompt) {
        boolean done = false;
        int x = 0;
        System.out.println(prompt);
        do {
            if (in.hasNextInt()) {
                x = in.nextInt();
                if (x > 0) {
                    done = true;
                } else {
                    System.out.println("Out of range. Please try again.");
                }
            } else {
                System.out.println("Invalid input. Please try again.");
            }
            in.nextLine(); //Buffer
        } while (!done);
        return x;
    }

    public static boolean getYNConfirm(Scanner in, String prompt) {
        boolean done = false;
        boolean x = false;
        String y;
        System.out.println(prompt);
        do {
            y = in.nextLine();
            if (y.equalsIgnoreCase("Y")) {
                x = true;
                done = true;
            } else if (y.equalsIgnoreCase("N")) {
                done = true;
            } else {
                System.out.println("Invalid input. Please try again.");
            }
            in.nextLine(); //Buffer
        } while (!done);
        return x;
    }

    public static String getNonZeroLenString(Scanner in, String prompt) {
        boolean done = false;
        String x;
        System.out.println(prompt);
        do {
            x = in.nextLine();
            int length = x.length();
            if (length > 0) {
                done = true;
            } else {
                System.out.println("Invalid input. Please try again.");
            }
            in.nextLine(); //Buffer
        } while (!done);
        return x;
    }

    public static String getRegExString(Scanner in, String prompt, String regEx) {
        boolean done = false;
        String input;
        do {
            System.out.println(prompt);
            input = in.nextLine();
            if (input.matches(regEx)) {
                done = true;
            } else {
                System.out.println("Invalid input");
            }
        } while (!done);
        return input;
    }
}
