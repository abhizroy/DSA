class Solution {
    public int maxProduct(int[] nums) {
        
        int max = nums[0];

        int curmin = nums[0];
        int curmax = nums[0];
        for (int i = 1; i < nums.length; i++) {

            int num = nums[i];
            if (num<0) {
                int temp = curmax;
                curmax=curmin;
                curmin=temp;
            }

            curmax=Math.max(curmax*num, num);
            curmin=Math.min(curmin*num, num);

            if(curmax>max){
            max=curmax;
        }
        }
        

        return max;

    }
}