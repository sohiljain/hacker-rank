import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by sohiljain.cs91 on 27-02-2016.
 */
public class BFS_attempt {
    public static void main(String[] args) {

        ArrayList<int[]> lists = new ArrayList<>();
        lists.add(new int[]{4, 2});
        lists.add(new int[]{1, 2});
        lists.add(new int[]{1, 3});

        Map<Integer, LinkedList<Integer>> map = new HashMap<Integer, LinkedList<Integer>>();
        for (int[] list : lists) {
            Integer key = list[0];
            LinkedList<Integer> value = map.get(key);
            if(value==null) {
                value = new LinkedList<Integer>();
                value.add(0);
            }
            value.add(list[1]);
            map.put(key,value);
        }
        List keySet = map.keySet().stream().collect(Collectors.toList());
        Map map1 = traverse(map,1,keySet);
//      Traverse a node and mark it as visited
//      Check what other nodes can be reached
//      update distance of the corresponding nodes

        map1.forEach((k,v)->{System.out.println(k+" "+v);});



    }

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


}
