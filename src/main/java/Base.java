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


        System.out.println("Введите первое число: ");
        double a = scanner.nextDouble();

        System.out.println("Введите второе число: ");
        double b = scanner.nextDouble();

        double sum = a + b;

        System.out.print("Sum: ");
        System.out.printf("%10.4f", sum);

        scanner.close();

    }
}
