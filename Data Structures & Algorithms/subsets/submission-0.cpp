class Solution {
public:
    vector<vector<int>> subsets(vector<int>& nums) {
        vector<vector<int>> ans;
        vector<int> sub;
        solve(nums,0,ans,sub);
        return ans;
    }

    void solve(vector<int>&nums,int i,vector<vector<int>>&ans,vector<int>&sub){
        if(i==nums.size()){
            ans.push_back(sub);
            return;

        }

        sub.push_back(nums[i]);
        solve(nums,i+1,ans,sub);
        sub.pop_back();
        solve(nums,i+1,ans,sub);

    }
};
