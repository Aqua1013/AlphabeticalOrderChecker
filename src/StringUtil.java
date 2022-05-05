import com.sun.istack.internal.NotNull;

public final class StringUtil extends String{

    /**
     * @param word
     * Returns true of string is in alphabetical order, if not returns false
     * Takes the input of a word or sentence and checks if it is in alphabetical order from start to finish.
     */
    
    private String string;

    public StringUtil(String string){
        this.string = string;
    }
    
    public String getString(){
       return string;
    }
    
    @Deprecated
    @NotNull
    public boolean isAlphabeticalOrder(){
        char[] word = string.toCharArray();
        for (char c : word) if (c < word[0] && c != ' ') return false;
        return true;
    }
    
    @Deprecated
    public boolean isAlphabeticalOrder(){
        char[] temp = string.toLowerCase().toCharArray();
        for(char c : temp)
            if (c < temp[0] && c != ' ') return false;
        return true;
    }
    
    public boolean isAlphabeticalOrder(){
        if(string.equals(null)) return false;
        String word = string.toLowerCase();
        char bound = word.charAt(0);
        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            if (c < bound && c != ' ') return false;
        }
        return true;
    }

}
