class Solution {
    public int subarraySum(int[] nums, int k) {

        int curr_sum = 0;
        int count = 0;
        int n = nums.length;
        HashMap<Integer, Integer> prefix = new HashMap<>();
        for(int i=0; i<n; i++){
            
            curr_sum += nums[i];
            if(curr_sum == k){
                count++;
            }
            if(prefix.containsKey(curr_sum-k)){
                count = count + prefix.get(curr_sum-k);
            }
            prefix.put(curr_sum, prefix.getOrDefault(curr_sum, 0) + 1);

        }

        return count;

















        // int n = nums.length;
        // int count = 0;
        // for(int i=0; i<n; i++){
        //     int sum = 0;
        //     for(int j=i; j<n; j++){
        //         sum = sum + nums[j];
        //         if(sum == k){
        //             count++;
        //         }
        //     }
        // }
        // return count;
    }
}