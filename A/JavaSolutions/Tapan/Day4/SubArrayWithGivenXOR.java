public class SubArrayWithGivenXOR {
    public static void main(String[] args) {

    }

    // https://www.interviewbit.com/problems/subarray-with-given-xor/
    public int solve(int[] A, int B) {

        HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();
        int cnt = 0;
        int xorr = 0;

        int n = A.length;

        for (int i = 0; i < n; i++) {
            xorr = xorr ^ A[i];
            if (freq.containsKey(xorr ^ B)) {
                cnt += freq.get(xorr ^ B);
            }
            if (xorr == B) {
                cnt++;
            }
            if (!freq.containsKey(xorr)) {
                freq.put(xorr, 1);
            } else {
                freq.put(xorr, freq.get(xorr) + 1);
            }
        }
        return cnt;
    }

    // https://www.codingninjas.com/codestudio/problems/1115652

    public static int subarraysXor(ArrayList<Integer> arr, int x) {
        // Write your code here.

        int xor = 0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap();
        int n = arr.size();
        for (int i = 0; i < n; i++) {

            xor ^= arr.get(i);

            if (map.containsKey(xor ^ x)) {
                count += map.get(xor ^ x);
            }

            if (xor == x) {
                count++;
            }

            if (map.containsKey(xor)) {
                int freq = map.get(xor);
                map.put(xor, freq + 1);
            } else {
                map.put(xor, 1);
            }
        }
        return count;

    }
}
