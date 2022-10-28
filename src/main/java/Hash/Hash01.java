package Hash;

import java.sql.SQLOutput;

public class Hash01 {
    public int hash(String str) {
        int ascii = 0;
        for (int i = 0; i < str.length(); i++) {
            ascii += str.charAt(i);

        }
        return ascii % 1000; // 나누는 이유?
    }

    public static void main(String[] args) {
        Hash01 h = new Hash01();

        System.out.println(h.hash("안녕"));
    }
}
