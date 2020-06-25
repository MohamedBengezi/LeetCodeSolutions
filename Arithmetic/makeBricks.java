/*
https://codingbat.com/prob/p183562
*/

public boolean makeBricks(int small, int big, int goal) {
  int total = 5 * big + small;
  //getting the difference between the goal and closest LCM of 5.
  int diff = goal - goal/5 * 5;

  return total >= goal && diff <= small;
}
