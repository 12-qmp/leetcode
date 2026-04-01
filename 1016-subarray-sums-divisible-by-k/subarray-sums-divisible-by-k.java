class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        
        int curr_sum = 0;
        int count = 0;
        int n = nums.length;
        HashMap<Integer, Integer> prefix = new HashMap<>();
        prefix.put(0,1);
        for(int i=0; i<n; i++){

            curr_sum += nums[i];
            int rem = curr_sum % k;
            if(rem < 0){
                rem += k;
            }
            if(prefix.containsKey(rem)){
                count = count + prefix.get(rem);
            }
            prefix.put(rem, prefix.getOrDefault(rem, 0) + 1);
        }

        return count;
    }
}