package epam.java_tasks;
import java.util.*;
import java.util.stream.IntStream;
interface Palindrome {
	void palindrome(ArrayList<String>a1);
}
public class Palindromeprg {

		public static List<String> filterStrings(List<String> inputList)
		{
			List<String> requiredList = new ArrayList<String>();
			for(int i = 0; i < inputList.size(); i++)
			{
				String tempString = (inputList.get(i)).replaceAll("\\s+", "").toLowerCase();
				 
				boolean check = IntStream.range(0, tempString.length() / 2)
		            .noneMatch(s -> tempString.charAt(s) != tempString.charAt(tempString.length() - s - 1));
				if (check)
					requiredList.add(inputList.get(i));
			}
			return requiredList;
		}
		public static void main(String args[])
		{
			try (Scanner sc = new Scanner(System.in)) 
			{
				System.out.println("Enter the size of the list : ");
				int n = sc.nextInt();
				List<String> inputList = new ArrayList<String>(n);
				System.out.println("Enter the elements to the list");
				for(int i = 0; i < n; i++)
					inputList.add(sc.next());
				System.out.println( " Palindromic Strings from the given list of strings are: " + filterStrings( inputList ) );
			}
	    }

	}