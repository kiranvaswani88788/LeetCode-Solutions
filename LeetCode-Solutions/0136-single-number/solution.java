class Solution {
    public int singleNumber(int[] nums) {
   int XoR=0;
   for(int i=0; i<nums.length; i++){
    XoR=XoR^nums[i];
     }
     return XoR;
}
}
