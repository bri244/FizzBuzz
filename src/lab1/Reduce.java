package lab1;

public class Reduce {
    static void main() {
        int n = 100;
        int i = reduce(n);
        System.out.println(i);

    }

    static int reduce(int n) {
        int i = 0;
        while (n > 0) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n -= 1;
            }
            i += 1;
        }
        return i;
    }
}
