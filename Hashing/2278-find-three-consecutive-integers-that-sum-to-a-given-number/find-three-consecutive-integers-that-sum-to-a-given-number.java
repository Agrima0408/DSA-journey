class Solution {
    public long[] sumOfThree(long num) {
        if (num % 3 != 0) {
            return new long[0];
        }

        HashSet<Long> set = new HashSet<>();
        long x = num/3;

        set.add(x-1);
        set.add(x);
        set.add(x+1);

        long[] result = new long[3];
        int i=0;
        for(long val : set){
            result[i++] = val;
        }
        Arrays.sort(result);
        return result;
    }
}