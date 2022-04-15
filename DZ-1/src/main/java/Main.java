import java.util.Scanner;
import java.util.function.ToIntFunction;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long res;
        long end = 2147483646;
        long begin = 0;
        long sred;

        System.out.println("Пользователь, загадай число (целое, не отрицательное, меньше 2147483646)!");
        while(true){
            sred = (begin + end) / 2;

            System.out.println("Найдено число: " + sred);
            System.out.println(0 + " - это и есть загаданное число");
            System.out.println(1 + " - загаданное число больше найденного");
            System.out.println(2 + " - загаданное число меньше найденного");
            System.out.print("Введите команду: ");

            Scanner a = new Scanner(System.in);
            res = a.nextLong();

            if (res == 0){
                System.out.println("Итоговый результат - " + sred);
                break;
            } else if (res == 1){
                begin = sred;
            } else if (res == 2) {
                end = sred;
            } else {
                System.out.println("Команда не определена");
            }

            if(res == 1 && sred == end - 1){
                begin += 1;
            }
        }
    }
}
