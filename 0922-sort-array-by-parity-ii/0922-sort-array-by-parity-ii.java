class Solution {
    public int[] sortArrayByParityII(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = 1;
        while (i < n && j < n) {
            if (arr[i] % 2 == 0) {
                i += 2;
            } else if (arr[j] % 2 != 0) {
                j += 2;
            } else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i += 2;
                j += 2;
            }

        }
        return arr;
    }

}