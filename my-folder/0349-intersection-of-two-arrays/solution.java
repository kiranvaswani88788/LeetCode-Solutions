import java.util.Arrays;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
     Set<Integer> result = new HashSet<>();
      int temp1 = 0;
      for(int i=0; i<nums1.length; i++){
        int temp = nums1[i];
        for(int j=0; j<nums2.length; j++){
            if(temp == nums2[j]){
                result.add(temp); 
            }
        }
      }
      int[] resultArray = new int[result.size()];
int i = 0;
for (int num : result) {
    resultArray[i++] = num;
}
return resultArray;
        
    }
}
