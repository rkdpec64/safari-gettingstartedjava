package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class SmartPredicate implements Predicate<Student> {
  @Override
  public boolean test(Student student) {
    return student.getGpa() > 3;
  }
}

public class School {
  public static List<Student> getByPredicate(
      List<Student> in, Predicate<Student> pred) {
    List<Student> out = new ArrayList<>();
    for (Student s : in) {
      if (pred.test(s)) {
        out.add(s);
      }
    }
    return out;
  }
  public static void showAll(List<Student> students) {
    for (Student s : students) {
      System.out.println(s);
    }
    System.out.println("-----------------");
  }
  public static void main(String[] args) {
    List<Student> roster = Arrays.asList(
        new Student("Fred", 3.2, "Math", "Physics"),
        new Student("Jim", 2.2, "Art"),
        new Student("Sheila", 3.9, "Math", "Physics", "Quantum Physics")
    );

    showAll(roster);
    showAll(getByPredicate(roster, new SmartPredicate()));
    showAll(getByPredicate(roster, (Student s) -> {return s.getGpa() > 3;}));
    showAll(getByPredicate(roster, (s) -> {return s.getGpa() > 3;}));
    showAll(getByPredicate(roster, s -> {return s.getGpa() > 3;}));
    showAll(getByPredicate(roster, s -> s.getGpa() < 3));
  }
}
