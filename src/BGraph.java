import java.util.*;

/**
 * Created by sohiljain.cs91 on 27-02-2016.
 */
public class BGraph {
    public static void main(String[] args) {
    /*    Map<Integer, LinkedList<Integer>> map = new HashMap<Integer, LinkedList<Integer>>();
        for (int[] list : lists) {
            Integer key = list[0];
            LinkedList<Integer> value = map.get(key);
            if (value == null) {
                value = new LinkedList<Integer>();
                value.add(0);
            }
            value.add(list[1]);
            map.put(key, value);
        }
        List keySet = map.keySet().stream().collect(Collectors.toList());
        Map map1 = traverse(map, 1, keySet);
//      Traverse a node and mark it as visited
//      Check what other nodes can be reached
//      update distance of the corresponding nodes

        map1.forEach((k, v) -> {
            System.out.println(k + " " + v);
        });
    }
    */
        int startnode = 1;
        int totalNodes = 4;
        BGraph g = new BGraph(totalNodes);
        g.addEdge(1,2);
        g.addEdge(1,3);
        Map m = g.traverse(startnode);
        for (int i = 1; i <= totalNodes; i++) {
            if(m.containsKey(i))
                System.out.print(m.get(i) + " ");
            else if(i==startnode)
                continue;
            else
                System.out.println(-1 + " ");
        }
        System.out.println("hello");
    }

    HashMap<Integer, LinkedList<Integer>> map = new HashMap<Integer, LinkedList<Integer>>();

    public BGraph(int n) {
        for (int i = 1; i <= n; i++) {
            map.put(i,new LinkedList<Integer>());
        }
    }

    void addEdge(int v, int w) {
        LinkedList<Integer> l = map.get(v);
        l.add(w);
        map.put(v, l);
    }

    Map traverse(int startNode) {

        Queue<Integer> q = new ArrayDeque<>();
        q.add(startNode);
        int distance = 0;
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();

        while (!q.isEmpty()) {
            distance += 6;
            int currentNode = q.poll();
            System.out.println(currentNode);

            for(int nextNode : map.get(currentNode)) {
                q.add(nextNode);
                m.put(nextNode, distance);
            }
        }

        return m;
    }

/*

    private static Map traverse(Map<Integer, LinkedList<Integer>> map, Integer k, List<Integer> keySet) {
//        Map<Integer, Integer> m = new HashMap<>();
        keySet.remove(k);
        LinkedList<Integer> l1 = map.get(k);
//        m.put(k,l1.removeFirst());
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (Integer key : l1) {
            if(key == l1.get(0)) continue;
            arrayList.add(key);
            if(map.containsKey(key)) {
                LinkedList<Integer> value = map.get(key);
                int temp = value.removeFirst();
                value.addFirst(6+temp);
                map.replace(key,value);
            } else {
                LinkedList<Integer> value = new LinkedList<>();
                value.add(6);
                map.put(key,value);
            }
        }
        for (Integer i: arrayList)
            traverse(map, i, keySet);

        for (Integer key : keySet) {
            keySet.remove(key);
            traverse(map,key,keySet);
        }

        return map;
    }

*/
}
