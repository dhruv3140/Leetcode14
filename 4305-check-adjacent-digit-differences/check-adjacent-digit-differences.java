class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        for(int i = 0; i<s.length()-1; i++){
            char ch = s.charAt(i);
            char ch2 = s.charAt(i+1);
            if(Math.abs(ch-'0'-(ch2-'0'))>2){
                return false;
            }
        }
        return true;
    }
}