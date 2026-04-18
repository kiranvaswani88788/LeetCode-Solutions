class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int[] temp=new int[n];

        int k=0;
        for(int i=0;i<n;i++){
            boolean isduplicate=false;
            for(int j=0;j<k;j++){
                if(nums[i]==temp[j])
                {
                    isduplicate=true;
                    break;
                }
            }
            if(!isduplicate){
                temp[k]=nums[i];
                k++;
            }
        }
        for(int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }
      return k;
    }
}
        
    

