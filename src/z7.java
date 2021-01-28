import java.util.Arrays;
import java.util.Random;

public class z7 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] mass = new int[10];

        int pozitiv = 0;
        int negativ = 0;
        for( int i = 0; i < mass.length; i++){
            mass[i] = random.nextInt(10);
            if(mass[i] % 2 == 0 && mass[i] != 0){
                pozitiv++;
            }
            if(mass[i] % 2 == 1 && mass[i] != 0){
                negativ++;
            }
        }
        int[] mass1 = new int[pozitiv];

        for(int i = 0; i < mass.length; i++){
                mass1[pozitiv] = mass[i];
                pozitiv++;

        }
        int[] mass2 = new int[negativ];

        for(int i = 0; i < mass.length; i++){
            mass2[negativ] = mass[i];
            negativ++;
        }

        System.out.println(Arrays.toString(mass));
        System.out.println(Arrays.toString(mass1));
        System.out.println(Arrays.toString(mass2));
    }
}
