class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int i = 0, j = cost.length-1;
        while(i<=j){
            int temp = cost[i];
            cost[i] = cost[j];
            cost[j] = temp;
            i++;
            j--;
        }
        int sum = 0;
        for(int a = 0; a<cost.length; a++){
            sum+=cost[a];
        }
        for(int a = 2; a<cost.length; a+=3){
            sum-=cost[a];
        }
        return sum;
    }
}