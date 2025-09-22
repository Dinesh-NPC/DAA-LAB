class NaiveMatch {
    static void search(String txt, String pat) {
        int n=txt.length(), m=pat.length();
        for(int i=0;i<=n-m;i++) {
            int j=0;
            while(j<m && txt.charAt(i+j)==pat.charAt(j)) j++;
            if(j==m) System.out.println("Found at "+i);
        }
    }

    public static void main(String[] args) {
        search("AABAACAADAABAABA","AABA");
    }
}
