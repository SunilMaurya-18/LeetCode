class Solution {
    public int[] sortEvenOdd(int[] arr) {
        int n = arr.length;
        int[] even = new int[(n + 1) / 2];
        int[] odd = new int[n / 2];
        for (int i = 0; i < n; i += 2) {
            even[i / 2] = arr[i];
        }
        for (int i = 1; i < n; i += 2) {
            odd[i / 2] = arr[i];
        }
        Arrays.sort(even);
        Arrays.sort(odd);
        int left = 0;
        int right = odd.length - 1;
        while (left < right) {
            int temp = odd[left];
            odd[left] = odd[right];
            odd[right] = temp;
            left++;
            right--;
        }
        for (int i = 0; i < n; i += 2) {
            arr[i] = even[i / 2];
        }
        for (int i = 1; i < n; i += 2) {
            arr[i] = odd[i / 2];

        }
        return arr;
    }
}