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

        System.out.println("Manual unit test of WordCounter");
        System.out.println("multiline.txt has 9 words");
        String text2 = TextReader.load("multiline.txt");
        int tally2 = 0;
        for (int i = 0; i < text2.length(); i++) {
            if (text2.charAt(i) == ' ') {
                tally2 ++;
            }else if (text2.charAt(i) == '\n') {
                tally2 ++;
            }
        }
        int numberOfWords2 = tally2 + 1;
        System.out.println("Actual number of words: " + numberOfWords2);
        System.out.println(text2);
    }
}
