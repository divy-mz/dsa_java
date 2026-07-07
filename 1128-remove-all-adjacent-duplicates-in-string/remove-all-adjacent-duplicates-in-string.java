class Solution {
    public String removeDuplicates(String s) {
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ans.length() == 0 || ans.charAt(ans.length() - 1) != ch){
                ans.append(ch);
 }
            else{
                ans.deleteCharAt(ans.length() - 1);
     }
        }
        
        return ans.toString();
    }
}