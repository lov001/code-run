package practice.queue;

import java.util.NoSuchElementException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import practice.queue.AnimalShelter.Animal;
import practice.queue.AnimalShelter.Cat;
import practice.queue.AnimalShelter.Dog;

public class AnimalShelterTest {


   @Test
   void test_add_expectSameElement_whenQueueIsEmpty() {
      Animal cat = new Cat("Billi 1");
      AnimalShelter myQueue = new AnimalShelter();
      myQueue.enqueue(cat);
      Assertions.assertFalse(myQueue.isEmpty());
      Assertions.assertEquals(cat, myQueue.dequeueAny());
   }

   @Test
   void test_add_expectFirstElement_whenQueueIsNotEmpty() {
      AnimalShelter myQueue = new AnimalShelter();
      Animal cat = new Cat("Billi 1");
      Animal dog = new Dog("Kutta 1");
      Animal dog2 = new Dog("Kutta 2");
      myQueue.enqueue(cat);
      myQueue.enqueue(dog);
      myQueue.enqueue(dog2);
      Assertions.assertFalse(myQueue.isEmpty());
      Assertions.assertEquals(dog, myQueue.dequeueDogs());
      Assertions.assertEquals(cat, myQueue.dequeueAny());
      Assertions.assertEquals(dog2, myQueue.dequeueAny());
   }

   @Test
   void test_remove_expectException_whenQueueIsEmpty() {
      AnimalShelter myQueue = new AnimalShelter();
      Assertions.assertTrue(myQueue.isEmpty());
      Assertions.assertThrows(NoSuchElementException.class, myQueue::dequeueAny);
   }

   @Test
   void test_remove_expectFirstElement_whenQueueHasOnlyOneElement() {
      AnimalShelter myQueue = new AnimalShelter();
      Animal dog = new Dog("Kutta 1");
      myQueue.enqueue(dog);
      Assertions.assertFalse(myQueue.isEmpty());
      Assertions.assertThrows(NoSuchElementException.class, myQueue::dequeueCats);
      Assertions.assertEquals(dog, myQueue.dequeueAny());
      Assertions.assertTrue(myQueue.isEmpty());
   }

   @Test
   void test_QueueUsingLinkedList() {
      Animal cat1 = new Cat("Billi 1");
      Animal dog1 = new Dog("Kutta 1");
      Animal dog2 = new Dog("Kutta 2");
      Animal cat2 = new Cat("Billi 2");
      Animal dog3 = new Dog("Kutta 3");
      Animal dog4 = new Dog("Kutta 4");
      Animal cat3 = new Cat("Billi 3");
      Animal cat4 = new Cat("Billi 4");
      Animal dog5 = new Dog("Kutta 5");
      AnimalShelter myQueue = new AnimalShelter();
      myQueue.enqueue(dog1);
      myQueue.enqueue(dog2);
      Assertions.assertEquals(dog1, myQueue.dequeueAny());
      Assertions.assertFalse(myQueue.isEmpty());
      myQueue.enqueue(cat1);
      myQueue.enqueue(dog3);
      myQueue.enqueue(cat2);
      Assertions.assertEquals(cat1, myQueue.dequeueCats());
      Assertions.assertEquals(cat2, myQueue.dequeueCats());
      Assertions.assertEquals(dog2, myQueue.dequeueAny());
      myQueue.enqueue(dog4);
      myQueue.enqueue(dog5);
      myQueue.enqueue(cat3);
      myQueue.enqueue(cat4);
      Assertions.assertEquals(cat3, myQueue.dequeueCats());
      Assertions.assertEquals(dog3, myQueue.dequeueAny());
      Assertions.assertEquals(dog4, myQueue.dequeueDogs());
      Assertions.assertFalse(myQueue.isEmpty());
      Assertions.assertEquals(dog5, myQueue.dequeueAny());
      Assertions.assertEquals(cat4, myQueue.dequeueAny());
      Assertions.assertTrue(myQueue.isEmpty());
   }

}
