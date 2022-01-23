package HW2;

public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println("Task 1");
        System.out.println(checkSum(20,10));
        System.out.println("Task 2");
        if (positiveOrNegativ(1)) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
        System.out.println("Task 3");
        System.out.println(pOrN(-4));
        System.out.println("Task 4");
        stringNumber("Наконец-то я додумался, как это сделать", 4);
        System.out.println("Task 5. Так и не додумался, как это сделать, а искать рщенеия в интернете не стал.");
    }

    public static boolean checkSum (int a, int b) {
        return ((a+b) >= 10 && (a+b) <= 20);
    }

    public static boolean positiveOrNegativ (int c) {
        return (c >= 0);
    }

    public static boolean pOrN (int d) {
        return (d < 0);
    }

    public static void stringNumber (String text, int x) {
        for (int i = 1; i <= x; i++) {
            System.out.println(text);
        }
    }
}
