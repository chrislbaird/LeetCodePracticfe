import java.util.Stack;

/**
 * 
 */

/**
 * @author Chris
 *
 */
public class Problem20
	{

		/**
		 * @param args
		 */
		public static void main(String[] args)
			{
				String s = "([)]";
				boolean solution = false;
				
				solution = isValid(s);
				
				System.out.println("Solution: " + solution );
				
			}

		private static boolean isValid(String s)
			{
				 Stack<Character> stack = new Stack<Character>();
				    
				    for(char ch : s.toCharArray()){
				            if(ch == '(' || ch == '{' || ch == '['){
				                stack.push(ch);                
				            }
				            if(ch == ')'){
				                if(stack.size()<=0 || stack.peek() != '(')
				                    return false;
				                stack.pop();
				            }
				            if(ch == '}'){
				                if(stack.size()<=0 || stack.peek() != '{')
				                    return false;
				                stack.pop();
				            }
				            if(ch == ']'){
				                if(stack.size()<=0 || stack.peek() != '[')
				                    return false;
				                stack.pop();
				            }
				    }
				    return (stack.size() == 0);
			}

	}
