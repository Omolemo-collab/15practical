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

        BuffererReader reader = new BuffererReader(new FileReader("ulysses.text"));
        String line; 
        while ((line = reader.readline()) != null){

           String[] words = line.split("\\s+");

            for (String word : words){
                String sig = signature(word);

                if(!groups.containsKey (sig)){
                    groups.put(sig, new ArrayList<String>());
                }

                groups.get(sig).add(word);
            }

            Bufferedwriter writer = new Bufferedwriter(new Filewriter("theAnagrams.text"))
            writer.write("anagrams in the text: \n");
            for (List<String> anagramGroup : groups.values()){
                if (anagramGroup.size() > 1){
                    writer.write(anagramGroup.toString() + "\n");
                }
            }
            writer.close();

            reader.close();

        }
    }
}