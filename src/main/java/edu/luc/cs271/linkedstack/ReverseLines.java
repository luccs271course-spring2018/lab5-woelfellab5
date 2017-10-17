package edu.luc.cs271.linkedstack;

import java.util.*;

public class ReverseLines {

  public static void main(String[] args) {
    // Done read successive input lines until EOF, then print out in reverse order

    LinkedStack<String> stack = new LinkedStack<String>();
    System.out.println("Enter how many lines you want");
    System.out.println("Press enter twice when you are finished");

    final Scanner input = new Scanner(System.in);
    String line;

    while (input.hasNextLine()) {
      line = input.nextLine();
      stack.push(line);
      if (line.equals("")) {
        break;
      }
    }

    while (!stack.isEmpty()) {
      System.out.println(stack.pop());
    }
  }
}
