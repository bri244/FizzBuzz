package lab1;

public class Multiples {
    static void main() {
        int n = 1000;
        int a = 3;
        int b = 5;
        System.out.println(multiples(n, a, b));
        System.out.println(multiples());
    }

    static int multiples() {
        int three_multi = 999/3;
        int five_multi = 999/5;
        int both_multi = 999/15;
        return three_multi + five_multi - both_multi;
    }
    static int multiples(int n, int a, int b) {
        int a_multi = (n-1)/a;
        if (a == b) {

            return a_multi;

        } else {

            int b_multi = (n-1)/b;
            int both_multi = (n-1)/(a*b);
            return a_multi + b_multi - both_multi;

        }


    }


}
