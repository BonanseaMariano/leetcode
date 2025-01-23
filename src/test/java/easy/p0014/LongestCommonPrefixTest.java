package easy.p0014;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class LongestCommonPrefixTest {

    private final LongestCommonPrefix solution = new LongestCommonPrefix();

    private static Stream<Arguments> providePrefixTestCases() {
        return Stream.of(
                Arguments.of(new String[] { "flower", "flow", "flight" }, "fl"),
                Arguments.of(new String[] { "dog", "racecar", "car" }, ""));
    }

    @ParameterizedTest
    @MethodSource("providePrefixTestCases")
    void testLongestCommonPrefix(String[] input, String expectedPrefix) {
        assertEquals(expectedPrefix, solution.longestCommonPrefix(input));
    }
}
