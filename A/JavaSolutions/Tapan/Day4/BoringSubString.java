import java.util.*;

public class BoringSubString {
    public static void main(String[] args) {
        System.out.println(solve("nmnn"));
    }

    private static int solve(String A) {

        ArrayList<Character> odd = new ArrayList();

        ArrayList<Character> even = new ArrayList();

        int n = A.length();
        for (int i = 0; i < n; i++) {
            int curr = A.charAt(i) - 'a';
            if (curr % 2 == 0) {
                odd.add(A.charAt(i));
            } else {
                even.add(A.charAt(i));
            }
        }
        Collections.sort(odd);
        Collections.sort(even);
        int m = odd.size();
        int k = even.size();
        int x = Math.abs(odd.get(m - 1) - even.get(0));
        if (x != 1) {
            return 1;
        }
        int y = Math.abs(even.get(k - 1) - odd.get(0));
        if (y != 1) {
            return 1;
        }
        return 0;
    }
}
