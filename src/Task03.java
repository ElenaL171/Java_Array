import java.nio.file.LinkPermission;
import java.util.Scanner;
public class Task03 {
    public static void main(String args[]) {
        //Реализуйте метод, который печатает все элементы заданного массива, превышающие среднее значение элементов массива.
        //{2, 6, 5, 3} -> 6 5
        System.out.println("Введите количество элементов массива");
        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();
        double m=0;
        int[] array = inputArray(j);
        printArray(array);
        m=mit(array);
        System.out.println("Среднее значение элементов массива " + m);
        printArray2(array, m);
    }
    public static int[] inputArray(int j) {
        int i;
        int[] array = new int[j];
        Scanner sc = new Scanner(System.in);
        for (i = 0; i < j; i++) {
            System.out.println("Введите " + (i + 1) + "-й элемент массива");
            int num1 = sc.nextInt();
            array[i] = num1;
        }
        return array;
    }

    public static void printArray(int[] array) {
        int i;
        for (i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }

    public static void printArray2(int[] array, double m) {
        int i;
        System.out.println("Элементы массива, превышающие среднее");
        for (i = 0; i < array.length; i++) {
            if (array[i] > m) {
                System.out.print(array[i] + ", ");
            }
        }
            System.out.println();

    }
    public static int mit(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum/array.length;
    }
}
