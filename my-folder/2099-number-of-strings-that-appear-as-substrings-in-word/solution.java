class Solution {
    public int numOfStrings(String[] patterns, String word) {
    
        int result = 0;
        
        for(String sub : patterns){
                if(word.contains(sub)){
                    result++;
                }
            
          
        }
        return result;

    }
}
