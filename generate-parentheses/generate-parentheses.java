class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        String temp = "";
        backtracking(result,temp, 0, 0, n);
        return result;

    }

    private void backtracking(List<String> result, String temp,int open, int close, int n) {
        if(temp.length() == n*2) {
            result.add(temp);
            return;
        }

        if(open < n) {
            backtracking(result, temp+"(", open+1, close, n);
        }

        if(close<open) {
            backtracking(result,temp+")",open,close+1,n);
        }

    }
}