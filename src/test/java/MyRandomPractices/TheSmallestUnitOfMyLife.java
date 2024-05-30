package MyRandomPractices;

public class TheSmallestUnitOfMyLife {

	public static void main(String[] args) {
		String input = "thesmallestunitofmylife";
        String output = formatString(input);
        System.out.println(output);
    }

    public static String formatString(String input) {
        StringBuilder formattedString = new StringBuilder();
        char[] chars = input.toCharArray();
        
        formattedString.append(Character.toUpperCase(chars[0])); // Capitalize the first letter
        
        for (int i = 1; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i])) {
                formattedString.append(' ').append(chars[i]);
            } else if (Character.isLowerCase(chars[i]) && (i == 0 || Character.isUpperCase(chars[i - 1]))) {
                formattedString.append(chars[i]);
            } else if (Character.isLowerCase(chars[i])) {
                if (Character.isLowerCase(chars[i - 1])) {
                    formattedString.append(chars[i]);
                } else {
                    formattedString.append(' ').append(Character.toUpperCase(chars[i]));
                }
            }
        }

        return formattedString.toString();
	}
}
