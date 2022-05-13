public class MajorityElement2 {
    public static void main(String[] args) {

    }
    // https://leetcode.com/problems/majority-element-ii/

    public List<Integer> majorityElement(int[] nums) {

        int vote1 = 0;
        int vote2 = 0;
        int num1 = 0;
        int num2 = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (num1 == nums[i]) {
                vote1++;
            } else if (num2 == nums[i]) {
                vote2++;
            } else if (vote1 == 0) {
                num1 = nums[i];
                vote1++;

            } else if (vote2 == 0) {
                num2 = nums[i];
                vote2++;
            } else {
                vote1--;
                vote2--;
            }
        }
        List<Integer> res = new ArrayList();
        int vote11 = 0;
        int vote22 = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == num1) {
                vote11++;
            } else if (nums[i] == num2) {
                vote22++;
            }
        }
        if (vote11 > n / 3) {
            res.add(num1);
        }
        if (vote22 > n / 3) {
            res.add(num2);
        }
        return res;
    }

    // https://www.codingninjas.com/codestudio/problems/893027
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) {
        // Write your code here.

        int n = arr.size();
        int vote1 = 0;
        int num1 = 0;
        int vote2 = 0;
        int num2 = 0;

        for (int i = 0; i < n; i++) {

            if (num1 == arr.get(i)) {
                vote1++;
            } else if (num2 == arr.get(i)) {
                vote2++;
            } else if (vote1 == 0) {
                num1 = arr.get(i);
                vote1++;
            } else if (vote2 == 0) {
                num2 = arr.get(i);
                vote2++;
            } else {
                vote1--;
                vote2--;
            }

        }

        //
        ArrayList<Integer> list = new ArrayList();

        int count1 = 0;
        int count2 = 0;

        for (int i : arr) {
            if (i == num1) {
                count1++;
            } else if (i == num2) {
                count2++;
            }
        }

        if (count1 > n / 3) {
            list.add(num1);
        }
        if (count2 > n / 3) {
            list.add(num2);
        }

        return list;
    }
}
