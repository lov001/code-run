package practice.queue;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class AnimalShelter {

   static abstract class Animal {

      private int order;
      protected String name;

      public Animal(String n) {
         name = n;
      }

      public void setOrder(int ord) {
         order = ord;
      }

      public int getOrder() {
         return order;
      }

      /* Compare orders of animals to return the older item. */
      public boolean isOlderThan(Animal a) {
         return this.order < a.getOrder();
      }
   }


   LinkedList<Dog> dogs = new LinkedList<>();
   LinkedList<Cat> cats = new LinkedList<>();
   private int order = 0; // acts as timestamp

   public void enqueue(Animal a) {
          /* Order is used as a sort of timestamp, so that we can compare the insertion
               21 * order of a dog to a cat. */
      a.setOrder(order);
      order++;

      if (a instanceof Dog) {
         dogs.addLast((Dog) a);
      } else if (a instanceof Cat) {
         cats.addLast((Cat) a);
      }
   }

   public Animal dequeueAny() {
          /* Look at tops of dog and cat queues, and pop the queue with the oldest
31 * value. */
      if (dogs.size() == 0) {
         return dequeueCats();
      } else if (cats.size() == 0) {
         return dequeueDogs();
      }
      Dog dog = dogs.peek();
      Cat cat = cats.peek();
      if (dog.isOlderThan(cat)) {
         return dequeueDogs();
      } else {
         return dequeueCats();
      }
   }

   public Dog dequeueDogs() {
      if(dogs.isEmpty()){
         throw new NoSuchElementException();
      }
      return dogs.poll();
   }

   public Cat dequeueCats() {
      if(cats.isEmpty()){
         throw new NoSuchElementException();
      }
      return cats.poll();
   }

   public static class Dog extends Animal {

      public Dog(String n) {
         super(n);
      }
   }

   public static class Cat extends Animal {

      public Cat(String n) {
         super(n);
      }
   }

   public boolean isEmpty() {
      return dogs.isEmpty() && cats.isEmpty();
   }

}
