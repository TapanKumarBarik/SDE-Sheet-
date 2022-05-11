public class Pow {
    public static void main(String[] args) {

    }
    // https://leetcode.com/problems/powx-n/

    public double myPow(double x, int n) {

        double myres = pow(x, n);
        return myres;
    }

    private double pow(double x, long n) {

        if (n == 0)
            return 1.0;
        if (n == 1)
            return x;
        if (n < 0) {
            return pow(1 / x, -n);
        }
        double res = pow(x * x, n / 2);
        if (n % 2 == 1) {
            return res * x;
        }
        return res;
    }

    // https://www.codingninjas.com/codestudio/problems/1082146

    public static int modularExponentiation(int x, int n, int m) {
        // Write your code here.
        if (n == 0)
            return 1;
        long res = modularExponentiation(x, n / 2, m);
        if (n % 2 == 0) {
            return (int) ((res * res) % m);
        } else {
            return (int) (((res * res) % m * x % m) % m);
        }
    }
}
