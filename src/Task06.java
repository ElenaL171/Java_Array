import java.nio.file.LinkPermission;
import java.util.Scanner;
public class Task06 {
    public static void main(String args[]) {
        //Реализуйте метод, который создает заданный массив в обратном порядке. Это похоже на предыдущее
        //но вы должны решить это без нового массива {10, 3, 3, 5, -9} -> {-9, 5, 3, 3, 10}
        System.out.println("Введите количество элементов массива");
        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();
        int[] array = inputArray(j);
        printArray(array);
        array = chanchArray(array);
        printArray(array);
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
    public static int [] chanchArray(int[] array) {
        int i;
        int [] arrayNeu = new int[array.length];
        for (i = 0; i < array.length; i++) {
            int f=array.length-1-i;
            arrayNeu[i]=array[f];
        }
        return arrayNeu;
    }
}

