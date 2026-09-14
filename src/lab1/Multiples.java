package lab1;

public class Multiples {
    static void main() {
        int n = 1000;
        int a = 3;
        int b = 5;
        System.out.println(multiples(n, a, b));
    }

    static int multiples(int n, int a, int b) {
        int a_multi = n/a;
        if (a == b) {

            return a_multi;

        } else {

            int b_multi = n/b;
            int both_multi = n/(a*b);
            return a_multi + b_multi - both_multi - 1;

        }


    }


}
