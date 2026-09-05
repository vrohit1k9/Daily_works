class Solution {
public:
    bool hasDuplicate(vector<int>& nums) {
        int s=nums.size();
        int c=0;
        sort(nums.begin(),nums.end());
        for(int i=0;i<s;i++){
            for(int j=i+1;j<s;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
};