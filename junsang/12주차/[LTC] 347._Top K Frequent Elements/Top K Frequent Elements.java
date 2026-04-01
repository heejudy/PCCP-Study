class Solution {
	public int[] topKFrequent(int[] nums, int k) {

		Map<Integer, Integer> countMap = new HashMap<>();
		for (int n : nums) {
			countMap.put(n, countMap.getOrDefault(n, 0) + 1);
		}

		PriorityQueue<Integer> heap = new PriorityQueue<>(
				(n1, n2) -> countMap.get(n1) - countMap.get(n2)
		);

		for (int n : countMap.keySet()) {
			heap.add(n);
			if (heap.size() > k) heap.poll();
		}

		int[] topK = new int[k];
		for (int i = k - 1; i >= 0; i--) {
			topK[i] = heap.poll();
		}

		return topK;
	}
}