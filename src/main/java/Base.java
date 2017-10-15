import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Kalinaeva M.
 * @see #main(String[])
 */
public class Base {
    public static void main(String[] args) {
        /**
         * Калькулятор и сортировщик
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер задания(1-Калькулятор; 2-Поиск максимального элемента)");
        int w = scanner.nextInt();
        if (w == 1) {

            System.out.println("Введите первое число: ");
            double a = scanner.nextDouble();

            System.out.println("Введите второе число: ");
            double b = scanner.nextDouble();

            System.out.println("Введите операцию (+,-,*,/): ");
            String oper = scanner.next();

            if (oper.equals("+")) {
                double c = a + b;
                System.out.print("Сумма: ");
                System.out.printf("%10.4f", c);
            } else if (oper.equals("-")) {
                double c = a - b;
                System.out.print("Разность: ");
                System.out.printf("%10.4f", c);
            } else if (oper.equals("*")) {
                double c = a * b;
                System.out.print("Умножение: ");
                System.out.printf("%10.4f", c);
            } else if (oper.equals("/")) {
                double c = a / b;
                System.out.print("Деление: ");
                System.out.printf("%10.4f", c);
            } else {
                System.out.print("Недопустимая операция");
            }
        }

        else if (w == 2){
            System.out.println("Поиск максимального элемента в массиве");
            List<String> wordsList = new ArrayList<String>();
            System.out.println("Введите размер массива");
            int length = scanner.nextInt();
            System.out.println("Введите слова");
            for (int i = 0; i < length; i++) {
                String word = scanner.next();
                wordsList.add(word);
            }
            String max = wordsList.get(0);
            for (String value : wordsList) {
                if (value.length() > max.length()) {
                    max = value;
                }
            }
            System.out.println("Самое длинное слово " + max);
        }
        scanner.close();

    }
}
