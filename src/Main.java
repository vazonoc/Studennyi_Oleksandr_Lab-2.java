import java.util.Scanner;

import static java.lang.Math.*;
import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {
        // Виклик методу main з кожного класу в зазначеному порядку
        Exercise_1.main(args);
        Exercise_2.main(args);
        Exercise_3.main(args);
        Exercise_4.main(args);
        Exercise_5.main(args);
    }
}

class Exercise_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть коефіцієнти a, b та c для квадратного рівняння ax^2 + bx + c = 0:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        solveQuadraticEquation(a, b, c);
        scanner.close();
    }

    public static void solveQuadraticEquation(double a, double b, double c) {
        double D = b * b - 4 * a * c;
        if (D > 0) {
            double max = (-b + Math.sqrt(D)) / (2 * a);
            double min = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("Розв'язки квадратного рівняння: x1 = " + max + ", x2 = " + min);
        } else if (D == 0) {
            double root = -b / (2 * a);
            System.out.println("Розв'язок квадратного рівняння: x = " + root);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-D) / (2 * a);
            System.out.println("Розв'язки квадратного рівняння: ");
            System.out.println("x1 = " + realPart + " + " + imaginaryPart + "i");
            System.out.println("x2 = " + realPart + " - " + imaginaryPart + "i");
        }
    }
}
class Exercise_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть координати точки (x, y):");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        int quadrant = findQuadrant(x, y);
        if (quadrant != 0) {
            System.out.println("Точка знаходиться у " + quadrant + " квадранті.");
        } else {
            System.out.println("Точка знаходиться на вісі або в початковій точці.");
        }
        scanner.close();
    }
    public static int findQuadrant(double x, double y) {
        if (x > 0 && y > 0) {
            return 1;
        } else if (x < 0 && y > 0) {
            return 2;
        } else if (x < 0 && y < 0) {
            return 3;
        } else if (x > 0 && y < 0) {
            return 4;
        } else {
            return 0;
        }
    }
}
class Exercise_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число: ");
        int number = scanner.nextInt();
        if (number >= 10 && number <= 99) {
            System.out.println("Число є двозначним.");
        } else {
            System.out.println("Число не є двозначним.");
        }
        if (number % 2 == 0) {
            System.out.println("Число парне.");
        } else {
            System.out.println("Число непарне.");
        }
        scanner.close();
    }
}

   class Exercise_4 {
    //21 Варіант
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        double result;

        if (x <= 0.5) {
            result = abs(3 * tan(x));
        } else if (x < 1) {
            result = pow((2 - x) / 3, 0.2);
        } else {
            result = sin(x) - cos(pow(x, 0.2)) / 3;
        }

        System.out.print(result);
    }
}


class Exercise_5 {
    //Варіант 7
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Меню:");
            System.out.println("1. Обчислити добуток двох чисел");
            System.out.println("2. Обчислити суму двох чисел");
            System.out.println("3. Обчислити різницю двох чисел");
            System.out.println("0. Вийти з програми");
            System.out.print("Виберіть опцію: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    multiplyNumbers();
                    break;
                case 2:
                    addNumbers();
                    break;
                case 3:
                    subtractNumbers();
                    break;
                case 0:
                    System.out.println("Програма завершує роботу.");
                    break;
                default:
                    System.out.println("Невірний вибір. Спробуйте ще раз.");
            }
        } while (choice != 0);

        scanner.close();
    }

    public static void multiplyNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть перше число: ");
        double num1 = scanner.nextDouble();
        System.out.print("Введіть друге число: ");
        double num2 = scanner.nextDouble();
        double result = num1 * num2;
        System.out.println("Добуток чисел: " + result);
    }

    public static void addNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть перше число: ");
        double num1 = scanner.nextDouble();
        System.out.print("Введіть друге число: ");
        double num2 = scanner.nextDouble();
        double result = num1 + num2;
        System.out.println("Сума чисел: " + result);
    }

    public static void subtractNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть перше число: ");
        double num1 = scanner.nextDouble();
        System.out.print("Введіть друге число: ");
        double num2 = scanner.nextDouble();
        double result = num1 - num2;
        System.out.println("Різниця чисел: " + result);
    }
}
