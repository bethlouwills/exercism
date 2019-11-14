import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class ResistorColorDuo {
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

    int value(String[] colors) {
        String count = "";
        for (int i=0; i < 2; i++){
            count = count + colorCode(colors[i]);
        }
     return Integer.parseInt(count);

    }

    String[] colors() {
        String[] list = new String[10];
        rightHereMap.forEach((k,v)-> {
            list[v] = k;
        });
        return list;
    }
}