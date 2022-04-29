package com.creations.algorithms.dp.maxsubarraysum;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

  private static Stream<Arguments> arguments() {
    return Stream.of(
        Arguments.of(new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4}, 6),
        Arguments.of(new int[] {5, 4, -1, 7, 8}, 23),
        Arguments.of(new int[] {1}, 1),
        Arguments.of(new int[] {-1, -2, -3}, -1),
        Arguments.of(new int[] {1, 2, -3, 2}, 3));
  }

  @ParameterizedTest
  @MethodSource("arguments")
  public void testKadanes(int[] input, int expected) {
    int actual = new Solution().maxSubArray(input);
    assertEquals(expected, actual);
  }
}
