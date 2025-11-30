import java.util.*;

public class SimpleHuffman {

    static class Node {
        char ch;
        int freq;
        Node left, right;
        Node(char c, int f) { ch = c; freq = f; }
    }

    static void printCodes(Node root, String s) {
        if (root.left == null && root.right == null) {
            System.out.println(root.ch + " : " + s);
            return;
        }
        printCodes(root.left, s + "0");
        printCodes(root.right, s + "1");
    }

    public static void main(String[] args) {
        char chars[] = {'a', 'b', 'c', 'd'};
        int freq[] = {5, 9, 12, 13};

        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(x -> x.freq));

        for (int i = 0; i < chars.length; i++)
            pq.add(new Node(chars[i], freq[i]));

        while (pq.size() > 1) {
            Node x = pq.poll();
            Node y = pq.poll();
            Node parent = new Node('-', x.freq + y.freq);
            parent.left = x;
            parent.right = y;
            pq.add(parent);
        }

        printCodes(pq.peek(), "");
    }
}
