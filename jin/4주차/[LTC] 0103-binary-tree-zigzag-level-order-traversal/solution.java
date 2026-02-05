class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        // 1. BFS를 위한 큐 생성 (층별 노드 탐색용)
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        // 2. 지그재그 방향 제어 변수 (true: 왼쪽->오른쪽, false: 오른쪽->왼쪽)
        boolean leftToRight = true;

        while (!queue.isEmpty()) {
            // 3. 현재 층의 노드 개수를 미리 파악
            int size = queue.size();

            // 4. 현재 층의 값을 담을 리스트 (지그재그 삽입을 위해 LinkedList 사용)
            LinkedList<Integer> currentLevel = new LinkedList<>();

            for (int i = 0; i < size; i++) {
                TreeNode currentNode = queue.poll();

                // 5. 방향에 따라 리스트의 앞 혹은 뒤에 삽입
                if (leftToRight) {
                    currentLevel.addLast(currentNode.val);
                } else {
                    currentLevel.addFirst(currentNode.val);
                }

                // 6. 다음 층의 노드들을 큐에 추가
                if (currentNode.left != null) queue.add(currentNode.left);
                if (currentNode.right != null) queue.add(currentNode.right);
            }

            // 7. 한 층 분석이 끝나면 결과에 추가하고 방향 전환
            result.add(currentLevel);
            leftToRight = !leftToRight;
        }

        return result;
    }
}
