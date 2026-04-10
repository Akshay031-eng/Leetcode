/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
 class Pair {
    int level;
    int val;

    Pair(int level, int val) {
        this.level = level;
        this.val = val;
    }
}

class Solution {

    public List<List<Integer>> verticalTraversal(TreeNode root) {

        // hd -> list of pairs (level, value)
        TreeMap<Integer, List<Pair>> map = new TreeMap<>();

        helper(root, map, 0, 0);

        List<List<Integer>> result = new ArrayList<>();

        for (int key : map.keySet()) {

            List<Pair> list = map.get(key);

            // sort by level first, then value
            Collections.sort(list, (a, b) -> {
                if (a.level == b.level) {
                    return a.val - b.val;
                }
                return a.level - b.level;
            });

            List<Integer> temp = new ArrayList<>();
            for (Pair p : list) {
                temp.add(p.val);
            }

            result.add(temp);
        }

        return result;
    }

    public void helper(TreeNode root, TreeMap<Integer, List<Pair>> map, int level, int hd) {

        if (root == null) return;

        map.putIfAbsent(hd, new ArrayList<>());
        map.get(hd).add(new Pair(level, root.val));

        // left -> hd - 1
        helper(root.left, map, level + 1, hd - 1);

        // right -> hd + 1
        helper(root.right, map, level + 1, hd + 1);
    }
}