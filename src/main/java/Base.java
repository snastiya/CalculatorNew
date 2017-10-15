import java.util.Scanner;

/**
 * @author Kalinaeva M.
 * @see #main(String[])
 */
public class Base {
    public static void main(String[] args) {
        /**
         * считывает два дробных числа и выводит их сумму с точностью до 4ого знака
         */
        Scanner scanner = new Scanner(System.in);
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
            System.out.println("Тут будет сортировка");
        }
        scanner.close();

    }
}
