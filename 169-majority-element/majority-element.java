class Solution {
    public int majorityElement(int[] arr) {

        int candidate = arr[0];
        int vote = 1;
        int n = arr.length;

        for(int i=1; i<n; i++){
            if(vote == 0){
                candidate = arr[i];
                vote=1;
            }
            else if(arr[i] == candidate){
                vote++;
            }
            else{
                vote--;
            }
        }
        return candidate;
    }
}