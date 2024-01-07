import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mpp = new HashMap<>();
        for(int i = 0 ; i < nums.length; i++){
            int a = nums[i];
            int b = target - a;
            if(mpp.containsKey(b)){
                return new int[]{mpp.get(b) , i};
            }
            mpp.put(a , i);
        }
        return new int[] {-1, -1};
    }
}
public class Array1_TwoSum{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution solution = new Solution();
        System.out.print("Enter array size : ");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter array elements : ");
        for (int i = 0 ; i < n ; i++){
            nums[i] = scanner.nextInt();
        }
        System.out.print("Enter target value : ");
        int target = scanner.nextInt();

        int[] result = new int[2];
        result = solution.twoSum(nums ,target);
        for(int i = 0 ; i < 2 ; i++){
            System.out.print(result[i] + " ");
        }
    }
}
