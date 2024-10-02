package Homework3;

import java.util.ArrayList;
import java.util.Arrays;

class FilterStrings {

    public static String[] filterShortStrings(String[] arr) {
// Напишите свое решение ниже
        ArrayList<String> strList = new ArrayList<>();
        for (String a : arr) {
            if (a.length() > 3) {
                strList.add(a);
            }
        }
        return strList.toArray(new String[strList.size()]);
    }
}
// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки

public class Task3 {

    public static void main(String[] args) {
        String[] arr;
        if (args.length == 0) {
// При отправке кода на Выполнение, вы можете варьировать эти параметры
            arr = new String[]{"cat", "elephant", "dog", "giraffe", "kora"};
        } else {
            arr = args[0].split(", ");
        }
        FilterStrings answer = new FilterStrings();
        String itresume_res = Arrays.toString(answer.filterShortStrings(arr));
        System.out.println(itresume_res);
    }
}
