class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] nums1 = new int[n];

        nums1[0] = 1;
        for (int i = 1; i < n; i++) {
            nums1[i] = nums1[i - 1] * nums[i - 1];
        }

        int postpo = 1;
        for (int i = n - 1; i >= 0; i--) {
            nums1[i] = nums1[i] * postpo;
            postpo = postpo * nums[i]; // Update suffix for the next left element
        }

        return nums1;
    }
}