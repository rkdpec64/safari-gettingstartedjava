package hello;

import java.util.Scanner;

public class HelloAgain {
  public static void main(String [] args) {
    System.out.println("Hello world, again!");

    Scanner sc = new Scanner(System.in);
    System.out.println("please enter a number");
    int i1 = sc.nextInt();
    System.out.println("please enter another number");
    int i2 = sc.nextInt();
    int i3 = i1 + i2;
    System.out.println("sum is " + i3);

    // Java is strongly and statically typed
//    i1 = "11";
    // Java has 8 built in types
    // boolean (true false) int (+/- 2 billion) long (much bigger)
    // double (floating point, ie. decimal fractions.. float (smaller decimals)

    double pi = 3.141;
//    int radius = 1000 / pi; // not allowed (strong/static typing!)
//    double radius = 1000 / pi;
    int radius = (int)(1000 / pi); // "cast" change type of an expression

    // Java has operators for math
    // + - * / (modulus, remainder, %)
    System.out.println("7 divided by 3 leaves remainder: " + (7 % 3));

    // Also comparisons:
    // > < >= <= != == (but == is tricky!!!)

    int a = 99;
    int b = 100;
    System.out.println("A is greater than b? " + (a > b));
  }
}
