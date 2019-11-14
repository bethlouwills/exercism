import java.util.*;

public class Scrabble {

    HashMap<List<String>, Integer> map = new HashMap<>();
    ArrayList<Integer> scoreList = new ArrayList<>();

    void populateMap(){
        List<String> valueOneList = Arrays.asList("A", "E", "I", "O", "U", "L", "N", "R", "S", "T");
        map.put(valueOneList, 1);
        List<String> valueTwoList = Arrays.asList("D", "G");
        map.put(valueTwoList, 2);
        List<String> valueThreeList = Arrays.asList("B", "C", "M", "P");
        map.put(valueThreeList, 3);
        List<String> valueFourList = Arrays.asList("F", "H", "V", "W", "Y" );
        map.put(valueFourList, 4);
        List<String> valueFiveList = Arrays.asList("K");
        map.put(valueFiveList, 5);
        List<String> valueEightList = Arrays.asList("J", "X");
        map.put(valueEightList, 8);
        List<String> valueTenList = Arrays.asList("Q", "Z");
        map.put(valueTenList, 10);
    }

    Scrabble(String word) {
        populateMap();
        for (int i = 0; i < word.length(); i++) {
            String letter = "" + word.charAt(i);
            populateMap();
            for (Map.Entry<List<String>, Integer> entry : map.entrySet()) {
                List<String> k = entry.getKey();
                Integer v = entry.getValue();
                List<String> list = k;
                for (String ch : list) {
                    if (ch.toUpperCase().matches(letter.toUpperCase())) {
                        scoreList.add(v);
                    }
                }
            }
        }
        getScore();
    }

     int getScore() {
         int sum = 0;
         for(int i = 0; i < scoreList.size(); i++)
             sum += scoreList.get(i);
         return sum;
     }

}




