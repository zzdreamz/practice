package lc0704;

public class Solution {

    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        int mid = -1;
        while (l <= r) {
            mid = (l + r) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) l = ++mid;
            else r = --mid;
        }
        return -1;
    }
}
