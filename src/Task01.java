import java.nio.file.LinkPermission;
import java.util.Scanner;
public class Task01 {
    public static void main(String args[]) {
        //Реализуйте метод, который возвращает индекс самого большого элемента заданного массива int.
        //{10, 33, 3, 5, -9} -> 1
        System.out.println("Введите количество элементов массива");
        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();
        int[] array = inputArray(j);
        printArray(array);
        System.out.println("Индекс максимального элемента массива " + max(array));
        ;
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

    public static int max(int[] array) {
        int max = array[0];
        int f = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                f = i;
            }
        }
        return f;
    }
}
