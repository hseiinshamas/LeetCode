class Solution {
        public List<List<Integer>> fourSum(int[] nums, int target) {
            List<List<Integer>> result = new ArrayList();
        Arrays.sort(nums); // sort
        int n = nums.length;
        
        for (int i = 0; i < n-3; i++) { // first num
            if (i > 0 && nums[i-1] == nums[i]) // check for duplicates 
                continue;
            long tar3 = target - nums[i]; // subtract first number from target
            
            for (int j = i+1; j < n-2; j++) { // second number
                if (j > i+1 && nums[j] == nums[j-1]) // check for duplicates
                    continue;
                long tar2 = tar3 - nums[j]; // subtract second number from tar3 
                
                // two pointer search for tar2
                int l = j+1; // third number
                int r = n-1; // fourth number
                while (l < r) {
                    long sum = nums[l] + nums[r];
                    
                    if (sum == tar2) { 
                        // add all four numbers to result as a list
                        result.add(Arrays.asList(nums[i], nums[j], nums[l], nums[r]));
                        l++;
                        r--;
                        while (l < r && nums[l] == nums[l-1]) l++; // check for duplicates
                        while (l < r && nums[r] == nums[r+1]) r--; // check for duplicates
                    }
                    else if (sum < tar2) {
                        l++;
                    }
                    else {
                        r--;
                    }
                }
            }
        }
        return result;
        }
    }