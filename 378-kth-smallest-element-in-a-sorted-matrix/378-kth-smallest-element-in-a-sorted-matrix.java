class Solution {
    public int kthSmallest(int[][] matrix, int k) {
       PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0 ; i<matrix.length; i++){
            for(int j = 0 ; j < matrix[i].length; j++){
                maxHeap.add(matrix[i][j]);

                if(maxHeap.size() > k)
                    maxHeap.remove();
            }
        }
        return maxHeap.remove();
    }
}