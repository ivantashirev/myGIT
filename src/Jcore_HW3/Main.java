package Jcore_HW3;
import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //1. Меняем местами два элемента в массиве.
        String[] arr = {"one","two", "three", "four", "five", "six"};

        System.out.println("Массив до " + Arrays.toString(arr));
        swapElements(arr,2,3);
        System.out.println("Массив после " +
                Arrays.toString(arr));

        //2. Фруктовая корзина
        System.out.println("Фруктовая корзинка");
        Orange orange = new Orange();
        Apple apple = new Apple();
        Box<Orange> orangeBox1 = new Box();
        Box<Orange> orangeBox2 = new Box();
        Box<Apple> appleBox = new Box();

        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());

        for (int i = 0; i < 4; i++) {
            orangeBox2.add(new Orange());
        }
        for (int i = 0; i < 6; i++) {
            appleBox.add(new Apple());
        }

        orangeBox1.info();
        orangeBox2.info();
        appleBox.info();

        Float orange1Weight = orangeBox1.getWeight();
        Float orange2Weight = orangeBox2.getWeight();
        Float appleWeight = appleBox.getWeight();
        System.out.println("Первая коробка с апельсинами весит " + orange1Weight + " кг.");
        System.out.println("Вторая коробка с апельсинами весит " + orange2Weight + " кг.");
        System.out.println("Коробка с яблочками весит " + appleWeight + " кг.");

        System.out.println("Сравним вес первой коробки с апельсинами и коробки с яблоками " + orangeBox1.compare(appleBox));
        System.out.println("Сравним вес второй коробки с апельсинами и коробки с яблоками " + orangeBox2.compare(appleBox));

        orangeBox1.moveAt(orangeBox2);

        orangeBox1.info();
        orangeBox2.info();
        appleBox.info();
    }

    private static <T> void swapElements(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array [index2] = temp;
    }

    private static <E> List<E> convertToList (E[] array) {
        return Arrays.asList(array);
    }
}
