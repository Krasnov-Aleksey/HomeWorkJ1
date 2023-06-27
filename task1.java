import java.util.Scanner;

/**
 * task1
 * 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), 
 * n! (произведение чисел от 1 до n)
 */
public class task1 {
    
    static int input (String msg){
        // Чтение int в консоле
        Scanner iScanner = new Scanner(System.in);
        System.out.printf(msg);
        int number = iScanner.nextInt();
        iScanner.close();
        return number;
    }

    static int sum_numbers(int num){
        // сумма чисел от 1 до num
        if (num==1){ 
            return 1;
        }
        return num+sum_numbers(num-1);
    }

    static int fac (int num){
        // произведение чисел от 1 до num (факториал)
        if (num==1){
            return 1;
        }
        return num*fac(num-1);
    }

    public static void main(String[] args) {
        int number=input("Введите число ");
        System.out.println("Сумма чисел = " + sum_numbers(number));
        System.out.println("Произведение чисел = "+ fac(number));
    }

    
}