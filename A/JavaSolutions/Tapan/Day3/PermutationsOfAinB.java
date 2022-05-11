public class PermutationsOfAinB {
    public static void main(String[] args) {
        String A = "p";
        String B = "pccdpeeooadeocdoacddapacaecb";
        System.out.println(solve(A, B));
    }

    public static int solve(String A, String B) {

        int n = A.length();
        int m = B.length();

        if (n > m)
            return 0;

        int[] arra = new int[27];

        int[] arrb = new int[27];

        for (int i = 0; i < n; i++) {

            arra[A.charAt(i) - 'a']++;
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            arrb[B.charAt(i) - 'a']++;
        }

        if (check(arra, arrb)) {
            count++;
        }
        int index = 0;
        for (int i = n; i < m; i++) {
            arrb[B.charAt(index) - 'a']--;
            index++;
            arrb[B.charAt(i) - 'a']++;
            if (check(arra, arrb)) {
                count++;
            }
        }

        return count;
    }

    private static boolean check(int[] arra, int[] arrb) {

        for (int i = 0; i < 27; i++) {

            if (arra[i] != arrb[i]) {
                return false;
            }

        }
        return true;
    }
}
