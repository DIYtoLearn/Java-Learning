package Arrays;

import java.io.*;
import java.util.*;

public class Distinct_elements {
    static int distinct(int[][] M, int N) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < N; i++) {
            Set<Integer> seenInRow = new HashSet<>();
            for (int j = 0; j < N; j++) {
                seenInRow.add(M[i][j]);
            }
            for (int num : seenInRow) {
                freq.put(num, freq.getOrDefault(num, 0) + 1);
            }
        }

        int ans = 0;
        for (int v : freq.values()) if (v == N) ans++;
        return ans;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int[][] M = new int[N][N];
        int count = 0;
        while (count < N * N) {
            String line = br.readLine();
            if (line == null) break;
            st = new StringTokenizer(line);
            while (st.hasMoreTokens() && count < N * N) {
                int val = Integer.parseInt(st.nextToken());
                M[count / N][count % N] = val;
                count++;
            }
        }
        System.out.println(distinct(M, N));
    }
}

