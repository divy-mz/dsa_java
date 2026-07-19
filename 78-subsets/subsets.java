class Solution {
    static void solve (int[] nums, int i,List<Integer> output,List<List<Integer>> ans){
        if(i>=nums.length){
            ans.add(new ArrayList<>(output));
            return ;
        }
        int val=nums[i];
        output.add(val);
        solve(nums,i+1,output,ans);
        output.remove(output.size()-1);
        while(i+1<nums.length && nums[i]==nums[i+1]){
            i++;
        }
        solve(nums,i+1,output,ans);
        
    }
    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        List<Integer> output=new ArrayList<>();
        List<List<Integer>> ans= new ArrayList<>();
        int i=0;
        solve(nums,i,output,ans);
        return ans;
        
    }
}