package com.playground.leetcode;

public class FindTheTownJudge {
  public int findJudge(int N, int[][] trust) {
    boolean[] trustingPeople = new boolean[N];
    int[] trustCount = new int[N];
    int a, b;
    int potentialJudge = 0;
    int trustingPeopleCount = 0;
    for (int i = 0; i < trust.length; i++) {
      a = trust[i][0] - 1;
      b = trust[i][1] - 1;
      if (!trustingPeople[a]) {
        trustingPeople[a] = true;
        trustingPeopleCount++;
        if (trustingPeopleCount == N) {
          // every body trusts everybody
          return -1;
        }
      }
      if (a != b) trustCount[b]++;
    }
    if (trustingPeopleCount != N - 1) {
      // Not enough trust here
      return -1;
    }
    for (int i = 0; i < N; i++) {
      if (trustingPeople[i] == false) {
        if (trustCount[i] == N - 1) {
          if (potentialJudge == 0) {
            potentialJudge = i + 1;
          } else {
            // multiple people are judges
            return -1;
          }
        }
      }
    }
    return (potentialJudge != 0) ? potentialJudge : -1;
  }
}
