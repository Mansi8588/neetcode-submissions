class Solution {
public:

   
    int subsetXORSum(vector<int>& nums) {
     return solve(nums,0,0);
       
    }

    int solve(vector<int>& nums,int i,int total){
        if(i==nums.size()) return total;

        return solve(nums,i+1,total^nums[i])+solve(nums,i+1,total);

    }

  
};