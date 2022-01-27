package HW3;

public class HomeWork3 {
    public static void main(String[] args) {
        // write your code here
        massiv01();
        System.out.println(" ");
        zapolniPustoiMassiv100();
        System.out.println(" ");
        umnozhitNa2();
        System.out.println(" ");
        diagonaliKvadrata();
        System.out.println(" ");
        massivVConsol(verniMassiv(2, 3));
        System.out.println(" ");
    }
    //Задание1.
    public static void massiv01() {
        int[] arr = {1, 1, 0, 1, 0, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            System.out.println(arr[i]);
        }
    }

    //Задание2.
    public static void zapolniPustoiMassiv100() {
        int [] arr2 = new int [100];
        arr2 [0] = 1;
        for (int i =0; i < arr2.length; i++) {
            if (i == 0) {
                arr2[i] = 1;
            } else {
                arr2 [i] = arr2 [i-1] + 1;
            }
            System.out.print(arr2[i] + " ");
        }
        System.out.println("");
    }

    //Задание 3.
    public static void umnozhitNa2 () {
        int [] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i =0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] = arr3 [i] * 2;
            } else {
                arr3[i] = arr3[i];
            }
            System.out.println(arr3[i]);
        }

    }
    //Задание 4.
    public static void diagonaliKvadrata() {
        int [] [] arr4 = new int[7][7];

        for (int i = 0; i < arr4.length; i++) {
            arr4[i][i] = 1;
            arr4[i][6-i] = 1;
        }

        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4.length; j++) {
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Задание 5.
    public static int[] verniMassiv (int len, int initialValue) {
        int arr5[] = new int[len];
        for(int i = 0; i < arr5.length; i++) {
            arr5[i] = initialValue;
        }
        return arr5;
    }
    public static void massivVConsol (int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            System.out.println(inputArray[i] + " ");
        }
        System.out.println();
    }
}
