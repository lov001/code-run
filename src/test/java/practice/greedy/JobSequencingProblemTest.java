package practice.greedy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import practice.greedy.JobSequencingProblem.Job;

public class JobSequencingProblemTest {

   JobSequencingProblem classObj = new JobSequencingProblem();

   @Test
   void test_JobScheduling_expect2And60_whenNIs4() {
      Job[] job = new Job[4];
      job[0] = new Job(1, 4, 20);
      job[1] = new Job(1, 1, 1);
      job[2] = new Job(3, 1, 40);
      job[3] = new Job(4, 1, 30);
      int[] actual = classObj.JobScheduling(job, 4);
      Assertions.assertEquals(2, actual.length);
      Assertions.assertEquals(2, actual[0]);
      Assertions.assertEquals(60, actual[1]);
   }

   @Test
   void test_JobScheduling_expect2And60_whenNIs5() {
      Job[] job = new Job[5];
      job[0] = new Job(1, 2, 100);
      job[1] = new Job(2, 1, 19);
      job[2] = new Job(3, 2, 27);
      job[3] = new Job(4, 1, 25);
      job[4] = new Job(5, 1, 15);
      int[] actual = classObj.JobScheduling(job, 5);
      Assertions.assertEquals(2, actual.length);
      Assertions.assertEquals(2, actual[0]);
      Assertions.assertEquals(127, actual[1]);
   }

   @Test
   void test_JobScheduling1_expect2And60_whenNIs4() {
      int[][] jobs = new int[4][3];
      jobs[0] = new int[]{1, 4, 20};
      jobs[1] = new int[]{1, 1, 1};
      jobs[2] = new int[]{3, 1, 40};
      jobs[3] = new int[]{4, 1, 30};
      int[] actual = classObj.JobScheduling(jobs, 4);
      Assertions.assertEquals(2, actual.length);
      Assertions.assertEquals(2, actual[0]);
      Assertions.assertEquals(60, actual[1]);
   }

   @Test
   void test_JobScheduling1_expect2And60_whenNIs5() {

      int[][] jobs = new int[5][3];
      jobs[0] = new int[]{1, 2, 100};
      jobs[1] = new int[]{2, 1, 19};
      jobs[2] = new int[]{3, 2, 27};
      jobs[3] = new int[]{4, 1, 25};
      jobs[4] = new int[]{5, 1, 15};
      int[] actual = classObj.JobScheduling(jobs, 5);
      Assertions.assertEquals(2, actual.length);
      Assertions.assertEquals(2, actual[0]);
      Assertions.assertEquals(127, actual[1]);
   }
}
