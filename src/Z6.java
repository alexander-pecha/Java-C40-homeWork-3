import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//6) Пользователь вводит с клавиатуры число большее 3, которое сохраняется в переменную n.
// Если пользователь ввёл не подходящее число, то программа должна выдать соответствующее сообщение.
// Создать массив из n случайных целых чисел из отрезка [0;n] и вывести его на экран.
// Создать второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.
public class Z6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите число больше 3");

        int n = scanner.nextInt();
        if (n < 3){
            System.out.println("Вы ввели число меньше 3, введите число больше");
        }
        int[] mass1 = new int[n];
        int sum = 0;

        for(int i = 0; i < mass1.length; i++){
            mass1[i] = random.nextInt(n);
            if(mass1[i] % 2 == 0 && mass1[i] != 0){
                sum ++;
            }
        }
        int[] mass2 = new int[sum];
        int sum1 = 0;

        for( int i = 0; i < mass1.length; i++){
           if(mass1[i] % 2 == 0 && mass1[i] != 0) {
               mass2[sum1] = mass1[i];
               sum1++;
           }
        }

        System.out.println(Arrays.toString(mass1));
        System.out.println("Количество четных элементов первого массива " + sum);
        System.out.println(Arrays.toString(mass2));
    }
}
