class Solution {

    public int[][] merge(int[][] intervals) {
        if(intervals == null || intervals.length == 0){
            return new int[0][];
        }
		// seperate start and end 
        int[] start = new int[intervals.length];
        int[] end = new int[intervals.length];
        List<int[]> res = new LinkedList<>();
        for(int i = 0; i < intervals.length; i++){
            start[i] = intervals[i][0];
            end[i] = intervals[i][1];
        }
		
		// sort start[] end[] respectively
        Arrays.sort(start);
        Arrays.sort(end);
		
        int j = 0; // start time
        for(int i = 0; i < intervals.length - 1; i++) { // iterate end time
            if(start[i + 1] > end[i]) { // when collapse appears
                res.add(new int[] {start[j], end[i]}); // record
                j = i + 1; // move previous start time 
            }    
        }
        res.add(new int[] {start[j], end[intervals.length - 1]}); // add last one
        return res.toArray(new int[res.size()][]);
    }
}
