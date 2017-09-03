package pl.akademiakodu.loremipsum.Model;

public class WordsHelper {

    private String lorem;

    public WordsHelper(String lorem)
    {
        this.lorem = lorem;
    }

    public String stringOfWords(int numberOfWords)
    {
        String[] words= lorem.split("\\s+");
        StringBuilder stringOfWords = new StringBuilder();
        int temporaryInt=0;
        for(int i=0;i<=words.length-1;i++)
        {
            if(words[i].endsWith(",") || words[i].endsWith("."))
            {
                String temporary = words[i];
                words[i]=temporary.substring(0,temporary.length()-1);
            }
        }

        for(int i=1;i<=numberOfWords;i++)
        {
            if(temporaryInt==words.length)
            {
                temporaryInt=0;
            }
            stringOfWords.append(words[temporaryInt] + " ");
            temporaryInt++;
        }
        return stringOfWords.toString();
    }
}
