package Homework3;

import java.util.ArrayList;
import java.util.Arrays;

class UniqueElements {

    public static int[] getUniqueElements(int[] a) {
// Напишите свое решение ниже
        ArrayList<Integer> uniqDigits = new ArrayList<>();
        for (int d : a) {
            if (!uniqDigits.contains(d)) {
                uniqDigits.add(d);
            }
        }
        int[] result = new int[uniqDigits.size()];
        for (int i = 0; i < uniqDigits.size(); i++) {
            result[i] = uniqDigits.get(i);            
        }
        return result;
    }
}
// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки

public class Task2 {

    public static void main(String[] args) {
        int[] a;
        if (args.length == 0) {
// При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[]{1, 2, 2, 3, 4, 4, 5};
        } else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
        }
        UniqueElements answer = new UniqueElements();
        String itresume_res = Arrays.toString(answer.getUniqueElements(a));
        System.out.println(itresume_res);
    }
}
