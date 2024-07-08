import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class QueryCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Masukkan kata-kata pada INPUT (pisahkan dengan spasi):");
        String inputLine = scanner.nextLine();
        String[] input = inputLine.split(" ");

        
        System.out.println("Masukkan kata-kata pada QUERY (pisahkan dengan spasi):");
        String queryLine = scanner.nextLine();
        String[] query = queryLine.split(" ");

        
        int[] result = countQueries(input, query);

        
        System.out.println("Hasil:");
        for (int count : result) {
            System.out.print(count + " "); // Output hasilnya
        }
    }

    public static int[] countQueries(String[] input, String[] query) {
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : input) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        int[] result = new int[query.length];
        for (int i = 0; i < query.length; i++) {
            result[i] = wordCount.getOrDefault(query[i], 0);
        }

        return result;
    }
}
