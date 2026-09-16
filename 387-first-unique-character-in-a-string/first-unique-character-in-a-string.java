class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch: s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        char ans='\0';
        for(char ch: s.toCharArray()){
            if(map.get(ch)==1){
                ans=ch;
                break;
            }
        }
        if(ans=='\0'){
            return -1;
        }
        return s.indexOf(ans);
    }
}