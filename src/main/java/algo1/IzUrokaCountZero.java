package algo1;

import java.util.Arrays;

public class IzUrokaCountZero {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int l = 1;
        int r = 5;
        countZero(nums, l, r);
        countZ(makePrefixZ(nums), l, r);
    }

    public static void countZero(int[] nums, int l, int r) {
        int cnt = 0;
        for (int i = l; i < r; i++) {
            if (nums[i] == 0) {
                cnt += 1;
            }
        }
        System.out.println(cnt);
    }

    public static void countZ(int[] prefixZ, int l, int r) {
        System.out.println(prefixZ[r] - prefixZ[l]);
    }

    public static int[] makePrefixZ(int[] nums) {
        int[] prefixZ = new int[nums.length];
        Arrays.fill(prefixZ, 0);
        for (int i = 1; i < nums.length + 1; i++) {
            if (nums[i - 1] == 0) {
                prefixZ[i] = prefixZ[i - 1] + 1;
            } else {
                prefixZ[i] = prefixZ[i - 1];
            }
        }
        return prefixZ;
    }
}
