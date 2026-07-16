package methodrefference;
interface DigitCount {
    int count(int n);
}

class NumberUtil {

    public static int digitCount(int n) {
        return String.valueOf(n).length();
    }
}

public class DigitCountMethodReference {

    public static void main(String[] args) {

        DigitCount d = NumberUtil::digitCount;

        System.out.println("Digits = " + d.count(123456));
    }
}