class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int max = 0;

        for (int num : set) {

            if (!set.contains(num - 1)) {

                int count = 1;
                int val = num;

                while (set.contains(val + 1)) {
                    count++;
                    val++;
                }

                max = Math.max(max, count);
            }
        }

        return max;
    }
}