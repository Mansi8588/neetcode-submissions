class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int x=Integer.MAX_VALUE;
        int i=0,j=0;
        int sum=0;
        while(j<nums.length){
          sum+=nums[j++];
          if(sum>=target){

            while(sum>=target){
                sum-=nums[i];
                i++;
                x=Math.min(j-i+1,x);
            }
          }
        }
        return x==Integer.MAX_VALUE?0:x;
    }
}