
package pl.akademiakodu.loremipsum.Model;

import pl.akademiakodu.loremipsum.LoremIpsum;

public class LoremPL implements LoremIpsum {

    private String lorem = "Lorem Ipsum is simply dummy text of. the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.";
    private String sample;
    private String readySentence;
    private int counter;


    public String findSentence(int number, String stringIn) {
        StringBuilder builder = new StringBuilder();
        while(counter<number){
            builder.append(stringIn).append(" ");
            counter++;
        }
        return builder.toString();
    }

    @Override
    public String generateParagraphs(int number) {
        return lorem;
    }

    @Override
    public String generateSentences(int number) {
        StringBuilder builder = new StringBuilder();
        int sentenceCounter = 0;
        while(sentenceCounter<number){
            builder.append(lorem.substring(0,lorem.indexOf(".")+2));
            sentenceCounter++;
        }
        return builder.toString();
    }

    @Override
    public String generateWords(int number) {
        StringBuilder builder = new StringBuilder();
        String[] words = new String[number];
        for (int i = 0; i<number; i++){
            builder.append(lorem.substring(0,lorem.indexOf(" ")+1)).toString();

        }
        return words.toString();
    }

    public static void main(String[] args) {
        LoremPL loremPL = new LoremPL();
        System.out.println(loremPL.generateSentences(2));
        System.out.println(loremPL.generateParagraphs(1));
        System.out.println(loremPL.generateWords(3));
    }
}


