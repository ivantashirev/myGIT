package HW1;

public class HomeWork1 {
    public static void main(String[] args) {
        printTreeWords();
        System.out.println("***");
        checkSumSing();
        System.out.println("***");
        printColor();
        System.out.println("***");
        compareNumbers();
    }

    //Пункт 2.
    public static void printTreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    //Пункт 3.
    public static void checkSumSing() {
        int a=2;
        int b=-10;
        int c=a+b;

        if (c >= 0) {
            System.out.println("Значение положительное");
        }
        if (c < 0) {
            System.out.println("Значение отрицательное");
        }
    }

    //Пункт 4.
    public static void printColor() {
        int value=10;

        if (value <= 0) {
            System.out.println("Red");
        } else if (value > 0 && value <= 100) {
            System.out.println("Yellow");
        } else if (value > 100) {
            System.out.println("Green");
        }
    }

    //Пункт 5.
    public static void compareNumbers() {
        int a = 117;
        int b = 31;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
        System.out.println();
    }
}
