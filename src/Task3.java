import java.util.Scanner;

    public class Task3 {
        public static void main(String[] args) {

            System.out.print("Введите слово, например ваше имя | ");
            Scanner input = new Scanner(System.in);
            String myWord =  input.next();
            String str = myWord.toLowerCase();
            char[] chars = str.toCharArray();
            // массив символов для сравнения
            char[] charAlf =   new char[]{'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','й','ц','у','к','е','н','г','ш','щ','з','х','ъ','ф','ы','в','а','п','р','о','л','д','ж','э','я','ч','с','м','и','т','ь','б','ю',' ',};
            int sumValue = 0; // сумма значений символов

            for (int i = 0; i < chars.length; i++) {

                for (int l = 0; l < charAlf.length; l++){

                    if (chars[i] == charAlf [l]) {
                        int indexInt = l;
                        sumValue += indexInt;

                        System.out.print(chars[i] +  "("+ indexInt + ") + ");
                    }
                }
            }
            System.out.print(" число слова <<" + myWord + ">> = " + sumValue);
        }







    }






