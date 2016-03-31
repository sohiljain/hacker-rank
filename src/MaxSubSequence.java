import java.util.*;
class MaxSubSequence {

    public static void main(String[] args) {

        //We find the maximum zero sub-sequence in this given list
        List<Integer> list = Arrays.asList(new Integer[]{-3, 2, 0, -7, 1, 0, 7, 2, 2, -4});

        //Create a map and add first element as zero
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0,-1);

        // Initialize variables sum and maxLen to zero, anc create an array to store subSequence indices
        int sum = 0;
        int maxLen = 0;
        int []subSequence = new int[2];

        for (int i = 0; i < list.size(); i++) {

            sum += list.get(i);

            //Boundary check - If maxLen of zero sub-sequence is zero and the current element is zero, maxLen is 1.
            if (list.get(i) == 0 && maxLen == 0)
                maxLen = 1;

            Integer similar_index = map.get(sum);

            // If the map contains the sum, then update maxLen and subSequence
            if (similar_index != null) {
                maxLen = Math.max(maxLen, i - similar_index);
                subSequence = new int[]{similar_index + 1, i + 1};
            } else  // Else put this sum in map
                map.put(sum, i);
        }

        if(maxLen!=0) {
            System.out.print(list.subList(subSequence[0], subSequence[1]));
        } else {
            System.out.print("No zero sub-sequence in the list");
        }
    }
}
