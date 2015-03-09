/**
 * Created by jc243482 on 9/03/15.
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Manual unit test of WordCounter \n simple.txt");
        String text = TextReader.load("simple.txt");
        int numberOfWords = countWords(text);
        int numberOfLines = countLines(text);
        int numberOfMarks = countMarks(text);
        System.out.println("Actual number of words: " + numberOfWords + "\n" + "Actual number of lines: " + numberOfLines + "\n" + "Actual number of punctuation marks: " + numberOfMarks);

        System.out.println("Manual unit test of WordCounter \n multiline.txt ");
        text = TextReader.load("multiline.txt");
        numberOfWords = countWords(text);
        numberOfLines = countLines(text);
        numberOfMarks = countMarks(text);
        System.out.println("Actual number of words: " + numberOfWords + "\n" + "Actual number of lines: " + numberOfLines + "\n" + "Actual number of punctuation marks: " + numberOfMarks);
    }

    private static int countWords(String text) {
        int tallyWords = 0;
        for (int i = 0; i < text.length(); i++){
            if (text.charAt(i) == ' ' || text.charAt(i) == '\n') {
                tallyWords++;
            }else {

            }
        }return tallyWords + 1;


    }
    private static int countLines(String text) {
        int tallyLines = 0;
        for (int i = 0; i < text.length(); i++){
            if (text.charAt(i) == '\n'){
                tallyLines++;
            }else {

            }
        }return tallyLines + 1;
    }
    private static int countMarks(String text){
        int tallyMarks = 0;
        for (int i = 0; i < text.length(); i++){
            if (text.charAt(i) == '!' || text.charAt(i) == ':' || text.charAt(i) == ';' || text.charAt(i) == '?' || text.charAt(i) == '.' || text.charAt(i) == ','){
                tallyMarks++;
            }else{

            }
        }return tallyMarks;
    }
}
