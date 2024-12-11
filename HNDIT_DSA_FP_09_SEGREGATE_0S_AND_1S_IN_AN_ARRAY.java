package finalproject;
import java.util.Arrays;

public class HNDIT_DSA_FP_09_SEGREGATE_0S_AND_1S_IN_AN_ARRAY {

	public static void main(String[] args) {
		int [] arr = {0,1,0,1,1,0};
		segregateArray(arr);
		System.out.println("segregated array:"  + Arrays.toString(arr) );
		}
	static void segregateArray(int[]arr) {
		int left = 0, right = arr.length-1;
		while (right>left) {
			while(arr[left]== 0 && right>left ) {
				left++;
				
			}
			while(arr[right]== 1 && right>left) {
				right--;
			}
			if(right>left) {
				int temp= arr[left];
				arr[left] = arr[right];
				arr[right]= temp;
				left++;
				right--;
			}
		}
	}

}
