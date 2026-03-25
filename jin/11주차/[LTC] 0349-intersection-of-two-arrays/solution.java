class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> res = new HashSet<Integer>();
        for(int n : nums1){
            for(int m : nums2){
                if (n == m) res.add(m);
            }
        }
        int[] arr = res.stream()
                        .mapToInt(Integer::intValue)
                        .toArray();
        return arr;
    }
}
