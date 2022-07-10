class Solution {

    public int[][] flipAndInvertImage(int[][] image) {
         for(int i=0; i<image.length; i++){
            int start = 0;
            int end = image[i].length - 1;
            while(start <= end){
                int temp = image[i][start];
                image[i][start] = image[i][end];
                image[i][end] = temp;
                start++;
                end--;
            }
            start = 0;
            while(start <= image[i].length-1){
                if(image[i][start] == 0){
                    image[i][start] = 1;
                }
                else{
                    image[i][start] = 0;
                }
                start++;
            }
        }
        return image;
    }
}
