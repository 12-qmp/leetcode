class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        int i=0;
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

        ArrayList<Integer> list = new ArrayList<>();
        for(int in=0; in<n; in++){
            if(nums[in] != in + 1){
                list.add(nums[in]);
            }
        }

        return list;
    }
}