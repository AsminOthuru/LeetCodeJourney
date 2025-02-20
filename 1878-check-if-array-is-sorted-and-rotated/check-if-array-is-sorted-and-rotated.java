class Solution {
    public boolean check(int[] nums) {
        if(nums.length==0 || nums.length==1){
            return true;
        }
     int i=1;
        
        while(i<=nums.length-1 && nums[i-1] <= nums[i]){

            i++;

        }
        int val=i;

        int start=i+1;
        for(int m=start;m<nums.length;m++){
            if(!(nums[m]>=nums[m-1])){

                return false;
            }


        }
        Stack<Integer> stack=new Stack<>();
        for(int j=val;j<nums.length;j++){

            int currVal =nums[j];
 
            for(int k=0;k<val;k++){
                stack.push(nums[k]);

            }

            for(int k=0;k<val;k++){
                if(currVal <= nums[k]){
                    stack.pop();
                }

            }
            if(!stack.isEmpty()){
                return false;
            }




        }
     
        return true;
        
    }
}