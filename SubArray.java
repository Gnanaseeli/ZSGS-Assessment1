package assessment;
import java.util.Arrays;
public class SubArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 5};
        splitArray(arr);
    }
    public static void splitArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
//            System.out.println(sum);
        }
        if (sum % 2 != 0) {
         System.out.println("Cannot split array into sub arrays with equal sum.");
         }
        int target = sum / 2;
        int Start = 0;
        int End = 0;
        int init = 0;
        for (int i = 0; i < arr.length; i++) {
        	init += arr[i];
        	if (init == target) {
        		End = i;
        		System.out.println("Sub array: " + Arrays.toString(Arrays.copyOfRange(arr,Start, End + 1)));
        		Start = i + 1;
        		init = 0;
        		}
        	}
        }
}
