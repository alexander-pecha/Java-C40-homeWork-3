// 5) Создайте два массива из 10 целых случайных чисел из отрезка [0;9] и третий массив из 10 действительных чисел.
// Каждый элемент с i-ым индексом третьего массива должен равняться отношению элемента из первого массива
// с i-ым индексом к элементу из второго массива с i-ым индексом. Вывести все три массива на экран
// (каждый на отдельной строке), затем вывести количество целых элементов в третьем массиве.
import java.util.Arrays;
import java.util.Random;

public class Z5 {
    public static void main(String[] args) {
        Random random = new Random();

        double[] mass1 = new double[10];
        int[] mass2 = new int[10];
        double[] mass3 = new double[10];

        for(int i = 0; i < mass1.length; i++){
            mass1[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(mass1));

        for(int i = 0; i < mass2.length; i++){
            mass2[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(mass2));

            int result = 0;
        for(int i = 0; i < mass3.length; i++){
            mass3[i] += mass1[i] / mass2[i];
            if(mass3[i] % 2 == 0){
                result ++;
            }
        }
        System.out.println(Arrays.toString(mass3));
        System.out.println("В третьем массиве целых " + result + " элемент/а/ов");
    }
}
