package utiles;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @Test
    void testLevenshteinDistanceCaseInsensitive() {
        assertEquals(0, StringUtils.levenshteinDistance("hello", "hello"));
        assertEquals(1, StringUtils.levenshteinDistance("kitten", "sitten"));
        assertEquals(3, StringUtils.levenshteinDistance("sunday", "saturday"));
    }

    @Test
    void testLevenshteinDistanceWithNullParameters() {
        assertEquals(-1, StringUtils.levenshteinDistance(null, "test"));
        assertEquals(-1, StringUtils.levenshteinDistance("test", null));
        assertEquals(-1, StringUtils.levenshteinDistance(null, null));
    }
}
