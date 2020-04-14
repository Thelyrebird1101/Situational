
public class MaxSubArray {
	public static void main(String[] args) {
		int[] arr = {15, 2, 4, 8, 9, 5, 10, 23};
		int curr_sum =arr[0];
		int targetSum = 23;
		int start = 0;
		for(int i=1;i<=arr.length;i++) {
			while(curr_sum>targetSum && start< i-1) {
				 	curr_sum-=arr[start];
				 	start++;
			}
		
		if(curr_sum == targetSum) {
			System.out.println("Target sum found in between "+ start + " and " + (i-1));
			break;
			} 
		else if(i<arr.length) {
			curr_sum = curr_sum + arr[i];
			
			}
		
		else
			System.out.println("No such subarray");
		}
		
	}
}
