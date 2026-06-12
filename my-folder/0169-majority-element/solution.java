class Solution {
    public int majorityElement(int[] nums) {
       int n = nums.length;
       int frequency = 0;
       int ans = 0;
       for(int i =0; i<n; i++){
        if(frequency == 0) {
            frequency = 1;
            ans = nums[i];
        }else if(nums[i] == ans) frequency++;
        else frequency--;
       }

        return ans;
    }
}
