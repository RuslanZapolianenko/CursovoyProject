import java.util.Scanner;

public class Task1 {


    static int sumValueM(char[] chars, String str){

        char[] charValue = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};  // массив символов для сравнения

        int sumValue = 0; // сумма значений символов

        for (int i = 0; i < chars.length; i++) {

            for (int l = 0; l < 10; l++) {

                if (chars[i] == charValue[l]) {

                    System.out.print("(" + charValue[l] + ")" + "+" );
                    sumValue +=l;  // сумма значений символов
                }
            }
        }
        System.out.println(" сумму цифр " + str +" числа = " + sumValue  );

        return sumValue;
    }


    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Введите Ваше число ");
        String number = in.next();
        char[] chars = number.toCharArray(); // преобразования строки в массив символов



        sumValueM(chars, number);


    }
}
//Напишите метод, который принимает число и возвращает сумму цифр данного числа