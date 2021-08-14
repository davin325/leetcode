class Solution {
    public List<Integer> partitionLabels(String s) {
        
        int[] lastIndexs = new int[26];
        List<Integer> list = new ArrayList<>();

        // 각 알파벳의 마지막 인덱스를 담는다.
        for (int i = 0; i < s.length(); i++) {
            lastIndexs[s.charAt(i) - 'a'] = i;
        }

        int start = 0;
        int end = 0;
        
        for (int i = 0; i < s.length(); i++) {
            end = Math.max(end, lastIndexs[s.charAt(i) - 'a']);
            if (i == end) {
                list.add(end - start + 1);
                start = end + 1;
            }
        }

        return list;
    }
}