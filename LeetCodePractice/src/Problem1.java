import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Arrays;

/**
 * 
 */

/**
 * @author Chris
 *
 */
public class Problem1
	{

		/**
		 * @param args
		 */
		public static void main(String[] args)
			{
				int target = 6;
				int[] nums = {3,2,4}; 
				
				
				int[] solution = twoSum(nums,target);
				for (int i = 0; i < solution.length; i++)
					{
						System.out.println(solution[i]);
					}
			}

		private static int[] twoSum(int[] nums, int target)
			{
				
				int[] tempSolution = new int[2];
				
		 for (int i = 0; i < nums.length ; i++)
			{
				int tempNumber = target - nums[i];
				
				for (int j = 0; j < nums.length; j++)
					{
						if (nums[j] == tempNumber)
							{
								tempSolution[0] = i;
								tempSolution[1] = j;
								break;
							}
					}
			}
				
				
				
				return tempSolution;
			}

	}
