import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        System.out.print("Введите количество значений (индекс): ");
        Scanner input = new Scanner(System.in);
        int index = input.nextInt();
        int [] myArrayOne = new int[index];
        boolean formatBool = false;

        System.out.println("Введите значений ниже");
        for(int i = 0; i < index ; i++ ){
            System.out.print(" |");
            int number = input.nextInt();
            myArrayOne[i] = number;
        }

        System.out.println("Выведем число из myArrayOne: ");
        for (int i = 0; i < index; i++){
            System.out.print(myArrayOne[i]);
        }

        // Проверка на 0
        for (int i = 0; i < index; i++) {
            if (myArrayOne[i] == 0) {
                formatBool = true;
                break;}
        }

        if (formatBool){
            System.out.println(" В массиве есть 0 не подходит ");
        } else {
            System.out.println("\nВсе ок 0 НЕТ ");

            System.out.println("Выведем реверс myArrayOne: ");

            for (int i = index-1; i >= 0 ; i--){
                System.out.print(myArrayOne[i]);
            }
        }
    }
}
//Напишите метод, который принимает число, которое не содержит нулей и возвращает цифры в
//обратном порядке.
// Например, на вход: 789 на выход: 987