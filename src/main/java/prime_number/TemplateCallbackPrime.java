package prime_number;

public class TemplateCallbackPrime {
    boolean isPrime(int num) {

        // i < num
        // i < num / 2
        // i * i < num
        // Math.sqrt()를 사용할 수 있지만 연산이 많다는 단점
        // System.out.println(Math.sqrt(num)); == i * i
        for (int i = 2; i < num; i++) {
            if(num % i == 0) return false;
        }
        return true;
    }
}
