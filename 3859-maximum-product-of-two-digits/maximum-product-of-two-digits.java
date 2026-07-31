class Solution {
    public int maxProduct(int n) {
         int max = 0;
        List<Integer> list = new ArrayList<>();

        while (n != 0) {
            int last = n % 10;
            list.add(last);
            n = n / 10;
        }

        int size = list.size();

        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                max = Math.max(max, list.get(i) * list.get(j));
    }
}
return max;
    }
}
    
