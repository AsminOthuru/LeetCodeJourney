class Solution {
    public int longestBeautifulSubstring(String word) {

        int maxLength=0;
        int length=1;
        int count=1;
        for(int i=1;i<word.length();i++){
            if(word.charAt(i)>=word.charAt(i-1)){
                length++;
                if(word.charAt(i)>word.charAt(i-1)){
                    count++;
                    
                }if(count==5){
                    maxLength=Math.max(maxLength,length);
                }
            }else{

                length=1;
                count=1;

            }


        }
        return maxLength;
    }
}