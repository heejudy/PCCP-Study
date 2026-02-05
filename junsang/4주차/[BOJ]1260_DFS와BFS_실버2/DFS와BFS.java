import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ_1260 {
	static  boolean visited[];
	static ArrayList<Integer>A[];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int start = sc.nextInt();

		A = new ArrayList[N + 1]; // 배열의 인덱스는 0 부터 시작하지만 ArrayList는 1부터 시작하기 떄문에

		for (int i = 0; i < N+1; i++) {
			A[i] = new ArrayList<Integer>();
		}
		for (int i = 0; i < M; i++) {
			int S = sc.nextInt();
			int E = sc.nextInt();
			A[S].add(E);
			A[E].add(S); // 양방향이기 때문에 반대로도 해줘야 한다
		}
		for (int i = 1; i < N; i++) {
			// 여러게 방문 할 수 있으면 작은 노드 부터 방문하게 하기 위해서
			Collections.sort(A[i]);

			//노드에 붙어 있는 엣지를 오름차순으로 정렬
		}
		visited = new boolean[N + 1];
		DFS(start);
		System.out.println();

		visited = new boolean[N + 1]; // 방문배열 초기화
		BFS(start);
		System.out.println();
	}

	private static void BFS(int Node) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(Node);
		visited[Node] = true;

		while(!queue.isEmpty()){
			int now_Node = queue.poll();
			System.out.print(now_Node + " ");
			for(int i : A[now_Node]){
				if(!visited[i]){
					visited[i] = true;
					queue.add(i);
				}
			}
		}
	}

	private static void DFS(int Node) {
		System.out.print(Node + " ");
		visited[Node] = true;
		for(int i : A[Node]){
			if(!visited[i]){
				DFS(i);
			}
		}
	}
}
