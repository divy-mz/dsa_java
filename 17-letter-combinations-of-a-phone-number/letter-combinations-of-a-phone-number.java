class Solution {
    static void solve(String digits,String[] map,int index,String output,List<String> ans){
        if(index>=digits.length()){
            ans.add(output);
            return;
        }
        int val=digits.charAt(index)-'0';
        String mapped=map[val];
        for(int i=0;i<mapped.length();i++){
            solve(digits,map,index+1,output+mapped.charAt(i),ans);
            //output.remove(output.length()-1);
        }

    }
    public List<String> letterCombinations(String digits) {
        String[] map={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        int index=0;
        String output="";
        List<String> ans=new ArrayList<>();
        solve(digits,map,index,output,ans);
        return ans;
    
        
    }
}