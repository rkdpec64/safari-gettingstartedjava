package lambda;

import java.util.Arrays;
import java.util.List;

public class Student {
  private String name;
  private double gpa;
  private List<String> courses;

  public Student(String name, double gpa, String ... courses) {
    this.name = name;
    this.gpa = gpa;
    this.courses = Arrays.asList(courses);
  }

  public String getName() {
//    String name = "fred";
    return name; // this prefix implied
  }

  public double getGpa() {
    return gpa;
  }

  public List<String> getCourses() {
    return courses;
  }

  @Override
  public String toString() {
    return "Student{" +
        "name='" + name + '\'' +
        ", gpa=" + gpa +
        ", courses=" + courses +
        '}';
  }
}
