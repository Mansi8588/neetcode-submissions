class Solution {
    public int majorityElement(int[] nums) {
        int x=1;
        int ans=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==ans){
                x++;

            }
            else{
                x--;
                if(x<=0){
                    ans=nums[i];
                }
            }
        }
        return ans;
    }
}