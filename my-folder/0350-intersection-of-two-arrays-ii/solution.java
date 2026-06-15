class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
       List<Integer> result = new ArrayList<>();
       int[] freq=new int[1001];
          for(int num : nums1)
            freq[num]++;
          
          for(int nums : nums2){
             if(freq[nums] > 0){
                result.add(nums);
                freq[nums]--;
               }  
           }

           int[] result1 = new int[result.size()];
           int index1 = 0;
           for(int nums : result ){
            result1[index1++] = nums;
           }

           return result1;
      
      
    }
}
