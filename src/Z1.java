import java.util.Arrays;
import java.util.Random;
//1) Создайте массив из 15 случайных целых чисел из отрезка [0; 99]. Выведите массив на экран.
// Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке.
public class Z1 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] mass = new int[15];

        int result = 0;
        for(int i = 0; i < mass.length; i++){
            mass[i] = random.nextInt(100);
            if(mass[i] % 2 == 0){
                result++;
            }
        }
        System.out.println(Arrays.toString((mass)));
        System.out.println("В массиве " + result + " четных элемента(ов)");
    }
}
