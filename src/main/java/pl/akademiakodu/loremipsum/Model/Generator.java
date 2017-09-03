package pl.akademiakodu.loremipsum.Model;

import pl.akademiakodu.loremipsum.LoremIpsum;

import java.util.Arrays;

public class Generator implements LoremIpsum{

    public Generator(){}



    public String lorem = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    @Override
    public String generateParagraphs(int number) {
        StringBuilder paragraphBuilder = new StringBuilder();
        for (int i = 0; i < number; i++) {
            paragraphBuilder.append(lorem);
        }
        return paragraphBuilder.toString();
    }

    @Override
    public String generateSentences(int number) {
        StringBuilder sentenceBuilder = new StringBuilder();
        int sentenceCounter = 0;
        while(sentenceCounter<number){
            sentenceBuilder.append(lorem.substring(0,lorem.indexOf(".")+2));
            sentenceCounter++;
        }
        return sentenceBuilder.toString();
    }

    @Override
    public String generateWords(int number) {
        StringBuilder builder = new StringBuilder();
        int chars = 0;
        for (int i=0; i<number; i++){
            builder.append(lorem.substring(0,lorem.indexOf(" ")+1)).toString();
        }
        return builder.toString();
    }
}
