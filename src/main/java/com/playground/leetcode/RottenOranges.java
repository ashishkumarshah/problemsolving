package com.playground.leetcode;

import com.playground.datastructures.CircularQueue;
import com.playground.datastructures.EmptyQueueException;
import com.playground.datastructures.QueueOverflowException;

/**
 * This class has an implementation of
 * https://www.geeksforgeeks.org/minimum-time-required-so-that-all-oranges-become-rotten/
 *
 * @author ashish
 */
public class RottenOranges {
  private static class Orange {
    private boolean rotten;
    private int rottenAt;
    private int i;
    private int j;

    public int getI() {
      return i;
    }

    public int getJ() {
      return j;
    }

    public boolean isRotten() {
      return rotten;
    }

    public void setRotten(boolean pRotten, int pRottenAt) {
      rotten = pRotten;
      rottenAt = pRottenAt;
    }

    public int getRottenAt() {
      return rottenAt;
    }

    public Orange(int pI, int pJ, boolean pRotten, int pRottenAt) {
      i = pI;
      j = pJ;
      rotten = pRotten;
      rottenAt = pRottenAt;
    }
  }

  /**
   * Function to find the minimum time needed to rot all the apples
   *
   * @param pRows The number of rows
   * @param pColumns The number of columns
   * @param pData The apple arrangement
   * @return -1 if it is impossible to have all apples rotten or the time if it is possible
   */
  public static int findTotalTimeToRotAllOranges(int pRows, int pColumns, int[][] pData) {
    CircularQueue rottenOranges = new CircularQueue(pRows * pColumns);
    int[][] data = pData;
    Orange[][] oranges = new Orange[pRows][pColumns];

    for (int i = 0; i < pRows; i++) {
      for (int j = 0; j < pColumns; j++) {

        if (data[i][j] == 2) {
          oranges[i][j] = new Orange(i, j, true, 0);
          try {
            rottenOranges.enqueue(oranges[i][j]);
          } catch (QueueOverflowException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
          }
        } else if (data[i][j] == 1) {
          oranges[i][j] = new Orange(i, j, false, Integer.MAX_VALUE);
        } else {
          oranges[i][j] = null;
        }
      }
    }

    while (!rottenOranges.isEmpty()) {
      try {
        Orange rottenOrange = (Orange) rottenOranges.deQueue();
        int i = rottenOrange.getI();
        int j = rottenOrange.getJ();
        int rottenAt = rottenOrange.getRottenAt();
        try {
          if (i > 0 && oranges[i - 1][j] != null) {
            if (!oranges[i - 1][j].isRotten() || oranges[i - 1][j].getRottenAt() > rottenAt + 1) {
              oranges[i - 1][j].setRotten(true, rottenAt + 1);
              rottenOranges.enqueue(oranges[i - 1][j]);
            }
          }
          if (i < pRows - 1 && oranges[i + 1][j] != null) {
            if (!oranges[i + 1][j].isRotten() || oranges[i + 1][j].getRottenAt() > rottenAt + 1) {
              oranges[i + 1][j].setRotten(true, rottenAt + 1);
              rottenOranges.enqueue(oranges[i + 1][j]);
            }
          }
          if (j > 0 && oranges[i][j - 1] != null) {
            if (!oranges[i][j - 1].isRotten() || oranges[i][j - 1].getRottenAt() > rottenAt + 1) {
              oranges[i][j - 1].setRotten(true, rottenAt + 1);
              rottenOranges.enqueue(oranges[i][j - 1]);
            }
          }
          if (j < pColumns - 1 && oranges[i][j + 1] != null) {
            if (!oranges[i][j + 1].isRotten() || oranges[i][j + 1].getRottenAt() > rottenAt + 1) {
              oranges[i][j + 1].setRotten(true, rottenAt + 1);
              rottenOranges.enqueue(oranges[i][j + 1]);
            }
          }
        } catch (QueueOverflowException queueOverflowException) {
          queueOverflowException.printStackTrace();
        }
      } catch (EmptyQueueException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }
    int maxTime = Integer.MIN_VALUE;
    for (int i = 0; i < pRows; i++) {
      for (int j = 0; j < pColumns; j++) {
        if (oranges[i][j] != null) {
          if (oranges[i][j].isRotten()) {
            if (maxTime < oranges[i][j].getRottenAt()) {
              maxTime = oranges[i][j].getRottenAt();
            }
          } else {
            return -1;
          }
        }
      }
    }

    return maxTime;
  }
}
