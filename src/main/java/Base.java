import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import Core.Calculator;

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
            try {
                System.out.println("Введите первое число: ");
                double a = scanner.nextDouble();

                System.out.println("Введите второе число: ");
                double b = scanner.nextDouble();

                System.out.println("Введите операцию (+,-,*,/): ");
                String oper = scanner.next();

                Calculator calc = new Calculator();

                System.out.println("Ответ");

                System.out.println(calc.calculate(a, b, oper));
            }
            catch (InputMismatchException e) {
                System.out.println("Вводите десятичные числа через запятую");
                System.out.println(e.fillInStackTrace());
            }
            catch (ArithmeticException e) {
                System.out.println("Нельзя делить на ноль");
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
