class Solution {
    static void solve(String digits,String[] map,int index,StringBuilder output,List<String> ans){
        if(index>=digits.length()){
            ans.add(output.toString());
            return;
        }
        int val=digits.charAt(index)-'0';
        String mapped=map[val];
        for(int i=0;i<mapped.length();i++){
            output.append(mapped.charAt(i));
            solve(digits,map,index+1,output,ans);
            output.deleteCharAt(output.length()-1);
        }

    }
    public List<String> letterCombinations(String digits) {
        String[] map={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        int index=0;
        StringBuilder output=new StringBuilder();
        List<String> ans=new ArrayList<>();
        solve(digits,map,index,output,ans);
        return ans;
    
        
    }
}