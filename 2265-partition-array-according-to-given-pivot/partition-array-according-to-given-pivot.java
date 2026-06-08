class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i]>pivot){
                list.add(nums[i]);
            }else if (nums[i]<pivot){
                list1.add(nums[i]);
            }else{
                list2.add(nums[i]);
            }
        }
        int count = 0;
        int ans[] = new int[nums.length];
        for(int i =0; i<list1.size(); i++){
            ans[i] = list1.get(i);
            count++;
        }
        for(int i =0; i<list2.size(); i++){
            ans[count] = list2.get(i);
            count++;
        }
        for(int i =0; i<list.size(); i++){
            ans[count] = list.get(i);
            count++;
        }
        return ans;
    }
}