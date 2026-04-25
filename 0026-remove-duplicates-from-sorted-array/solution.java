import java.util.Scanner;

class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        Scanner sc= new Scanner(System.in);
        
        for(int j=1;j<nums.length;j++){
            if(nums[j]!=nums[i]){
                i++;
                nums[i]=nums[j];
                
            }

        }
        return i+1;
        
    }
}
