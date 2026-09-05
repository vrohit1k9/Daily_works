class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int n=prices.length;
        boolean flag=false;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int sub=prices[j]-prices[i];
                if(sub>max){
                    max=sub;
                    flag=true;
                }
            }
        }
        if(flag){
            return max;
        }
        else{
            return 0;
        }
    }
}
