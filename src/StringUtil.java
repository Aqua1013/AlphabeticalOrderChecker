import com.sun.istack.internal.NotNull;

public final class StringUtil {

    /**
     * @param word
     * Returns true of string is in alphabetical order, if not returns false
     * Takes the input of a word or sentence and checks if it is in alphabetical order from start to finish.
     */

    @Deprecated
    @NotNull
    public static boolean isAlphabeticalOrder(char[] word){
        for (char c : word) if (c < word[0] && c != ' ') return false;
        return true;
    }
    
    @Deprecated
    public static boolean isAlphabeticalOrder(String word){
        char[] temp = word.toLowerCase().toCharArray();
        for(char c : temp)
            if (c < temp[0] && c != ' ') return false;
        return true;
    }
    
    public static boolean isAlphabeticalOrder(String word){
        if(word.equals(null)) return false;
        word = word.toLowerCase();
        char bound = word.charAt(0);
        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            if (c < bound && c != ' ') return false;
        }
        return true;
    }

}
