import java.util.*;

/**
 * Example user story that tests for simple addition.  Keep in mind that
 * this class is far from ideal.  It relies heavily on HashMaps with magic
 * strings.  You may wish to represent similar structures as objects.
 */
public class US01 {
    
    /**
     * Look at the parsed GEDCOM (wherever it is) and see where the errors are.
     * This method represents your user story logic and is used in test files.
     */
    public Map<String, Integer> get_result(Map<String, Integer> data) {
        if(data.get("left") + data.get("right") != data.get("sum"))
            return data;
        return new HashMap<>();
    }

    /**
     * This method displays your user story logic to the user and is used in
     * your main file.
     */
    public void print_result(Map<String, Integer> input) {
        Map<String, Integer> output = get_result(input);
        System.out.println(String.format("ERROR US01: %d and %d do not sum to %d", output.get("left"), output.get("right"), output.get("sum")));
    }
}