class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int i = 0;
        int j = n - 1;
        int maxWater = 0;
        while (i < j) {
            int width = j -i;
            int minHeight = Math.min(height[i], height[j]);

            int area = width * minHeight;

            maxWater = Math.max(maxWater, area);

            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }

        }
        return maxWater;
    }
}