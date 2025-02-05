import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class KGoodness {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int[] a = new int[n];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }

            int[] maxSum = new int[n];
            int[] minSum = new int[n];

            // Precompute maximum and minimum subarray sums
            int maxSumCurrent = 0;
            int minSumCurrent = 0;
            for (int i = 0; i < n; i++) {
                maxSumCurrent = Math.max(0, maxSumCurrent + a[i]);
                maxSum[i] = maxSumCurrent;

                minSumCurrent = Math.min(0, minSumCurrent + a[i]);
                minSum[i] = minSumCurrent;
            }

            // Process queries
            for (int i = 0; i < m; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                int maxGoodness = Integer.MIN_VALUE;
                for (int j = 0; j <= k; j++) {
                    int maxSubarraySum = (j == 0) ? 0 : maxSum[j - 1];
                    int minSubarraySum = (j == 0) ? 0 : minSum[j - 1];

                    for (int p = j; p < n; p++) {
                        maxSubarraySum = Math.max(maxSubarraySum, maxSum[p] - maxSubarraySum);
                        minSubarraySum = Math.min(minSubarraySum, minSum[p] - minSubarraySum);

                        int goodness = x * maxSubarraySum - y * minSubarraySum;
                        maxGoodness = Math.max(maxGoodness, goodness);
                    }
                }
                System.out.print(maxGoodness + " ");
            }
            System.out.println();
        }
    }
}