class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> mp = new HashMap<>();
        mp.put(0,1);
           int x=0;
           int ans=0;
        for(int i=0;i<nums.length;i++){
            x+=nums[i];
            int diff = x-k;
            ans+=mp.getOrDefault(diff,0);
            mp.put(x,mp.getOrDefault(x,0)+1);


        }
        return ans;
        
    }
}