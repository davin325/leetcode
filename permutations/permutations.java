class Solution {
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        // 백트래킹으로 완전탐색
        backtracking(result,temp,nums);

        //System.out.println(result);
        return result;
    }

    private void backtracking(List<List<Integer>> result, List<Integer> temp, int[] nums) {

        if(temp.size() == nums.length) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for(int i=0; i<nums.length;i++) {
            if(temp.contains(nums[i])) {
                continue;
            }
            temp.add(nums[i]);
            backtracking(result,temp,nums);
            temp.remove(temp.size()-1);
        }

    }
}