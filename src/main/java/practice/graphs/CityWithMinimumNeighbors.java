package practice.graphs;

public class CityWithMinimumNeighbors {

   public int findCity(int n, int m, int[][] edges, int distanceThreshold) {
      int[][] matrix = new int[n][n];
      for (int i = 0; i < n; i++) {
         for (int j = 0; j < n; j++) {
            matrix[i][j] = (int) 1e9;
            if (i == j) {
               matrix[i][j] = 0;
            }
         }
      }
      for (int i = 0; i < m; i++) {
         int source = edges[i][0];
         int destination = edges[i][1];
         int weight = edges[i][2];
         matrix[source][destination] = weight;
         matrix[destination][source] = weight;

      }
      for (int via = 0; via < n; via++) {
         for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
               int distance = matrix[i][via] + matrix[via][j];
               if (distance < matrix[i][j]) {
                  matrix[i][j] = distance;
               }
            }
         }
      }
      int city = -1;
      int minCount = distanceThreshold + 1;
      int count = 0;
      for (int i = 0; i < n; i++) {
         for (int j = 0; j < n; j++) {
            if (matrix[i][j] <= distanceThreshold) {
               count++;
            }
         }
         if (count < minCount) {
            city = i;
            minCount = count;
         } else if (count == minCount) {
            city = Math.max(city, i);
         }
         count = 0;
      }
      return city;
   }
}
