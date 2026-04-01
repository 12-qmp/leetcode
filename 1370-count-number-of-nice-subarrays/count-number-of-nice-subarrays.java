class Solution {
    public int numberOfSubarrays(int[] nums, int k) {

        int curr_sum = 0;
        int count = 0;
        int n = nums.length;
        HashMap<Integer, Integer> prefix = new HashMap<>();
        for(int i=0; i<n; i++){
            if(nums[i]%2 != 0){
                nums[i] = 1;
            }
            else nums[i] = 0;
            
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

    }
}






// int n = nums.length;
        // int count = 0;
        // int odd_count = 0;

        // for(int i=0; i<n; i++){
        //     odd_count = 0;
        //     for(int j=i; j<n; j++){
        //         if(nums[j]%2 != 0){
        //             odd_count++;
        //         }
        //         if(odd_count == k){
        //             count++;
        //         }
        //     }
        // }
        // return count;