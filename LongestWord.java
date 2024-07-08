public class LongestWord {
    public static void main(String[] args) {
        String sentence = "Saya sangat senang mengerjakan soal algoritma";
        String result = findLongestWord(sentence);
        System.out.println(result);
    }

    public static String findLongestWord(String sentence) {
        String[] words = sentence.split(" ");
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord + ": " + longestWord.length() + " karakter";
    }
}
