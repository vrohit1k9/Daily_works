class Solution {
    public int majorityElement(int[] nums) {
        int maxel=0;
        int maxfreq=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i])>maxfreq){
                maxfreq=map.get(nums[i]);
                maxel=nums[i];
            }
        }
        return maxel;
    }
}