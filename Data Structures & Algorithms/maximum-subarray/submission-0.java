class Solution {
    public int maxSubArray(int[] nums) {

        int mx= Integer.MIN_VALUE;
        int k=0;
        for(int i=0;i<nums.length;i++){
            k+=nums[i];
            if(k<0){
                k=0;
            }
            mx= Math.max(mx,k);
        }
      int x=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            x=Math.max(x,nums[i]);
        }
        if(x<0)
        return x;
        return mx;
    }
}
