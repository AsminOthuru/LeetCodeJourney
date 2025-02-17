class Solution {
    public int minAddToMakeValid(String s) {
        int count=0;
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stack.push(s.charAt(i));
            }else if(s.charAt(i)==')' && !stack.isEmpty() && stack.peek()=='('){
                stack.pop();
            }else{
                count++;
            }

        }
        while(!stack.isEmpty()){
            stack.pop();
            count++;
        }

        return count;
       
    }
}