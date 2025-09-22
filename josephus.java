class Josephus {
    static int josephus(int n, int k) {
        int res=0;
        for(int i=1;i<=n;i++) res=(res+k)%i;
        return res;
    }

    public static void main(String[] args) {
        int n=7,k=3;
        System.out.println("Survivor = "+(josephus(n,k)+1));
    }
}
