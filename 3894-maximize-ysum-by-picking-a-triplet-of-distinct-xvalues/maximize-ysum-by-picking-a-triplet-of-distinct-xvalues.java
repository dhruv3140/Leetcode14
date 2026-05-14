class Solution {
    public int maxSumDistinctTriplet(int[] x, int[] y) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < x.length; i++) {
            map.put(x[i], Math.max(map.getOrDefault(x[i], 0), y[i]));
        }

        List<Integer> vals = new ArrayList<>(map.values());
        if (vals.size() < 3) return -1;

        vals.sort(Collections.reverseOrder());
        return vals.get(0) + vals.get(1) + vals.get(2);
    }
}