package test;

import java.util.Arrays;

public class SplitTest {
    public static void main(String[] args) {
        String str = "a-b-c-d-e";
        String[] arr1 = new String[0];
        String[] arr2 = new String[0];
        arr1 = str.split("-"); // {"a", "b", "c", "d", "e"}
        arr2 = str.split("-", 2); // {"a", "b-c-d-e"}

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        String string = "01088888888";
        String[] stringArr = new String[0];
        stringArr = string.split("");
        System.out.println(String.join("-", stringArr));
    }
}
