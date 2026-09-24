class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length <= 1)
        return intervals;
        // Array sort first 
        Arrays.sort(intervals,Comparator.comparingInt(i -> i[0]));
        List<int[]> result = new ArrayList<>();
        int newInterval[] =intervals[0];
        result.add(newInterval);
        for(int [] interval :intervals){
            if(interval[0] <= newInterval[1]){
                // overlapping 
                // merge into 
                newInterval[1]= Math.max(interval[1],newInterval[1]);
            }
            else{
                // Disjoint interval
                newInterval = interval;
                result.add(newInterval);
            }
        }
        return result.toArray(new int[result.size()] []);
    }
}