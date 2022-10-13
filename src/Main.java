import java.util.Scanner;
class Scratch {
    private static int t = 1;
    public static void main(String[] args) {
        while (t == 1) {
            System.out.println("Продолжить работу? \n1-да \n0-нет");
            Scanner first = new Scanner(System.in);
            int end = first.nextInt();
            if (end==0) {
                break;
            }
            Calculater();
        }
    }
    public static void Calculater() {
        Scanner in = new Scanner(System.in);
        System.out.println("Здравствуйте! Калькулятор: Простой - 1. Решение квадратного уравнения - 2");
        String e = in.next();

        if (e.equals("1")) {
            System.out.println("Введите число 1");
            double num1 = in.nextInt();
            System.out.println("Введите число 2");
            double num2 = in.nextInt();
            System.out.println("Какая операция(+,-,*,/):");
            String op = in.next();

            if (op.equals("+")) {
                System.out.println( sum(num1, num2));
            } else if (op.equals("-")) {
                System.out.println(sub(num1, num2));
            } else if (op.equals("*")) {
                System.out.println(mult(num1, num2));
            } else if (op.equals("/")) {
                System.out.println(div(num1, num2));
            }else {
                System.out.println("Error");
            }
        } else if (e.equals("2")) {
            System.out.println("Введите коэфициент a:");
            double a = in.nextInt();
            System.out.println("Введите коэфициент b:");
            double b = in.nextInt();
            System.out.println("Введите коэфициент c:");
            double c = in.nextInt();
            System.out.println(equa(a,b,c ));

        }else {
            System.out.println("Error");
        }

    }

    public static double sum(double num1, double num2) {
        return num1 + num2;
    }

    public static double sub(double num1, double num2) {
        return num1 - num2;
    }

    public static double div(double num1, double num2) {
        return num1 / num2;
    }

    public static double mult(double num1, double num2) {
        return num1 * num2;
    }

    public static String equa(double a, double b, double c) {
        double d = b * b - (4 * a * c);
        String roots;
        if (d > 0) {
            double x1 = ((-1) * b - Math.sqrt(d)) / (2 * a);
            double x2 = ((-1) * b + Math.sqrt(d)) / (2 * a);
            roots = ("x1 = " + x1 + "\nx2 = " + x2);
        } else if (d == 0) {
            double x = (-1) * b / (2 * a);
            roots = ('x' + "=" + x);
        } else {
            roots = ("Нет корней.");
        }
        return roots;
    }
}