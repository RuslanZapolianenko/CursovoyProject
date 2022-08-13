import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        System.out.print("Введите дату в формате 02/11/1995 |");
        Scanner input = new Scanner(System.in);
        String str=  input.next();
        char[] chars = str.toCharArray();               // преобразования строки в массив символов
        char[] charValue = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};  // массив символов для сравнения

        System.out.println("Проверим формат");
        boolean[] formatBool = new boolean[10];         // введенный формат
        boolean[] testBool = {true, true, false, true, true, false, true, true ,true ,true}; // формат

        // Проверка формата
        for (int i = 0; i < 10; i++) {
            for (int l = 0; l < 10; l++) {
                if (chars[i] == charValue[l]) {
                    formatBool[i] = true;
                    break;
                } else {
                    formatBool[i] = false;
                }
            }
        }

        if (Arrays.equals (formatBool, testBool)){ // Сравним формат  Arrays.equals - сравнение массивов
            System.out.println("Отлично формат подходит");
            //________________________________________________________Задача 4
            int sumValue = 0; // сумма значений символов
            for (int i = 0; i < 10; i++) {

                for (int l = 0; l < 10; l++) {

                    if (chars[i] == charValue[l]) {

                        System.out.print(chars[i] + "(" + charValue[l] + ")" + "+" );
                        sumValue +=l;  // сумма значений символов
                    }
                }
            }
            System.out.println(" сумма даты = " + sumValue  );
            //________________________________________________________Задача 4
        } else  {
            System.out.println("Формат не подходит ");
        }
    }
}



