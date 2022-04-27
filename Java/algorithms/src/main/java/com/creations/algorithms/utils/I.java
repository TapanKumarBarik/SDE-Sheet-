package com.creations.algorithms.utils;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class I {

  public static BufferedReader br() throws Exception {
    return br("input.txt");
  }

  public static BufferedReader br(String fileName) throws Exception {
    return new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
  }

  public static int inputInt(BufferedReader br) throws IOException {
    return Integer.parseInt(br.readLine().trim());
  }

  public static int[][] inputMatrix(String str) {
    String[] digits = str.split(" ");
    int r = Integer.parseInt(digits[0]);
    int c = Integer.parseInt(digits[1]);
    int[][] matrix = new int[r][c];
    int k = 2;
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++, k++) {
        matrix[i][j] = Integer.parseInt(digits[k]);
      }
    }
    return matrix;
  }
}
