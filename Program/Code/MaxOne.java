public class MaxOne {
    public static int maxOnes(int Mat[][], int N, int M) {
        int maxm = 0;
        int ind = -1;
        int count = 0;
        for (int j = 0; j < N; j++) {
            count = 0;
            for (int i = 0; i < M; i++) {
                if (Mat[j][i] == 1) count++;
            }
            if (maxm < count) {
                maxm = count;
                ind = j;
            }
        }
        return ind;
    }

    public static void main(String[] args) {
        int N = 4, M = 5;
        int[][] Mat = {
                {0, 1, 1, 1, 0},
                {1, 1, 1, 1, 0},
                {0, 0, 0, 0, 0},
                {1, 1, 1, 0, 0}
        };

        System.out.println("Row with maximum number of 1s: " + maxOnes(Mat, N, M)); // Output: 1
    }
}
