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

/*
n = 7
k = 3

a = [1, 2, 3, 4, 5, 6, 7]   # direct initialization
res = 0

print("Elimination order:")

while n > 1:
    res = (res + k - 1) % n      # next to die
    print("Person", a[res], "died")

    a.pop(res)                   # remove person
    n -= 1

print("Survivor =", a[0])
*/
