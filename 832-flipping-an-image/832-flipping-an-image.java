class Solution {

    public int[][] flipAndInvertImage(int[][] image) {
        int columns = image[0].length;
        for (int[] row : image) for (int i = 0; i < (columns + 1) / 2; ++i) {
            int tmp = row[i] ^ 1;
            row[i] = row[columns - 1 - i] ^ 1;
            row[columns - 1 - i] = tmp;
        }

        return image;
    }
}
