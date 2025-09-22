import java.util.*;

class NQueens {
    static int N;
    static int[] col;

    static boolean safe(int r, int c) {
        for (int i = 0; i < r; i++)
            if (col[i] == c || Math.abs(col[i] - c) == Math.abs(i - r)) return false;
        return true;
    }

    static void solve(int r) {
        if (r == N) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++)
                    System.out.print(col[i] == j ? "Q " : ". ");
                System.out.println();
            }
            System.out.println();
            return;
        }
        for (int c = 0; c < N; c++)
            if (safe(r, c)) { col[r] = c; solve(r + 1); }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        col = new int[N];
        solve(0);
    }
}
