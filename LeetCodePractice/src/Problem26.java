/**
 * 
 */

/**
 * @author Chris
 *
 */
public class Problem26
	{

		/**
		 * @param args
		 */
		public static void main(String[] args)
			{
				int[] nums =
					{ 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };

				int solution = removeDuplicates(nums);
				System.out.println("                                     ");
				System.out.println("solution  " + solution);

			}

		private static int removeDuplicates(int[] nums)
			{
				if (nums.length == 0)
					{
						return 0;
					}

				int result = 0;
				int lastDuplicate = 0;
				int lowestNumber = nums[0];

				for (int i = 0; i < nums.length; i++)
					{
						if (nums[i] == lowestNumber)
							{
								System.out.println("boop");
							} else if (nums[i] > lowestNumber)
							{
								nums[lastDuplicate + 1] = nums[i];
								lastDuplicate++;
								lowestNumber = nums[i];
							}
					}
				for (int i = 0; i < nums.length; i++)
					{
						System.out.print("  " + nums[i] + "  ");
					}
				return lastDuplicate + 1;

			}

	}
