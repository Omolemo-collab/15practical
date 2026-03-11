//start anagrams project
import java.util.Arrays;

pubilc class anagrams {
    // create signature method to return a string with the characters in sorted order
    public static String signature(String s){
        char [] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars); 
    }
    public static void main(String[] args) throws Exception {

    }
}