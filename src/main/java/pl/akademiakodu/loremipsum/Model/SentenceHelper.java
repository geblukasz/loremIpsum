package pl.akademiakodu.loremipsum.Model;

public class SentenceHelper {
    private String lorem;

    public SentenceHelper(String lorem)
    {
        this.lorem = lorem;
    }

    public String getLorem()
    {
        return lorem;
    }

    public void setLorem(String lorem)
    {
        this.lorem = lorem;
    }

    public String stringOfSentences(int numberOfSentences)
    {
        String[] loremSplit=lorem.split("\\.");
        StringBuilder stringOfSentences = new StringBuilder();
        int temporaryInt=0;
        for(int i=1;i<=numberOfSentences;i++)
        {
            if(temporaryInt==4)
            {
                temporaryInt=0;
                stringOfSentences.append(" ");
            }
            stringOfSentences.append(loremSplit[temporaryInt]);
            stringOfSentences.append(".");

            temporaryInt++;
        }
        return stringOfSentences.toString();
    }
}
