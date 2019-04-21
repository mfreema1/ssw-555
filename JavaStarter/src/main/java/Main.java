import com.jakewharton.fliptables.FlipTableConverters;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        //use a linked hash map to preserve order
        Map<String, Integer> parsedGedcom = new LinkedHashMap<String, Integer>(){{
            put("left", 2);
            put("right", 2);
            put("sum", 5);
        }};

        US01 us01 = new US01();
        //print table
        String[] columns = parsedGedcom.keySet().toArray(new String[0]);
        Object[][] data = new Integer[][] { parsedGedcom.values().toArray(new Integer[0])};
        System.out.println(FlipTableConverters.fromObjects(columns, data));

        //print errors
        us01.print_result(parsedGedcom);
    }
}