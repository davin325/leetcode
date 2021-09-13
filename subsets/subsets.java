class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        //조합
        //백트래킹
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> templist = new ArrayList<>();

        backtracking(result, templist, nums,0);
        
        return result;
    }

    private void backtracking(List<List<Integer>> result, List<Integer> templist, int[] nums,int loop) {
        result.add(new ArrayList<>(templist));
        for (int i = loop; i < nums.length; i++) {
            templist.add(nums[i]);
            backtracking(result, templist, nums,i+1);
            templist.remove(templist.size()-1);
        }
    }
}