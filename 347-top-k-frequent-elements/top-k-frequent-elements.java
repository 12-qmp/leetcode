class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int n: nums){
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        //{1: 3, 2: 2, 3: 1}

        List<Integer>[] bucket = new List[nums.length + 1];
        for(int key: map.keySet()){
            int frequency = map.get(key);
            if(bucket[frequency] == null){
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }
        //buckets[3] = [1], buckets[2] = [2], buckets[1] = [3]

        int[] result = new int[k];
        int counter = 0;
        for(int i = bucket.length-1; i>=0 && counter < k; i--){
            if(bucket[i] != null){
                for(int n: bucket[i]){
                    result[counter++] = n;
                    if(counter == k) break;
                }
            }
        }

        return result; 
    }
}




