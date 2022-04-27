import java.nio.file.LinkPermission;
import java.util.Scanner;
public class Task04 {
    public static void main(String args[]) {
        //Реализуйте метод, который возвращает новый массив int. Каждый элемент массива является следующей степенью двойки. Дана длина массива n (максимальное значение n равно 30. Как вы думаете, почему?)
        //powerOfTwo (5) -> {1,2,4,8,16}
        System.out.println("Введите количество элементов массива");
        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();
        int[] array = inputArray(j);
        printArray(array);
    }
    public static int[] inputArray(int j) {
        int i;
        int[] array = new int[j];
        array[0]=1;
        for (i = 1; i < j; i++) {
            array[i] = array[i-1]*2;
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
}



