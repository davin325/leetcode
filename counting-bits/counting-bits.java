class Solution {
    public int[] countBits(int n) {
        // O(n) 시간복잡도. 
        // bottom up방식 DP를 사용
        int[] result = new int[n + 1];
        result[0] = 0; // DP에 사용될 초기값

        for (int i = 1; i < result.length; i++) {
            if (i % 2 == 0) {
                result[i] = result[i / 2];
            } else {
                result[i] = result[i / 2] + 1;
            }
        }
        return result;
    }
}