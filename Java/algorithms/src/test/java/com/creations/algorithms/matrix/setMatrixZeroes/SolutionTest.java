package com.creations.algorithms.matrix.setMatrixZeroes;

import com.creations.algorithms.utils.I;
import com.creations.algorithms.utils.O;
import com.creations.algorithms.utils.S;
import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

  private static Stream<Arguments> arguments() {
    return Stream.of(
        Arguments.of("3 3 1 1 1 1 0 1 1 1 1", "3 3 1 0 1 0 0 0 1 0 1"),
        Arguments.of("3 4 0 1 2 0 3 4 5 2 1 3 1 5", "3 4 0 0 0 0 0 4 5 0 0 3 1 0"));
  }

  @ParameterizedTest
  @MethodSource("arguments")
  public void test(String input, String output) {
    int[][] expected = I.inputMatrix(output);
    int[][] actual = I.inputMatrix(input);
    new Solution().setZeroes(actual);
    Assertions.assertEquals(expected.length, actual.length);
    for (int i = 0; i < actual.length; i++) {
      Assertions.assertArrayEquals(expected[i], actual[i]);
    }
    O.debug(S.string(actual));
  }

  @Test
  public void test_setMatrixZeroes() {
    int[][] expected = I.inputMatrix("3 3 1 0 1 0 0 0 1 0 1");
    int[][] actual = I.inputMatrix("3 3 1 1 1 1 0 1 1 1 1");
    new Solution().setZeroes(actual);
    Assertions.assertEquals(expected.length, actual.length);
    for (int i = 0; i < actual.length; i++) {
      Assertions.assertArrayEquals(expected[i], actual[i]);
    }
    O.debug(S.string(actual));
  }
}
