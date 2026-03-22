class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int minLenWindow = Integer.MAX_VALUE;
        int currsum = 0;

        int left = 0;
        int right = 0;

        while(right < nums.length){
            
            currsum = currsum + nums[right];
            right++;

            while(currsum >= target){

                int currentwindowsize = right - left;

                minLenWindow = Math.min(currentwindowsize, minLenWindow);

                currsum = currsum - nums[left];
                left++;
            }
        }

        return minLenWindow == Integer.MAX_VALUE ? 0 : minLenWindow;
    }
}