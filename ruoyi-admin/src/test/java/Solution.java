class Solution {
    public void moveZeroes(int[] nums) {
        //二分
        quickSort(nums,0,nums.length-1);
    }


    void quickSort(int[] arr, int l, int r){
        if(l >= r) return;

        int mid = arr[l+r >> 1];
        int i = l-1, j = r+1;

        while(i < j){
            while(arr[++i] < mid);
            while(arr[--j] > mid);

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        quickSort(arr, l, j);
        quickSort(arr,j+1, r);
    }


    public static void main(String[] args) {
        new Solution().moveZeroes(new int[]{0, 1, 0, 3, 12});
    }
}