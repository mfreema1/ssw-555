import org.junit.*;
import java.util.*;

/**
 * This is one way to write your tests.  It is not perfect by
 * any means, but it should give you an idea of how your program
 * should flow.
 */
public class US01Test {

    private US01 story = new US01();

    @BeforeClass
    public static void foo() {
        System.out.println("Bleep bloop, starting test suite...");
    }

    @Before
    public void bar() {
        System.out.println("Another one!");
    }

    @Test
    public void testSimpleAddition() {
        Map<String, Integer> parsedGedcom = new HashMap<String, Integer>(){{
            put("left", 2);
            put("right", 2);
            put("sum", 4);
        }};

        assert(story.get_result(parsedGedcom).isEmpty());
    } 

    @Test
    public void testWrongAddition() {
        Map<String, Integer> parsedGedcom = new HashMap<String, Integer>(){{
            put("left", 2);
            put("right", 2);
            put("sum", 5);
        }};

        Map<String, Integer> output = story.get_result(parsedGedcom);
        assert(output.get("left").equals(2));
        assert(output.get("right").equals(2));
        assert(output.get("sum").equals(5));
    }

    @AfterClass
    public static void baz() {
        System.out.println("Shutting down...");
    }

}