import java.util.Arrays;
import java.util.Random;

public class z7 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] mass = new int[10];

        int Countpozitiv = 0;
        int Countnegativ = 0;
        for( int i = 0; i < mass.length; i++){
            mass[i] = random.nextInt(10);
            if(mass[i] % 2 == 0 && mass[i] != 0){
                Countpozitiv++;
            }
            if(mass[i] % 2 == 1 && mass[i] != 0){
                Countnegativ++;
            }
        }
        int[] massPozitiv = new int[Countpozitiv];
        int pozitiv = 0;
        int[] massNegativ = new int[Countnegativ];
        int negativ = 0;

        for(int i = 0; i < mass.length; i++){
            if(mass[i] % 2 == 0 && mass[i] != 0){
                massPozitiv[pozitiv] = mass[i];
                pozitiv++;

            }
            if(mass[i] % 2 == 1 && mass[i] != 0){
                massNegativ[negativ] = mass[i];
                negativ++;
            }
        }

        System.out.println(Arrays.toString(mass));
        System.out.println(Countnegativ);
        System.out.println(Countpozitiv);
        System.out.println(Arrays.toString(massPozitiv));
        System.out.println(Arrays.toString(massNegativ));

    }
}
