import java.util.Arrays;
import java.util.List;

public class Problem14
	{

		public static void main(String[] args)
			{
				String[] strs = {"reflower","flow","flight"};

				String solution = longestCommonPrefix(strs);
				
				System.out.println("Solution   " + solution);
			}

		private static String longestCommonPrefix(String[] strs)
			{
				String result = "";
				
			String compare;
				
			if (strs.length != 0)
				{
					int	shortestWordLenth = strs[0].length();
					int	shortestWordIndex = 0;
					boolean exit = false;
					
						 for (int i = 0; i < strs.length; i++)
							{
								if (shortestWordLenth > strs[i].length() )
									{
										shortestWordLenth = strs[i].length();
										shortestWordIndex = i;
									}
								
								
							}
						 System.out.println(strs[shortestWordIndex]);
						 
						 compare = strs[shortestWordIndex];
						 
						 while (compare.length() != 0 && exit == false)
							{
								
								for (int i = 0; i < strs.length; i++)
									{
										System.out.println(i);
										if (strs[i].indexOf(compare) != 0)
											{   
												System.out.println("Current word: " + strs[i] );
												System.out.println("Current word Calc: " + strs[i].indexOf(compare)  );
												compare = compare.substring(0, compare.length() - 1);
												i = -1;
											}
										if(i == strs.length - 1) {
										//	System.out.println("Compare:  " + compare);
											return compare;
										}
									//	System.out.println("Compare:  " + compare);
									}
								
								
								
								
								
								
								
							}
						 
						 
				}	
				 
		
				
				 
				 
				 
				 
				return result;
			}

	}
