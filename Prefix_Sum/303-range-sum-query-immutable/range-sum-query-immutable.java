class NumArray {
List<Integer> list = new ArrayList<>();
    public NumArray(int[] nums) {
        
        list.add(nums[0]);
        for(int i = 1;i<nums.length;i++){
            list.add(list.get(i-1)+nums[i]);
        }

    }
    
    public int sumRange(int left, int right) {
        if(left==0) return list.get(right);
    return list.get(right)-list.get(left-1);
}
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */