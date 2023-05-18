class Solution {
    public int findNumbers(int[] nums) {
        return Countofeven(nums);
    }

    static int Countofeven(int[] arr) {
        int count =0;
        for(int i=0;i<arr.length;i++){
            if( even(arr[i])  ) count++;
        }
        return count;
    }

    static boolean even(int i) {
        int count=0;
        if(i<0){
            i = i* -1;
        }
        while(i>0){
            int temp = 0;
            i = (i/10);
            count++;
        }
        if(count %2 == 0) return true;
        return false;
    }
}