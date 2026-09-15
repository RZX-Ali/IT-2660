//import java.util.*;
/*
 * IT-2660 - Lab 1
 * Student Name: Ali Sahi
 */

public class Main {
  public static void main(String[] args) {
    // System.out.println("hello, world!");

    Lab1 lab = new Lab1();
    System.out.println(lab.increment(1));

    int[] numbers = {5, 9, 3, 12, 7, 3, 11, 5};

    System.out.println("Array in order:");
    int i = 0;
    while (i < numbers.length) {
        System.out.print(numbers[i] + " ");
        i++;
    }
    
    System.out.println(); // need new line to seperate the print statements of the arrays
    System.out.println("Reverse Array:");

    for (i = numbers.length - 1; i >= 0; i--) {
        System.out.print(numbers[i] + " ");
    }

    System.out.println(); // same as above, need new line to seperate the print statements / outputs

    System.out.println("The first value: " + numbers[0]);
    System.out.println("The last value: " + numbers[numbers.length - 1]);

    System.out.println("Max of 25 and 6: " + lab.max(25, 6));
    System.out.println("Min of 25 and 6: " + lab.min(25, 6));

    System.out.println("Sum: " + lab.sum(numbers));
    System.out.println("Average: " + lab.average(numbers));

    System.out.println("Max of array: " + lab.max(numbers));
    System.out.println("Min of array: " + lab.min(numbers));
    
  }
}     

// Add all of the methods here
class Lab1 {
  public int increment(int number) { // altered parameter name 
    return ++number;
  }
  public int max(int a, int b) {
    if (a > b) {
        return a;
    } else {
        return b;
    }
  }

  public int min(int a, int b) {
    if (a < b) {
        return a;
    } else {
        return b;
    }
  }

  public int sum(int[] numbers) {
      int total = 0;
      for (int i = 0; i < numbers.length; i++) {
          total += numbers[i];
      }
      return total;
  }

  public double average(int[] numbers) {
      int total = 0;
      for (int number : numbers) {
          total += number;
      }
      return (double) total / numbers.length;
  }

  public int max(int[] numbers) {
      int maximum = numbers[0];
      for (int i = 1; i < numbers.length; i++) {
          if (numbers[i] > maximum) {
              maximum = numbers[i];
          }
      }
      return maximum;
  }


  public int min(int[] numbers) {
      int minimum = numbers[0];

      for (int i = 1; i < numbers.length; i++) {
          if (numbers[i] < minimum) {
              minimum = numbers[i];
          }
      }

      return minimum;
  }
}