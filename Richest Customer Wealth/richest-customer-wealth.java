class Solution {
    public int maximumWealth(int[][] accounts) {
        return calculatemax(accounts);
    }
    static int calculatemax(int[][] arr){
        int max=0;
        for(int i=0;i<arr.length;i++){
            int max_temp = 0;
            for(int j=0;j<arr[i].length;j++){
                max_temp += arr[i][j];
            }
            if(max_temp > max){
                max = max_temp;
            }
        }
        return max;
    }
}