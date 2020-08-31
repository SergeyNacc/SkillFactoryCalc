package calc;

import java.util.Scanner;

public class Calculator {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        float num1 = getFloat();
        char operation = getOperation();
        float num2 = getFloat();
        float result = Calc(num1,num2,operation);
        System.out.println("Ответ: " + result);
    }

    public static float getFloat() {
        System.out.print("Введите число: ");
        float num;
        if (scanner.hasNextFloat()) {
            num = scanner.nextFloat();
        } else {
            System.out.print("Вы ввели не число!");
            scanner.next();
            num = getFloat();
        }
        return num;
    }

    public static char getOperation() {
        System.out.print("Введите действие из предложенных(+, -, * или /): ");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.print("Выбрали не то действие!");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

    public static float Calc(float num1,float num2,char operation) {
        float res;
        switch (operation) {
            case '+':
                res = num1 + num2;
                break;
            case '-':
                res = num1 - num2;
                break;
            case '*':
                res = num1 * num2;
                break;
            case '/':
                res = num1 / num2;
                break;
            default:
                System.out.println("Неверная операция!");
                res = Calc(num1,num2,getOperation());
        }
        return res;
    }
}