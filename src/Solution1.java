import java.util.*;

/**
 * Created by sohiljain.cs91 on 27-02-2016.
 */
public class Solution1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        for (int k = 0; k < testCases; k++) {
            int totalNodes = sc.nextInt();
            int edges = sc.nextInt();
            Solution1 g = new Solution1(totalNodes);
            for (int j = 0; j < edges; j++) {
                g.addEdge(sc.nextInt(), sc.nextInt());
            }
            int startnode = sc.nextInt();
            Map m = g.traverse(startnode,totalNodes);
            for (int i = 1; i <= totalNodes; i++) {
                if (m.containsKey(i))
                    System.out.print(m.get(i) + " ");
                else if (i == startnode)
                    continue;
                else
                    System.out.print(-1 + " ");
            }
            System.out.println();
        }
    }

    HashMap<Integer, LinkedList<Integer>> map = new HashMap<Integer, LinkedList<Integer>>();

    public Solution1(int n) {
        for (int i = 1; i <= n; i++) {
            map.put(i,new LinkedList<Integer>());
        }
    }

    void addEdge(int v, int w) {
        LinkedList<Integer> l = map.get(v);
        l.add(w);
        LinkedList<Integer> l1 = map.get(w);
        l1.add(v);
        map.put(v, l);
        map.put(w, l1);
    }

    Map traverse(int startNode, int n) {
        boolean visited[] = new boolean[n+1];
        Queue<Integer> q = new ArrayDeque<>();
        q.add(startNode);
        visited[startNode] = true;
        int distance = 0;
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        LinkedList lists = new LinkedList();
        lists.add(startNode);

        while (!q.isEmpty()) {
            int currentNode = q.poll();

            if(lists.contains(currentNode))
                distance+=6;

            LinkedList list = new LinkedList();
            for(int nextNode : map.get(currentNode)) {
                list.add(nextNode);

                if (!visited[nextNode]) {
                    visited[nextNode] = true;
                    q.add(nextNode);
                    m.put(nextNode, distance);
                }
            }
            list.removeFirst();
            lists.addAll(list);
        }

        return m;
    }
}
