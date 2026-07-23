class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
       
         int n = nums.length;
         int[] Visibility = new int[n+1];
          for(int i = 0; i<n;i++){
            Visibility[nums[i]] = 1;
          }

          for(int i = 1; i<=n; i++){
            if(Visibility[i] == 0){
                list.add(i);
            }
          }
           
        return list;
    }
}
