class NumArray {
     int nums[] = new int[20];
    public NumArray(int[] nums) {
        
        this.nums = nums;
    }
    
    public int sumRange(int left, int right) {
      int sum = 0;
      while(left<=right){
        sum = sum + nums[left];
        left++;
      }
        return sum;
        
    }
    public static void main(String[] args){
   int nums[] = new int[10];
    NumArray obj = new NumArray(nums);
     int result =obj.sumRange(0,2);
     System.out.print(result);
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
