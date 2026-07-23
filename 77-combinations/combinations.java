class Solution {
    static void solve(int n,int k,List<List<Integer>> ans,List<Integer> output,int index){
        if(output.size()==k){
            ans.add(new ArrayList<>(output));
            return;
        }
        if(index>n){
            return;
        }
        output.add(index);
        solve(n,k,ans,output,index+1);
        output.remove(output.size()-1);
        solve(n,k,ans,output,index+1);


    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> output=new ArrayList<>();
        int index=1;
        solve(n,k,ans,output,index);
        return ans;
        
    }
}