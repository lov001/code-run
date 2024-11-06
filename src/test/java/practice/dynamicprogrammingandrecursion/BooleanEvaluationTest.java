package practice.dynamicprogrammingandrecursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BooleanEvaluationTest {

   BooleanEvaluation classObj = new BooleanEvaluation();

   @Test
   void test_evaluateExp_expect1_when2WaysToParenthesizeExpression() {
      Assertions.assertEquals(1, classObj.evaluateExp("T|T&F"));
      Assertions.assertEquals(1, classObj.evaluateExpTabulation("T|T&F"));
   }

   @Test
   void test_evaluateExp_expect0_when2WaysToParenthesizeExpression() {
      Assertions.assertEquals(0, classObj.evaluateExp("T^T^F"));
      Assertions.assertEquals(0, classObj.evaluateExpTabulation("T^T^F"));
   }

   @Test
   void test_evaluateExp_expect2_when2WaysToParenthesizeExpression() {
      Assertions.assertEquals(2, classObj.evaluateExp("F|T^F"));
      Assertions.assertEquals(2, classObj.evaluateExpTabulation("F|T^F"));
   }

   @Test
   void test_evaluateExp_expect37658582_when2WaysToParenthesizeExpression() {
      Assertions.assertEquals(37658582, classObj.evaluateExp("F^F^F^F&T|T|F|T|F|F|T|T|T|T&T|T|T&T|F&T|F|T|T|T^T|F^T|T&F^T|F|T|F|T&T|T^F|F^T&T^T&T^T&T^T&F&T^F|F^T|T|F|F^F|F&F|F|T&F&F"));
      Assertions.assertEquals(37658582, classObj.evaluateExpTabulation("F^F^F^F&T|T|F|T|F|F|T|T|T|T&T|T|T&T|F&T|F|T|T|T^T|F^T|T&F^T|F|T|F|T&T|T^F|F^T&T^T&T^T&T^T&F&T^F|F^T|T|F|F^F|F&F|F|T&F&F"));
   }
}
