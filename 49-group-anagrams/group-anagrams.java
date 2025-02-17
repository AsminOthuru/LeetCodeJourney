class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> anagram=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String str=strs[i];
            char[] chars= str.toCharArray();
            Arrays.sort(chars);
            String key=new String(chars);
            if(!anagram.containsKey(key)){
                anagram.put(key,new ArrayList<>());
            }
                anagram.get(key).add(str);

        }
        return  new ArrayList<>(anagram.values());
        
    }
}