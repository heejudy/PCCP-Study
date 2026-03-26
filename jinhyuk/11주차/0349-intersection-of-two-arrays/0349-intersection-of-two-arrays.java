class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> intersect = new HashSet<>();

        for (int i : nums1){
            set1.add(i);
        }

        for (int i : nums2) {
            if (set1.contains(i)) {
                intersect.add(i);
            }
        }

        int[] select = new int[intersect.size()];
        int index = 0;

        for (int i : intersect){
            select[index++] = i;
        }

        return select;


    }
    
}



