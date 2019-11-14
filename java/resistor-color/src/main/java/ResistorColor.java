import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class ResistorColor {
    Map<String, Integer> rightHereMap = new HashMap<String, Integer>()
    {
        {
            put("black", 0);
            put("brown", 1);
            put("red", 2);
            put("orange", 3);
            put("yellow", 4);
            put("green", 5);
            put("blue", 6);
            put("violet", 7);
            put("grey", 8);
            put("white", 9);
        }
    };
    int colorCode(String color) {

        return rightHereMap.get(color);

    }

    String[] colors() {
        String[] list = new String[10];
        rightHereMap.forEach((k,v)-> {
            list[v] = k;
        });
        return list;
    }
}
