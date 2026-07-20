class Solution {
    static void solve(int[] candidates, int target,List<List<Integer>> ans,List<Integer> output, int i){
        if(target==0){
            ans.add(new ArrayList<>(output));
            return;
        }
        if(target<0){
            return;
        }
        if(i==candidates.length){
            return;
        }
        output.add(candidates[i]);
        solve(candidates,target-candidates[i],ans,output,i+1);
        output.remove(output.size()-1);
        while(i+1<candidates.length && candidates[i]==candidates[i+1]){
            i++;
        }
        solve(candidates,target,ans,output,i+1);

    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> output=new ArrayList<>();
        int i=0;
        solve(candidates,target,ans,output,i);
        return ans;

        
    }
}