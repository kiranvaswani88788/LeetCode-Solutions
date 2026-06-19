class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
       
       int childPtr = 0;
       int parentPtr = 0;
       while(childPtr < g.length && parentPtr < s.length){
          if(g[childPtr] <= s[parentPtr]){
            childPtr++;
            parentPtr++;
          }else if(g[childPtr] > s[parentPtr]){
            parentPtr++;
          }

       }
       return childPtr;
    }
}
