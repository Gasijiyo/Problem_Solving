package practice.twostar;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.io.IOException;

public class 금고털이 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int total = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		PriorityQueue<Jewel> queue = new PriorityQueue<Jewel>();

		// int[][] jewelry = new int[N][2]; // jewelry[i][0] : 무게
		// jewelry[i][1] : 가격
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			// jewelry[i][0] = Integer.parseInt(st.nextToken());
			// jewelry[i][1] = Integer.parseInt(st.nextToken());
			int weight = Integer.parseInt(st.nextToken());
			int price = Integer.parseInt(st.nextToken());
			queue.offer(new Jewel(weight, price));
		}

		int result = 0;

		while (!queue.isEmpty()) {
			Jewel jewel = queue.poll();
			if (total < jewel.weight) {
				result = result + total * jewel.price;
				break;
			} else {
				result = result + jewel.weight * jewel.price;
				total = total - jewel.weight;
			}
		}

		System.out.print(result + "");
	}

	public static class Jewel implements Comparable<Jewel> {
		public int weight;
		public int price;

		public Jewel(int weight, int price) {
			this.weight = weight;
			this.price = price;
		}

		@Override
		public int compareTo(Jewel jewel) {
			return this.price < jewel.price ? 1 : -1;
		}
	}		
	
}
