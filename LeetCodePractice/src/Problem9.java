/**
 * 
 */

/**
 * @author Chris
 *
 */
public class Problem9
	{

		/**
		 * @param args
		 */
		public static void main(String[] args)
			{
				int x = 121;
				
				boolean solution = isPalindrome(x);
				System.out.println(solution);
			}

		private static boolean isPalindrome(int x)
			{
				int tempx = x;
				int reversedNumber = 0;
				int tempInt = 0;
				boolean result = false;
				
				if (x < 0)
					{
						return false;
					}
				
				
				while(tempx != 0) {
				    
				  
				       tempInt = tempx % 10;
                       reversedNumber = reversedNumber * 10 + tempInt;
				       tempx = tempx / 10;
				      
				    }
				
				if (x == reversedNumber)
					{
						result = true;
					}
				
				
				
				
				return result;
			}

	}
