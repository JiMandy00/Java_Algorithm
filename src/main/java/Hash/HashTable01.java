// 22 10 26
// Hash를 생성해서 데이터를 삽입
// 단, 중복은 신경쓰지 않는다.

package Hash;

import java.util.HashSet;
import java.util.Set;

public class HashTable01 {
    private int size = 1000; //임의의 값으로 지정. 배열 크기를 지정하는 칸에 넣을 값인데, 에러가 나지 않게 데이터의 일정량 이상의 크기를 잡아줬다.
                            // 예를 들면.. 값이 70개면 배열 크기는 100으로 지정 해준다던지?
    private int[] table = new int[size]; // 1000 크기의 table 배열을 생성

    public HashTable01() {

    }

    public HashTable01(int size) {
        this.size = size;
        this.table = new int[size];
    }

    public void insert(String key, Integer value) {
        int hashCode = hash(key); // hashCode = 입력된 key
        this.table[hashCode] = value; // key번의 배열에 값 대입
        System.out.println(key + " " + hashCode + "방에 저장 완료되업습니다.");

    }

    public int search(String key) {
        return this.table[hash(key)];
    } // key를 입력하면 table[key] = value 값이 나온다.

    public int hash(String key) {
        int ascii = 0;
        for (int i = 0; i < key.length(); i++) {
            ascii = +key.charAt(i);

        }
        return ascii % size; // size를 나눠주는 이유는?
    }

    public static void main(String[] args) {
        String[] names = new String[]{"DongyeonKang",
                "SubinKang", "KwanwunKo", "HyunseokKo", "KyoungdukKoo", "YeonjiGu", "SoyeonKown", "OhsukKwon", "GunwooKim", "KiheonKim", "NayeongKim", "DohyeonKim", "MinkyoungKim", "MinjiKim", "SanghoKim", "SolbaeKim", "YejinKim", "EungjunKim", "JaegeunKim", "JeonghyeonKim", "JunhoKim", "JisuKim", "kimjinah", "HaneulKim", "HeejungKim", "KimoonPark", "EunbinPark", "JeongHoonPark", "JeminPark", "TaegeunPark", "JiwonBae", "SeunggeunBaek", "JihwanByeon", "HeungseopByeon", "JeongHeeSeo", "TaegeonSeo", "SeeYunSeok", "SuyeonSeong", "SeyoelSon", "MinjiSong", "JinwooSong", "hyunboSim", "SominAhn", "JiyoungAhn", "ChangbumAn", "SoonminEom",
                "HyeongsangOh", "SuinWoo", "JuwanWoo", "InkyuYoon", "GahyunLee", "DaonLee", "DohyunLee", "SanghunLee", "SujinLee", "AjinLee", "YeonJae", "HyeonjuLee", "HakjunYim", "SeoyunJang", "SeohyeonJang", "JinseonJang", "SujinJeon", "SeunghwanJeon", "DaehwanJung", "JaeHyunJeung", "HeejunJeong", "GukhyeonCho", "MunjuJo", "YejiJo", "ChanminJu", "MinjunChoi", "SujeongChoi", "SeunghoChoi", "AyeongChoi", "GeonjooHan", "JinhyuckHeo", "MinwooHwang", "SieunHwang",
                "JunhaHwang"};

        HashTable01 ht = new HashTable01();
        Set<Integer> nameSet = new HashSet<>();
        // 위 줄을 풀면
        // HashSet<Integer> hashSet = HashSet<>();
        // Set<Integer> nameSer = hashSet;

        for (int i = 0; i < names.length; i++) { // name 배열 길이만큼 반복
            nameSet.add(ht.hash(names[i])); // nameSet에



        }

//        System.out.println("%s %s", names.length, nameSet.size());

        HashTable01 ht01 = new HashTable01(200);
        for (int i = 0; i < names.length; i++) {
            ht.insert(names[i], ht.hash(names[i]));
        }

        System.out.println(ht.search("DongyeongKang"));
        System.out.println(ht.search("JiyongAhn"));


    }
}
