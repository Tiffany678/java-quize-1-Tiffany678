import java.lang.*;

public class StringUtilities {
    private StringUtilities u;
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {

        return input;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
    //return baseValue.concat(valueToBeAdded)
        return (baseValue+valueToBeAdded);
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
       //StringBuilder sb = new StringBuilder(valueToBeReversed);
        //sb.reverse();
        //return sb.toString();
        StringBuilder sb= new StringBuilder(valueToBeReversed);
        sb.reverse();
        return sb.toString();

    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {

        return word.charAt((word.length())/2);
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        return value.replace(charToRemove.toString(),"");
        //int idx = value.indexOf(charToRemove);
        //return value.substring(0,idx)+value.substring(idx+1,value.length());
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {

      // String result = sentence.substring((sentence.lastIndexOf(" ")+1));
       //return result;
        String[] sa = sentence.split(" ");
        return sa[sa.length-1];

        //return the first word ==> sa[0]
        //return the last word to the end ==> sa[sa.length-2];
    }
}
