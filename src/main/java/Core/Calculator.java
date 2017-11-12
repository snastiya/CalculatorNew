package Core;

public class Calculator {
    private double sum(int a, int b) {
        return a + b;
    }

    private double minus(int a, int b) {
        return a - b;
    }

    private double multiply(int a, int b) {
        return a * b;
    }

    private double division(int a, int b) {
        if(b==0){
            throw new ArithmeticException();
        }
        return (double) a / (double) b;
    }

    private double division(double a, double b) {
        if (b==0){
            throw new ArithmeticException();
        }
        return a / b;
    }

    private double sum(double a, double b) {
        return a + b;
    }

    private double minus(double a, double b) {
        return a - b;
    }

    private double multiply(double a, double b) {
        return a * b;
    }

    public double calculate(int a, int b, String oper) {
        if (oper.equals("+")) {
            return this.sum(a, b);
        } else if (oper.equals("-")) {
            return this.minus(a, b);
        } else if (oper.equals("*")) {
            return this.multiply(a, b);
        } else if (oper.equals("/")) {
            return this.division(a, b);
        } else {
            System.out.println("Недопустимая операция");
            return 0;
        }
    }

    public double calculate(double a, double b, String oper) {
        if (oper.equals("+")) {
            return this.sum(a, b);
        } else if (oper.equals("-")) {
            return this.minus(a, b);
        } else if (oper.equals("*")) {
            return this.multiply(a, b);
        } else if (oper.equals("/")) {
            return this.division(a, b);
        } else {
            System.out.println("Недопустимая операция");
            return 0;
        }
    }
}