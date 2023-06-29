/*
 * 4) (дополнительное задание) Задано уравнение вида q + w = e, q, w, e >= 0. 
 * Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69. 
 * Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.
 */

import java.util.Scanner;

public class task4 {

    static void equation() {
        boolean flag = true;
        Scanner iScanner = new Scanner(System.in);

        System.out.println("Введите уровнение вида (2?+?5=69)");
        String text = iScanner.nextLine();

        iScanner.close();

        int [] index_replase = new int[2]; // индексы в массив для ?
        int pos=0;

        for (int i=0; i<text.length(); i++) { 
            if (text.charAt(i) == '?') {
                index_replase[pos] = i;
                pos++;
            }
        }
            for (int i=0; i<=9; i++) {
            char num_1_ch = Character.forDigit(i, 10);
        
            for (int j=0; j<=9; j++) {
                char num_2_ch = Character.forDigit(j, 10); // int->char

                StringBuilder sb = new StringBuilder(text);
                sb.setCharAt(index_replase[0], num_1_ch); // Добавление в страку по индексу
                sb.setCharAt(index_replase[1], num_2_ch);
                text= sb.toString();

                String [] text_arr = text.split("[+=]"); // убрал +=
                int arr_num_1=Integer.parseInt(text_arr[0]); //str -> int
                int arr_num_2=Integer.parseInt(text_arr[1]);
                int arr_num_3=Integer.parseInt(text_arr[2]);

                if (arr_num_1+arr_num_2==arr_num_3){
                    System.out.println("Решение "+arr_num_1+"+"+arr_num_2+"="+arr_num_3);
                    flag = false;
                }
            }
        }
        if (flag) System.out.println("Решение не найдено");
    }


    public static void main(String[] args) {
        equation();
    }
}
