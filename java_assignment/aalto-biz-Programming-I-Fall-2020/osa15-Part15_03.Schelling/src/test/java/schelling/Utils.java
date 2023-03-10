package schelling;


import static org.junit.Assert.*;
import fi.helsinki.cs.tmc.edutestutils.ReflectionUtils;

public class Utils {

    public static Class getClass(String name) {
        try {
            return ReflectionUtils.findClass(name);
        } catch (AssertionError e) {
            fail("Make sure you have made the class " + name + "?");
            return null;
        }
    }
}
