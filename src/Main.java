public class Main {
    public static void main(String[] args) {

        // Циклы часть 1
        // Task 1
        // С помощью цикла for выведите в консоль все числа от 1 до 10.

        System.out.println("Циклы часть 1");
        System.out.println("Решение задачи № 1");

        for (int i = 1; i < 11; i++) {
            System.out.println("результат очередной итерации: " + i);
        }
        System.out.println(" ");

        // Task 2
        //С помощью цикла for выведите в консоль все числа от 10 до 1.
        System.out.println("Решение задачи № 2");
        for (int i = 10; i > 0; i--) {
            System.out.println("результат очередной итерации: " + i);
        }
        System.out.println(" ");

        // Task 3
        //Выведите в консоль все четные числа от 0 до 17.
        System.out.println("Решение задачи № 3");
        for (int i = 0; i <= 17; i++) {
            if (i % 2 == 0) {
                System.out.println("очередное четное число: " + i);
            }
        }
        System.out.println(" ");

        // Task 4
        //Выведите в консоль все числа от 10 до - 10 от бОльшего числа к меньшему.
        System.out.println("Решение задачи № 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println("по убыванию: " + i);
        }
        System.out.println(" ");

        // Task 5
        //выводит в консоль все високосные года, начиная с 1904 года до 2096.
        // В консоль результат должен выводиться в формате "… год является високосным".
        System.out.println("Решение задачи № 5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            if (i % 100 != 0) {
                System.out.println("високосный год: " + i);
            }
        }
        System.out.println(" ");

        // Task 6
        // Напишите программу, которая выводит в консоль последовательность цифр:
        //7 14 21 28 35 42 49 56 63 70 77 84 91 98
        System.out.println("Решение задачи № 6");
        for (int i = 7; i <= 98; i = i + 7) {
            if (i % 100 != 0) {
                System.out.println("последовательность цифр от 7 до 98: " + i);
            }
        }
        System.out.println(" ");

        // Task 7
        //Напишите программу, которая выводит в консоль последовательность цифр:
        //1 2 4 8 16 32 64 128 256 512
        System.out.println("Решение задачи № 6");
        for (int i = 1; i <= 512; i = i * 2) {
                System.out.println("последовательность цифр от 1 до 512: " + i);
        }
    }
}