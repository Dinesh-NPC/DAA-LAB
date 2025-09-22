import java.util.*;

class Prim {
    static final int V = 4;

    static void prim(int[][] g) {
        int[] key = new int[V];
        int[] parent = new int[V];
        boolean[] mst = new boolean[V];
        Arrays.fill(key, Integer.MAX_VALUE);
        key[0] = 0; parent[0] = -1;

        for (int count = 0; count < V-1; count++) {
            int u = -1;
            for (int i=0;i<V;i++) if(!mst[i] && (u==-1||key[i]<key[u])) u=i;
            mst[u]=true;
            for (int v=0;v<V;v++)
                if (g[u][v]!=0 && !mst[v] && g[u][v]<key[v]) {
                    key[v]=g[u][v]; parent[v]=u;
                }
        }

        for (int i=1;i<V;i++)
            System.out.println(parent[i]+" - "+i+" = "+g[i][parent[i]]);
    }

    public static void main(String[] args) {
        int[][] g={{0,5,8,0},{5,0,10,15},{8,10,0,20},{0,15,20,0}};
        prim(g);
    }
}
