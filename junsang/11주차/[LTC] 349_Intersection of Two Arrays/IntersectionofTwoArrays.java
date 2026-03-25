class Solution {
	public int[] intersection(int[] nums1, int[] nums2) {
		//  중복 제거를 위해한 Set
		Set<Integer> set1 = new HashSet<>();
		for (int num : nums1) {
			set1.add(num);
		}

		// 배열을 돌면서 set1에 있는 숫자만 따로 담는다.
		Set<Integer> intersectSet = new HashSet<>();
		for (int num : nums2) {
			if (set1.contains(num)) {
				intersectSet.add(num);
			}
		}

		// Set을 int[] 배열로 변환하여 반환
		int[] result = new int[intersectSet.size()];
		int index = 0;
		for (int num : intersectSet) {
			result[index++] = num;
		}

		return result;
	}
}