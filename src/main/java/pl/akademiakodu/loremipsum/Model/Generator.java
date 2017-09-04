package pl.akademiakodu.loremipsum.Model;

import pl.akademiakodu.loremipsum.LoremIpsum;


public class Generator implements LoremIpsum {

    public Generator() {
    }


    public String lorem = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam vel sollicitudin dui. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Suspendisse ullamcorper, arcu quis laoreet aliquam, tortor diam egestas ante, non posuere tellus est eu nibh. Nunc suscipit est porttitor tortor congue, ac ornare elit scelerisque. Mauris lobortis, justo efficitur interdum rutrum, velit nulla tincidunt mauris, in accumsan ex nibh et magna. Ut faucibus hendrerit sagittis. Vestibulum hendrerit nunc ac metus venenatis, id pellentesque eros faucibus. Sed lobortis, dolor at fringilla convallis, erat neque tincidunt libero, vitae finibus libero mauris in arcu. Praesent at lobortis ex, ut finibus arcu. Curabitur mi tellus, sollicitudin nec justo ut, dictum blandit quam. Vivamus tempus porta faucibus. Nullam in ex tincidunt, ullamcorper ex at, imperdiet orci. Nulla efficitur neque ut auctor molestie.";

    public String cutByChar(int number, char charHelper) {
        int wordCounter = 0;
        int charCounter = 0;
        for (int i = 0; i < lorem.length() - 1; i++) {
            if (lorem.charAt(i) == charHelper) {
                wordCounter++;
            }
            if (wordCounter == number) {
                break;
            }
            charCounter++;
        }
        return lorem.substring(0, charCounter) + charHelper;
    }

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
        String sentence = cutByChar(number, '.');
        return sentence;
    }

    @Override
    public String generateWords(int number) {
        String words = cutByChar(number, ' ');
        return words;
    }

}
