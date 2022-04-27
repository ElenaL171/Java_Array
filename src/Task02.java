import java.nio.file.LinkPermission;
import java.util.Scanner;
public class Task02 {
    public static void main(String args[]) {
        //Реализовать метод, который возвращает сумму элементов заданного массива int
        //{10, 3, 23, 5, -9} -> 32
        System.out.println("Введите количество элементов массива");
        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();
        int[] array = inputArray(j);
        printArray(array);
        System.out.println("Сумма элементов массива " + sum(array));
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

    public static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
          sum = sum + array[i];
        }
        return sum;
    }
}
