class Solution {
    static void solve(int[] candidates, int target, List<List<Integer>> ans,List<Integer> output,int i){
        if(i==candidates.length){
            return;
        }
        if(target<0){
            return;
        }
        if(target==0){
            ans.add(new ArrayList(output));
            return;
        }
        int value=candidates[i];
        output.add(value);
        solve(candidates,target-value,ans,output,i);//include 
        output.remove(output.size()-1); // backTracking
        solve(candidates,target,ans,output,i+1);//excude

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
         List<List<Integer>> ans= new ArrayList<>();
         List<Integer> output=new ArrayList<>();
         int i=0;
         solve(candidates,target,ans,output,i);
         return ans;

    }
}