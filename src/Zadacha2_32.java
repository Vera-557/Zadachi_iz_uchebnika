import java.util.Arrays;
import java.util.Scanner;


public class Zadacha2_32 {
    /*
    Напишите класс, который принимает с клавиатуры число и выводит на экран обратное ему значение.
     */
    public static void main (String [] args){
        System.out.print("Введите число ");
        String num = new Scanner(System.in).next(); //Пользователь вводит число
        char [] numArray = num.toCharArray();//введенное число преобразуется из строки в массив
        reverse(numArray);//вызов метода для перекрутки массива чисел
    }
    static void reverse (char [] source){
        for (int i = 0; i < source.length / 2; i ++){
            var temp = source[i]; //создаем дополнительную переменную для хранения данных
            source[i] = source[source.length - 1 - i]; //переносим последний индекс в начало
            source[source.length - 1 - i] = temp; //здесь хранится итоговый результат
        }
        System.out.println(Arrays.toString(source));//Печать результата
    }


}
