import java.util.Scanner;
public class Zadacha2_31 {
    /*
    Напишите класс, который принимает с клавиатуры два целых числа, образующих ответ на вопрос
    «который час?» (первое - часы, второе - минуrы, например, 15 и 42) и выводит на экран
    следующие значения (каждое в отдельной строке): сколько секунд прошло с полуночи до «данного
    момента» и сколько минут прошло за это же время, а также сколько минут осталось до полуночи.
     */

    public static void main(String[] args) {
        System.out.println("Ввести через пробел часы и минуты");
        Scanner in = new Scanner(System.in);
        int hours, minutes, seconds, minutes1, minutes2;
        hours = in.nextInt();
        minutes = in.nextInt();
        seconds = hours * 3600 + minutes * 60;
        System.out.println("Секунд прошло " + seconds);
        minutes1 = hours * 60 + minutes;
        System. out. println("Минут прошло " + minutes1);
        minutes2 = 24 * 60 - minutes1;
        System. out. println("Минут осталось до полуночи " + minutes2);
    }
}
