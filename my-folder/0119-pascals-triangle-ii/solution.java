class Solution {
    public List<Integer> getRow(int rowIndex) {
       List<Integer> result=new ArrayList<>();
       int n=rowIndex+1;
    long val = 1;
       result.add((int)val);
       for(int i=1;i<n;i++){
        val = val * (n-i);
        val = val/i;
        result.add((int)val);
       }
       return result;
    
    } 
    
}
