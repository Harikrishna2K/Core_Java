package striverPackage.Arrays;

public class ArrayQuestion4 {
	
	public static void main(String[] args) {
		
	}
	
	public boolean check(int[] nums) {
        int n = nums.length;
        int rotationalCount = 0;
      for(int i=0; i<n-1 ; i++){
            if(nums[i] <= nums[i+1]){
                rotationalCount = i+ 1;
                return true;
            }else if(nums[i]>nums[i+1]){
                return false;
            }
      }
      return false;
        
    }

}
