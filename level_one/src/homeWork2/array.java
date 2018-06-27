package homeWork2;

import java.util.Arrays;

public class array {
    /*
    1 Задать целочисленный массив, состоящий из элементов 0 и 1.
     Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0;
     */
    private static void switchOnevsZero(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] == 0 ? 1 : 0;
        }
    }

    /*
    2 Задать пустой целочисленный массив размером 8.
    Написать метод, который помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22;
     */
    private static void writeArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = 3 * i + 1;
        }

    }

    /*
    3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ],
     написать метод, принимающий на вход массив и умножающий числа меньше 6 на 2;
     */
    private static void doubleArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] < 6 ? a[i] * 2 : a[i];
        }
    }

    /*
    4 Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента;
     */
    private static int maxE(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    private static int minE(int[] a) {
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }

    /*
    5 * Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
     заполнить его диагональные элементы единицами, используя цикл(ы);
     */
    private static void cross(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (i == j) || (a[i].length - i - 1 == j) ? 1 : 0;
            }
        }
    }

    /*
    6 ** Написать метод, в который передается не пустой одномерный целочисленный массив,
     метод должен вернуть true если в массиве есть место, в котором сумма левой и правой части массива равны.
     Примеры: checkBalance([1, 1, 1, || 2, 1]) → true, checkBalance ([2, 1, 1, 2, 1]) → false,
     checkBalance ([10, || 1, 2, 3, 4]) → true. Абстрактная граница показана символами ||, эти символы в массив не входят.
     */
    private static boolean half(int[] a) {
        int i = 0;
        int firstHalf = 0;
        int secondHalf = 0;
        do {
            firstHalf += a[i];
            secondHalf = 0;
            for (int j = i + 1; j < a.length; j++) {
                secondHalf += a[j];
            }
            i++;
        } while (i < a.length && firstHalf != secondHalf);

        return firstHalf == secondHalf;
    }

    /*
    7 *** Написать метод, которому на вход подаётся одномерный массив и число n (может быть положительным, или отрицательным),
     при этом метод должен циклически сместить все элементы массива на n позиций.
     */
    private static int[] flip(int[] a, int b) {
        int[] copy = new int[a.length];
        while (b > a.length) {
            b = b - a.length;
        }
        while (b < 0) {
            b += a.length;
        }
        for (int i = 0; i < a.length; i++) {
            if (i + b < a.length) {
                copy[i] = a[i + b];
            } else {
                copy[i] = a[i + b - a.length];
            }
        }

        return copy;

    }

    /*
    8 **** Не пользоваться вспомогательным массивом при решении задачи 7.
     */
    private static int[] flipDifficult(int[] a, int b) {
        int buff;
        while (b > a.length) {
            b = b - a.length;
        }
        while (b < 0) {
            b += a.length;
        }
        for (int i = 1; i <= b; i++) {
            buff = a[0];
            for (int j = 0; j < a.length - 1; j++) {
                a[j] = a[j + 1];
            }
            a[a.length - 1] = buff;
        }

        return a;

    }


    public static void main(String[] args) {
        final int COLUMNS = 6;
        final int LINE = 6;
         int SLIP = 4;
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int[] nullArray = new int[8];
        int[] doubleArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[][] cross = new int[COLUMNS][LINE];
        int[] checkBalance = {1, 1, 1, 2, 1};
        int[] checkBalance1 = {2, 1, 1, 2, 1};
        int[] checkBalance2 = {10, 1, 2, 3, 4};
        int[] offset = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("исходный массив первого задания " + Arrays.toString(array));
        switchOnevsZero(array);
        System.out.println("измененный массив первого задания " + Arrays.toString(array));
        System.out.println("Исходный массив второго задания " + Arrays.toString(nullArray));
        writeArray(nullArray);
        System.out.println("измененный массив второго задания " + Arrays.toString(nullArray));
        System.out.println("Исходный массив второго задания " + Arrays.toString(doubleArray));
        doubleArray(doubleArray);
        System.out.println("измененный массив второго задания " + Arrays.toString(doubleArray));
        System.out.println("В массиве " + Arrays.toString(nullArray) + " максимальный элемент " + maxE(nullArray));
        System.out.println("В массиве " + Arrays.toString(nullArray) + " минимальный элемент " + minE(nullArray));
        cross(cross);
        System.out.println("x array");
        for (int i = 0; i < cross.length; i++) {
            System.out.println(Arrays.toString(cross[i]));
        }
        System.out.println("массив " + Arrays.toString(checkBalance) +
                " удовлетворяет условиям задачи? -" + half(checkBalance));
        System.out.println("массив " + Arrays.toString(checkBalance1) +
                " удовлетворяет условиям задачи? -" + half(checkBalance1));
        System.out.println("массив " + Arrays.toString(checkBalance2) +
                " удовлетворяет условиям задачи? -" + half(checkBalance2));
        System.out.println("Массив " + Arrays.toString(offset) + "необходимо сместить на " + SLIP + " позици(и/й)");
        System.out.println("Полученный массив " + Arrays.toString(flip(offset, SLIP)));
        System.out.println("Массив " + Arrays.toString(offset) + "необходимо сместить на " + SLIP + " позици(и/й)");
        System.out.println("Полученный массив " + Arrays.toString(flipDifficult(offset, SLIP)));
        for (SLIP = -300; SLIP <= 300; SLIP++) {
            if (!Arrays.equals(flip(offset, SLIP), flipDifficult(offset, SLIP))) {
                System.out.println("косяк");
            }
        }


    }
}
