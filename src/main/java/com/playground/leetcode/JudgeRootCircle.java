package com.playground.leetcode;

/**
 * This class has an implementation of the leetcode problem Judget Root Circle. Please refer <a
 * href= "https://leetcode.com/problems/judge-route-circle/description/">this</a> for more detail
 * and the problem description.
 */
public class JudgeRootCircle {
  /** This is a private inner class to represent the Robot */
  private static class Robot {
    private int x;
    private int y;

    /** Constructor for the robot object */
    Robot() {
      x = 0;
      y = 0;
    }

    /** This method moves the robot to the left */
    public void moveLeft() {
      x--;
    }

    /** This method moves the robot to the right */
    public void moveRight() {
      x++;
    }

    /** This method moves the robot up */
    public void moveUp() {
      y++;
    }

    /** This method moves the robot down */
    public void moveDown() {
      y--;
    }

    /**
     * This method indicates whether the robot is at home position
     *
     * @return whether the robot is at home position
     */
    public boolean isHome() {
      if (x == 0 && y == 0) {
        return true;
      } else {
        return false;
      }
    }
  }

  private Robot robot;

  /** This method is the default constructor for the class. */
  public JudgeRootCircle() {
    robot = new Robot();
  }

  /**
   * This method is used to move the robot according to the sequence of moves given in the input.
   * After moving it determines if the robot has reached home.
   *
   * @param pMoves The sequence of moves
   * @return Whether the robot has reached home after the moves
   */
  public boolean moveAndCheckHome(String pMoves) {
    String moves = pMoves.toLowerCase();
    for (int i = 0; i < moves.length(); i++) {
      if (moves.charAt(i) == 'l') {
        robot.moveLeft();
      } else if (moves.charAt(i) == 'r') {
        robot.moveRight();
      } else if (moves.charAt(i) == 'u') {
        robot.moveUp();
      } else {
        robot.moveDown();
      }
    }
    return robot.isHome();
  }
}
