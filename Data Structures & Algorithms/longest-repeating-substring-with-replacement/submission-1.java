class Solution {
    public int characterReplacement(String s, int k) {
        // int maxlen=0;
        // int n=s.length();
        // for(int i=0;i<n;i++){
        //     int []hash =new int[26];
        //     int maxfreq=0;
        //     for(int j=i;j<n;j++){
        //         hash[s.charAt(j)-'A']++;
        //         maxfreq=Math.max(maxfreq,hash[s.charAt(j)-'A']);
        //         int changes=j-i+1-maxfreq;
        //         if(changes<=k){
        //             maxlen=Math.max(maxlen,j-i+1);
        //         }
        //         else{
        //             break;
        //         }
        //     } 
        // }
        // return maxlen;
        int maxfreq=0;
        int maxlen=0;
        int []hash=new int[26];
        int l=0;
        int r=0;
        while(r<s.length()){
            hash[s.charAt(r)-'A']++;
            maxfreq=Math.max(maxfreq,hash[s.charAt(r)-'A']);
            while((r-l+1)-maxfreq>k){
                hash[s.charAt(l)-'A']--;
                l++; 
            }
            if((r-l+1)-maxfreq<=k){
                maxlen=Math.max(maxlen,r-l+1);
            } 
            r++;
        }
        return maxlen;
    }

}
