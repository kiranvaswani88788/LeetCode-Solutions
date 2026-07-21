class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set= new HashSet<>();
        int halfCandies = (candyType.length)/2;
        for(int num:candyType){
            set.add(num);
        }
        int setSize = set.size();
        int result =Math.min(halfCandies,setSize);
        return result;

    }
}
