import java.util.Arrays;
import java.util.Random;
//4) Создайте массив из 12 случайных целых чисел из отрезка [0;15].
// Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.

public class z4 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] mass = new int[12];
        int maxNumber = 0;
        int indexLast = 0;

        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(16);

            if (mass[i] >= maxNumber) {
                maxNumber = mass[i];
                indexLast = i;
            }
        }
        System.out.println(Arrays.toString(mass));
        System.out.println("Максимальный элемент " + maxNumber);
        System.out.println("Индекс его последнего вхождения в массив " + indexLast);
    }
}
