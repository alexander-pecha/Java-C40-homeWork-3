import java.util.Arrays;
import java.util.Random;
//3) Создайте массив из 4 случайных целых чисел из отрезка [0;10], выведите его на экран в строку.
// Определить и вывести на экран сообщение о том, является ли массив строго возрастающей последовательностью.
public class Z3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] mass = new int[4];

        for( int i = 0; i < mass.length; i++){
            mass[i] = random.nextInt(11);
        }
        System.out.println(Arrays.toString(mass));

        boolean up = true;
        for(int i = 1; i < mass.length; i++){
            if(mass[i-1] > mass[i]){
                up = false;
                break;
            }
        }
        if (up) {
            System.out.println("Массив строго возрастающей последовательности");
        }else {
            System.out.println("Массив не является строго возрастающей последовательностью");
        }
    }
}