import java.util.Arrays;

public class Main {
    static int hw = 9;

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        hwTitle();
        task1();
        task2();
        task3();
        task4();

        hwCompleted();
    }

    public static void hwTitle() {
        System.out.println("\nДОМАШНЕЕ ЗАДАНИЕ №" + hw);
        System.out.println(" ");
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] expenses = generateRandomArray();
        int sumOfExpenses = 0;
        for (int dayExpenses : expenses) {
            sumOfExpenses += dayExpenses;
        }
        System.out.println("Расходы за месяц составили " + sumOfExpenses + " руб.");
        System.out.println("");
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] expenses = generateRandomArray();
        int minExp = expenses[0],
                maxExp = 0;
        for (int dayExpenses : expenses) {
            if (minExp > dayExpenses) {
                minExp = dayExpenses;
            }
            if (maxExp < dayExpenses) {
                maxExp = dayExpenses;
            }
        }
        System.out.println("Ежедневные расходы составили: " + minExp + " руб./день минимум, " + maxExp + " руб./день максимум");
        System.out.println("");
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] expenses = generateRandomArray();
        int sumOfExpenses = 0;
        double averageDayExpense = 0.0;
        for (int dayExpenses : expenses) {
            sumOfExpenses += dayExpenses;
        }
        System.out.println("Расходы за месяц составили " + sumOfExpenses + " руб.");
        averageDayExpense = (float) sumOfExpenses / expenses.length;
        System.out.printf("Средняя сумма дневных трат равна %10.2f руб./день\n", averageDayExpense);
        System.out.println("");
    }

    public static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int maxIndex = reverseFullName.length - 1;
        for (int i = 0; i <= maxIndex; i++) {
            System.out.print(reverseFullName[maxIndex - i]);
        }
        System.out.println(".\n");
    }

    public static void hwCompleted() {
        System.out.println("Домашнее задание " + hw + " выполнено");
        System.out.println(" ");
    }

}