import com.sun.istack.internal.NotNull;

public final class Words {

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

    @NotNull
    public static boolean isAlphabeticalOrder(String word){
        char[] temp = word.toLowerCase().toCharArray();
        for (char c : temp) if (c < temp[0] && c != ' ') return false;
        return true;
    }

}
