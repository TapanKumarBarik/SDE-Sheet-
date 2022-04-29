package com.creations.algorithms.dp.besttimetobuyandsell;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

  private static Stream<Arguments> arguments() {
    return Stream.of(
        Arguments.of(new int[] {7, 1, 5, 3, 6, 4}, 5),
        Arguments.of(new int[] {7, 6, 4, 3, 1}, 0),
        Arguments.of(new int[] {1, 2}, 1),
        Arguments.of(new int[] {1, 2, 3}, 2),
        Arguments.of(new int[] {1, 2, 4, 6}, 5));
  }

  @ParameterizedTest
  @MethodSource("arguments")
  public void testBuySell(int[] input, int expected) {
    int actual = new Solution().maxProfit(input);
    assertEquals(expected, actual);
  }
}
