//package Hash;
//
//import java.util.ArrayList;
//
//import static java.util.Objects.hash;
//
//
//public class Hash03 {
//
//    ArrayList<String> table = new ArrayList<>();
//
//    public void insert(String key, int value) {
//        int hashIdx = hash(key);
//        if (this.table[hashIdx] == null) {
//            this.table[hashIdx] = new ArrayList<>(); // hash table value값에 list를 추가
//            this.table[hashIdx].add(value);
//        }
//
//    }
//}
