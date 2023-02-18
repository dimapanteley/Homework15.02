public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    } //генерация рандомных чисел


    public static void task1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray(); // вызываем заданный массив
        int sum = 0; // Обьявляем сумму всех выплат
        for (int i = 0; i < arr.length; i++) {   // Задаем цикл
            sum = sum + arr[i]; // прибавляем значение элементов
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей"); // выводим результат

    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray(); // вызываем заданный массив
        int min = 200000; // Минимальная трата
        int max = 100000; // Максимальная трата
        for (int i = 0; i < arr.length; i++) { //Задаем цикл
            if (arr[i] < min) {  // если элемент массива меньше min
                min = arr[i]; // то присваиваем значение min элементу массива
            }
            if (arr[i] > max) { // если элемент массива больше max
                max = arr[i]; //то присваиваем значение max элементу массива
            }
        }
        System.out.println("Максимальное значение - " + max + ". Минимальное - " + min);

    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray(); // вызываем заданный массив
        double sum = 0; // Обьявляем сумму всех выплат
        for (int i = 0; i < arr.length; i++) {   // Задаем цикл
            sum = sum + arr[i]; // прибавляем значение элементов
        }
        double sred = sum / 30.0;
        System.out.println("Средняя сумма трат за месяц составила " + sred + " рублей");


    }

    public static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) { // задаем цикл
            System.out.print(reverseFullName[i]);
        }
    }
}
