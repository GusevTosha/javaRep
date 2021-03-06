package homeWork1;


public class first_hw {
//Написать метод вычисляющий выражение a * (b + (c / d)) и  возвращающий результат с плавающей точкой,
// где a, b, c, d –   целочисленные входные параметры этого метода;

    private static double Math(int a, int b, int c, int d) {
        return a * (b + ((double) c / d));
    }

    /**
     * Написать метод, принимающий на вход два целых числа, и проверяющий что их   сумма лежит в пределах
     * от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
     */
    private static boolean Chek(int a, int b) {
        return (a + b) >= 10 && (a + b) <= 20;
    }

    //Написать метод, которому в качестве параметра передается целое число, метод должен проверить
// положительное ли число передали, или отрицательное. Замечание: ноль считаем положительным числом.
// Результат работы метода вывести в консоль
    private static boolean Positiv(int a) {
        return a >= 0;
    }

    // Написать метод, которому в качестве параметра передается строка, обозначающая
// имя, метод должен вернуть приветственное сообщение «Привет, переданное_имя!»;
// Вывести приветствие в консоль.
    private static String Hellow(String a) {
        return "Привет " + a;
    }

    //* Написать метод, который определяет является ли год високосным.
// Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
// Для проверки работы вывести результаты  работы метода в консоль
    private static boolean Leap(int a) {
        return (a % 4 == 0) && (a % 100 != 0) || (a % 400 == 0);
    }

    public static void main(String[] args) {
        int a = -1;
        int b = 2;
        int c = 3;
        int d = 4;
        int y = 1992;
        String str = "Peter";
        System.out.println(a + " * (" + b + " + ( " + c + " / " + d + " ))= " + Math(a, b, c, d));
        System.out.println(a + " + " + b + " находится в диапазоне от 10 до 20(включительно) - " + Chek(a, b));
        System.out.println(a + " положительное число - " + Positiv(a));
        System.out.println(Hellow(str));
        System.out.println(y + " year is leap " + Leap(y));

    }
}
