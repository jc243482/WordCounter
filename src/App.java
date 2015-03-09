/**
 * Created by jc243482 on 9/03/15.
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Manual unit test of WordCounter \n simple.txt has 5 words");
        String text = TextReader.load("simple.txt");
        int numberOfWords = countWords(text);
        System.out.println("Actual number of words: " + numberOfWords);
        System.out.println(text);

        System.out.println("Manual unit test of WordCounter \n multiline.txt has 9 words");
        text = TextReader.load("multiline.txt");
        numberOfWords = countWords(text);
        System.out.println("Actual number of words: " + numberOfWords);
        System.out.println(text);
    }

    private static int countWords(String text) {
        int tally = 0;
        for (int i = 0; i < text.length(); i++){
            if (text.charAt(i) == ' ' || text.charAt(i) == '\n') {
                tally++;
            }
        }
        return tally + 1;
    }
}
