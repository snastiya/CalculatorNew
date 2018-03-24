import Core.CalculatorNew;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Base {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("Введите первое число: ");
                double a = scanner.nextDouble();

                System.out.println("Введите второе число: ");
                double b = scanner.nextDouble();

                System.out.println("Введите операцию (+,-,*,/): ");
                String oper = scanner.next();

                CalculatorNew calc = new CalculatorNew();

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

    }

