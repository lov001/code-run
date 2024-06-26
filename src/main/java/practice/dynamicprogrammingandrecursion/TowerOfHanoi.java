package practice.dynamicprogrammingandrecursion;


public class TowerOfHanoi {

   public void moveTowerOfHanoi() {
      int n = 3;
      Tower[] towers = new Tower[n];
      for (int i = 0; i < 3; i++) {
         towers[i] = new Tower(i);
      }

      for (int i = n - 1; i >= 0; i--) {
         towers[0].add(i);
      }
      towers[0].moveDisks(n, towers[2], towers[1]);
   }
}
