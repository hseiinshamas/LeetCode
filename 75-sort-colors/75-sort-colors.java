class Solution { // count sort

    public void sortColors(int[] arr) {
       int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        int tmp = 0;
        while (mid <= high) {
            switch (arr[mid]) {
                case 0: {
                    tmp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = tmp;
                    low++;
                    mid++;
                    break;
                }
                case 1:
                    mid++;
                    break;
                case 2: {
                    tmp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = tmp;
                    high--;
                    break;
                }
            }
        }
    }
}
        
