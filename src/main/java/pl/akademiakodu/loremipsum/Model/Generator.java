package pl.akademiakodu.loremipsum.Model;

import pl.akademiakodu.loremipsum.LoremIpsum;

public class Generator implements LoremIpsum{

    public final String lorem = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    @Override
    public String generateParagraphs(int number) {
        StringBuilder finallyString = new StringBuilder("");
        for (int i = 0; i < number; i++) {
            finallyString.append(lorem);
        }
        return finallyString.toString();
    }

    @Override
    public String generateSentences(int number) {
        SentenceHelper sentenceHelper = new SentenceHelper(lorem);
        return sentenceHelper.stringOfSentences(number);
    }

    @Override
    public String generateWords(int number) {
        WordsHelper wordsHelper = new WordsHelper(lorem);
        return wordsHelper.stringOfWords(number);
    }
}
