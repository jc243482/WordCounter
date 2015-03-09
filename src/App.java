/**
 * Created by jc243482 on 9/03/15.
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Manual unit test of WordCounter");
        System.out.println("simple.txt has 5 words");
        String text = TextReader.load("simple.txt");
        int tally = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                tally ++;
            }else {

            }
        }
        int numberOfWords = tally + 1;
        System.out.println("Actual number of words: " + numberOfWords);
        System.out.println(text);
    }
}
