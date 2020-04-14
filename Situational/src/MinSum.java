import java.util.Arrays;

public class MinSum {
 public static void main(String[] args) {
	 int[] arr = {-1,-3,2,-3,4};
	 Arrays.sort(arr);
	 int sum = 0;
	 for (int i = 0; i < arr.length-1; i++) {
		sum += Math.abs(arr[i]-arr[i+1]);
	}
	 System.out.println(sum);
}
}
