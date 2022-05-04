import com.sun.istack.internal.NotNull;

public final class StringUtil extends String{

    /**
     * @param word
     * Returns true of string is in alphabetical order, if not returns false
     * Takes the input of a word or sentence and checks if it is in alphabetical order from start to finish.
     */

    public StringUtil(String string){
        super(string);
    }    
    
    public void setString(String string){
        this = string;
    }
    
    public String getString(){
       return this;
    }
    
    @Deprecated
    @NotNull
    public boolean isAlphabeticalOrder(){
        String word = this;
        for (char c : word) if (c < word[0] && c != ' ') return false;
        return true;
    }
    
    @Deprecated
    public boolean isAlphabeticalOrder(){
        char[] temp = this.toLowerCase().toCharArray();
        for(char c : temp)
            if (c < temp[0] && c != ' ') return false;
        return true;
    }
    
    public boolean isAlphabeticalOrder(){
        if(this.equals(null)) return false;
        String word = this.toLowerCase();
        char bound = word.charAt(0);
        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            if (c < bound && c != ' ') return false;
        }
        return true;
    }

}
