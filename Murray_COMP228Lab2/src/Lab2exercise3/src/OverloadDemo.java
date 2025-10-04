public class OverloadDemo {

    // 1) To add two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // 2) To add three doubles
    public static double add(double a, double b, double c) {
        return a + b + c;
    }

    // 3) To concatenate two strings
    public static String add(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        int sumInts = add(5, 10);                       // This will call an int version
        double sumDoubles = add(2.5, 3.5, 4.5);         // This will call a double version
        String sumStrings = add("Java", " Programming"); // This will call a string version

        System.out.println("Sum of two ints: " + sumInts);
        System.out.println("Sum of three doubles: " + sumDoubles);
        System.out.println("Concatenation of strings: " + sumStrings);
    }
}
