//As a developer, you are given a project to find out the longest increasing subsequence.
package assistedProjects;
import java.util.Arrays;
public class Subsequence_31 {
public int lengthOfLIS(int[] nums) {
		    if(nums==null || nums.length==0)
		        return 0;
		 
		    int[] max = new int[nums.length];
		    Arrays.fill(max, 1);
		 
		    int result = 1;
		    for(int i=0; i<nums.length; i++){
		        for(int j=0; j<i; j++){
		            if(nums[i]>nums[j]){
		                max[i]= Math.max(max[i], max[j]+1);
		 
		            }
		        }
		        result = Math.max(max[i], result);
		    }
		 
		   return result;
		}

		public static void main(String[] args) {
			Subsequence_31 object = new Subsequence_31();
			int[] array = {1,4,3,2,};
			System.out.println(object.lengthOfLIS(array));
		}
}
