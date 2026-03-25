class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        int i = 0;
        int n = nums.length;

        while(i < n){
            int j = nums[i] - 1;
            if(nums[i] != nums[j]){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            else{
                i++;
            }
        }

        List<Integer> result = new ArrayList<>();
        for(int in=0; in<n; in++){
            if(nums[in] != in+1){
                result.add(in+1);
            }
        }

        return result;
    }
}