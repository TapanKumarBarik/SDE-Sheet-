package com.creations.algorithms.twopointers.sort012;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

  private static Stream<Arguments> arguments() {
    return Stream.of(
        Arguments.of(new int[] {2, 0, 2, 1, 1, 0}, new int[] {0, 0, 1, 1, 2, 2}),
        Arguments.of(new int[] {2, 0, 1}, new int[] {0, 1, 2}),
        Arguments.of(
            new int[] {0, 0, 1, 1, 0, 1, 2, 2, 0, 1}, new int[] {0, 0, 0, 0, 1, 1, 1, 1, 2, 2}),
        Arguments.of(
            new int[] {2, 0, 1, 2, 2, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 1},
            new int[] {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 2, 2, 2, 2, 2, 2}));
  }

  @ParameterizedTest
  @MethodSource("arguments")
  public void testSortColors(int[] input, int[] expected) {
    new Solution().sortColors(input);
    assertArrayEquals(expected, input);
  }
}
