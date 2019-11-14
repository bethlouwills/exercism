import java.util.*;

class RnaTranscription {
    Map<String, String> DNAMap = new HashMap<String, String>() {
        {
            put("G", "C");
            put("C", "G");
            put("T", "A");
            put("A", "U");
        }
    };
    
    String findPair(char letter){
        String string = "";
        string = string + letter;
        return DNAMap.get(string);
    }

    String transcribe(String dnaStrand) {
        String rnaStand = "";
        for (int i = 0; i < dnaStrand.length(); i++){
            String pair = findPair(dnaStrand.charAt(i));
            rnaStand = rnaStand + pair;
        }
        return rnaStand;
    }

}
