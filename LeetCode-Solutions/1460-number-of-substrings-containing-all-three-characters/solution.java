class Solution {
    public int numberOfSubstrings(String s) {
       int[] visibility = {-1,-1,-1};
         
       int count =0;
        
         for(int j = 0; j<s.length(); j++){
            visibility[s.charAt(j) - 'a'] = j;
          
           if(visibility[0]!=-1 && visibility[1]!=-1  && visibility[2]!=-1){
            int smallest = Math.min(visibility[0], Math.min(visibility[1], visibility[2]));
             count = count + (1 + smallest);
           }
         
       }
       return count;
    }

}
