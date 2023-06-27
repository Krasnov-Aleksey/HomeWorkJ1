/*
 * Реализовать простой калькулятор
 */

import java.util.Scanner;

public class task3 {

    static void calculator() {
        Scanner iScanner = new Scanner(System.in);

        System.out.printf("Введите 1-ое число ");
        double num_1 = iScanner.nextDouble();

        System.out.printf("Введите арифметическую операцию  (*,/,+,-) ");
        String arith_operation = iScanner.next();
        
        System.out.printf("Введите 2-ое число ");
        double num_2= iScanner.nextDouble();

        iScanner.close();

        double res = 0;

        switch (arith_operation) {
            case "*": res = num_1*num_2;
            break;
            case "/": res = num_1/num_2;
            break;
            case "+": res = num_1+num_2;
            break;
            case "-": res = num_1-num_2;
            break;
            default : System.out.println("Ошибка. Введите правильную операцию");
            return;
        }

        System.out.println(res);
        }
    public static void main(String[] args) {
        calculator();
    }
    
}
