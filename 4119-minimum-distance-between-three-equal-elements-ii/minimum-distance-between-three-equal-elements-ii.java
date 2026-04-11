import java.util.*;

class Solution {
    public int minimumDistance(int[] nums) {

        HashMap<Integer, List<Integer>> map = new HashMap<>();

        // Store indices
        for (int i = 0; i < nums.length; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        int minDist = Integer.MAX_VALUE;
        boolean found = false;

        // Traverse map
        for (List<Integer> list : map.values()) {

            if (list.size() < 3) continue;

            for (int i = 0; i <= list.size() - 3; i++) {

                int first = list.get(i);
                int third = list.get(i + 2);

                int dist = 2 * (third - first);

                minDist = Math.min(minDist, dist);
                found = true;
            }
        }

        return found ? minDist : -1;
    }
}