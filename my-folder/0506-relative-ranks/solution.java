class Solution {
    public String[] findRelativeRanks(int[] score) {
      
      Integer[] idx = new Integer[score.length];

      for(int i=0; i<score.length; i++){
        idx[i]=i;
      }
      Arrays.sort(idx, (a , b) -> Integer.compare(score[b],score[a]));

      String[] result = new String[score.length];
      for(int i=0; i<idx.length;i++){
        if(i==0){
            result[idx[i]]="Gold Medal";
        }else if(i == 1){
             result[idx[i]] = "Silver Medal";
        }else if(i == 2){
            result[idx[i]] = "Bronze Medal";
        }else{
            result[idx[i]] = ""+(i+1);
        }
      }
    
    return result;
    }
    
}
