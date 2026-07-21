class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        // Set<Integer> set = new HashSet<>();
        // int n = timeSeries.length;
        // for(int i=0;i<n;i++){
        //     for(int j=timeSeries[i]; j<timeSeries[i]+duration;j++){
        //         set.add(j);
        //     }
        // }
        // return set.size();
        Arrays.sort(timeSeries);
        int result = duration;
        for(int i = 1;i<timeSeries.length;i++){
            result += duration;
            if((timeSeries[i-1] + (duration - 1)) >= timeSeries[i]){
                result = result - (((timeSeries[i-1] + (duration - 1) )- timeSeries[i]) + 1);
            }
        }
        return result;
    }
}
