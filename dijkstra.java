import java.util.*;

class Dijkstra {
    static final int V = 4;

    static void dijkstra(int[][] g, int src) {
        int[] dist = new int[V];
        boolean[] vis = new boolean[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        for (int count = 0; count < V - 1; count++) {
            int u = -1;
            for (int i = 0; i < V; i++)
                if (!vis[i] && (u == -1 || dist[i] < dist[u])) u = i;
            vis[u] = true;
            for (int v = 0; v < V; v++)
                if (g[u][v] != 0 && dist[u] + g[u][v] < dist[v])
                    dist[v] = dist[u] + g[u][v];
        }

        for (int i = 0; i < V; i++)
            System.out.println("Dist from " + src + " to " + i + " = " + dist[i]);
    }

    public static void main(String[] args) {
        int[][] g = {{0,5,9,0},{5,0,2,6},{9,2,0,3},{0,6,3,0}};
        dijkstra(g,0);
    }
}
