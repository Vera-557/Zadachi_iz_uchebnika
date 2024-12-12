import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        System.out.println("Введем цифру от 1 до 3 и получим ее, нарисованную символами");
        int er = new Scanner(System.in).nextInt();


        switch (er){
            case 1 :  char [][] edinica = new char[5][5];
                for (int i = 0; i<5; i++){
                    for ( int j = 0; j<5;j++){
                        edinica[i][j] = ' ';
                        if (i== 1 && j == 2){
                            edinica[i][j] = '*';
                        }

                        if (i== 2 && j == 1){
                            edinica[i][j] = '*';
                        }
                        if (j == 3){
                            edinica[i][j] = '*';

                        }
                        System.out.print(edinica[i][j] + " ");

                    }System.out.println();
                }
                break;
            case 2 : char [][] dwa = new char[5][5];
                for (int i = 0; i < 5; i ++){
                    for (int j = 0; j < 5; j ++){
                        dwa[i][j] = ' ';
                        if (i == 0 && j > 0 && j < 4){
                            dwa[i][j] = '*';
                        }
                        if (i == 1 && j == 4){
                            dwa[i][j] = '*';
                        }
                        if (i == 1 && j == 0){
                            dwa[i][j] = '*';
                        }
                        if (i == 2 && j == 3){
                            dwa[i][j] = '*';
                        }
                        if (i == 3 && j == 1){
                            dwa[i][j] = '*';
                        }
                        if (i == 4){
                            dwa[i][j] = '*';
                        }
                        System.out.print(dwa[i][j] + " ");
                    }
                    System.out.println();
                }
                break;
            case 3: char [][] tri = new char[5][5];
            for (int i = 0; i < 5; i++){
                for (int j = 0; j < 5; j++){
                    tri[i][j] = ' ';
                   if (i == 0 && j >= 1){
                       tri[i][j] = '*';
                   }
                   if (i == 1 &&  j == 4){
                       tri[i][j] = '*';
                   }
                   if (i == 2 && j == 3){
                       tri[i][j] = '*';
                   }
                    if (i == 3 && j == 4){
                        tri[i][j] = '*';
                    }
                    if (i == 4 && j >= 1){
                        tri[i][j] = '*';
                    }
                    System.out.print(tri[i][j] + " ");
                }
                System.out.println();
            }
            break;
            default:
                System.out.println("Error");
        }




    }
}

