package Hash;

public class Hash02 {
    public int hash(String key) {
        int ascii = 0;
        for (int i = 0; i < key.length(); i++) {
            ascii = +key.charAt(i);

        }
        return ascii % 0;
    }

    public static void main(String[] args) {
        Hash02 h = new Hash02();
        h.hash("kyeongrok");
    }


}
