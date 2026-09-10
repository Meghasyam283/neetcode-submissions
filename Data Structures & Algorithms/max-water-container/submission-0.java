class Solution {
    public int maxArea(int[] arr) {
        int left = 0;
		int right = arr.length-1;
		int maxArea = Integer.MIN_VALUE;
		while(left < right) {
			int minHeight = Math.min(arr[left], arr[right]);	
			int distance = right - left;
			int area = minHeight * distance;
			maxArea = Math.max(area, maxArea);
			if(arr[left] == minHeight) {
				left++;
				}
			else {
				right--;
			}
		}
        return maxArea;
    }
}
