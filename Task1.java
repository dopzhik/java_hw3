package Homework3;

import java.util.ArrayList;
import java.util.Arrays;

class FilterNegative {

    public static int[] filterNegative(int[] a) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int digit : a) {
            if (digit >= 0) {
                temp.add(digit);
            }
        }
        int[] digits = temp.stream().mapToInt(i->i).toArray();

        return digits;
// Напишите свое решение ниже
    }
}
// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки

public class Task1 {

    public static void main(String[] args) {
        int[] a;
        if (args.length == 0) {
// При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[]{-1, 2, -3, 4, -5, 6, 10, 1, 0};
        } else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
        }
        FilterNegative answer = new FilterNegative();
        String itresume_res = Arrays.toString(answer.filterNegative(a));
        System.out.println(itresume_res);
    }
}
