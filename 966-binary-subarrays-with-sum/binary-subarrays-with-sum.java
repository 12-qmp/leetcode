class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        
        int curr_sum = 0;
        int count = 0;
        int n = nums.length;
        HashMap<Integer, Integer> prefix = new HashMap<>();

        for(int i=0; i<n; i++){
            curr_sum += nums[i];
            if(curr_sum == goal){
                count++;
            }
            if(prefix.containsKey(curr_sum-goal)){
                count = count + prefix.get(curr_sum - goal);
            }

            prefix.put(curr_sum, prefix.getOrDefault(curr_sum, 0)+1);
        }

        return count;
    }
}