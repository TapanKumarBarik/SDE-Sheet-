package com.creations.algorithms.dp.pascal;

import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

  private static Stream<Arguments> arguments() {
    return Stream.of(
        Arguments.of(3, List.of(List.of(1), List.of(1, 1), List.of(1, 2, 1))),
        Arguments.of(4, List.of(List.of(1), List.of(1, 1), List.of(1, 2, 1), List.of(1, 3, 3, 1))));
  }

  @ParameterizedTest
  @MethodSource("arguments")
  public void test(int n, List<List<Integer>> expected) {
    List<List<Integer>> generate = new Solution().generate(n);
    Assertions.assertIterableEquals(expected, generate);
  }
}
