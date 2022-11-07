package labExercise;

public class Palindrome2 {

	public static void main(String[] args) {

		String str = "Radar";
		str=str.toLowerCase();

		boolean flag = true;

		for (int left = 0, right = str.length() - 1; left < right; left++, right--) {

			System.out.println(str.charAt(left) + " " + str.charAt(right));
			
			if (str.charAt(left) != str.charAt(right)) {
				flag = false;
				break;
			}

		}

		if (flag) {
			System.out.println("Palindrome");
		} else {
			System.out.println("non palindrome");
		}

	}

}
