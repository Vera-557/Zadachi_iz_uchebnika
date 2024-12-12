public class Zadanie2_12 {
    /*
    Напишите класс, который выводит на экран «песочные часы», составленные из какого-либо символа.
     */
    public static void main(String[] args) {

        final char SIMVOL = '♦';

        for(int i =0; i<5; i++){
            System.out.print(SIMVOL);
        }
        System.out.println();
        for (int i = 0; i<1; i++){
            System.out.print(" ");
        }
        for (int j = 0; j<3; j++){
            System.out.print(SIMVOL);
        }
        System.out.println();
        for (int i = 0; i<2; i++){
            System.out.print(" ");
        }
        for (int j = 0; j<1; j++){
            System.out.print(SIMVOL);
        }
        System.out.println();
        for (int i = 0; i<1; i++){
            System.out.print(" ");
        }
        for (int j = 0; j<3; j++){
            System.out.print(SIMVOL);
        }
        System.out.println();
        for(int i =0; i<5; i++){
            System.out.print(SIMVOL);
        }
    }
}