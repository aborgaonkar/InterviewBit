package InterviewBit;

public class RemoveElementFromAnArray {
    public static void main(String[] args) {
        int[] nums = {4,1,1,2,3,1,6};
        int val = 1;
        int result = removeElementFromAnArray(nums,val);
        System.out.println("result = " + result);
    }

    private static int removeElementFromAnArray(int[] nums, int val) {
        int i = 0;
        for(int j = 0 ; j < nums.length; j++){
            if(nums[j] != val){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
