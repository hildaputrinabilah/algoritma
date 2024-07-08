public class ReverseString {
    public static void main(String[] args) {
        String input = "NEGIE1";
        System.out.println(reverseAlphabetsKeepNumbers(input)); // Output: "EIGEN1"
    }

    public static String reverseAlphabetsKeepNumbers(String s) {
        StringBuilder alphabets = new StringBuilder();
        StringBuilder numbers = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                alphabets.append(c);
            } else if (Character.isDigit(c)) {
                numbers.append(c);
            }
        }

        alphabets.reverse();
        return alphabets.toString() + numbers.toString();
    }
}
