package com.playground.leetcode;
/**
* This class has an implementation of the leetcode problem Judget Root Circle.
* Please refer <a href="https://leetcode.com/problems/judge-route-circle/description/">this</a> for more detail and the problem description.
*/
public class JudgeRootCircle {

  private static class Robot {
    private int x;
    private int y;

    Robot () {
      x = 0;
      y = 0;
    }

    public void moveLeft() {
      x--;
    }

    public void moveRight() {
      x++;
    }

    public void moveUp () {
      y++;
    }

    public void moveDown () {
      y--;
    }

    public boolean isHome () {
      if ( x == 0 && y ==0 ) {
        return true;
      } else {
        return false;
      }
    }
  }

  private Robot robot;
  public JudgeRootCircle () {
    robot = new Robot();
  }
  public boolean moveAndCheckHome (String pMoves) {
    String moves = pMoves.toLowerCase();
    for (int i =0; i < moves.length(); i++) {
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
