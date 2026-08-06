class Solution {
    public int trap(int[] height) {

     int n=height.length;
     if(n==0) return 0;
       int[] leftmost = new int[n];
       int[] rightmost= new int[n];
    
       leftmost[0]=height[0];
       rightmost[n-1]=height[n-1];
       for(int i=1;i<n;i++){
          leftmost[i]=Math.max(leftmost[i-1],height[i]);
          rightmost[n-1-i]=Math.max(rightmost[n-i],height[n-1-i]);
       }
     int ans=0;
       for(int i=0;i<n;i++){
  ans+= Math.min(rightmost[i],leftmost[i])-height[i];
       }
       return ans;


    }
}
