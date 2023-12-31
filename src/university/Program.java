package university;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Program implements Name {
  private String name;
  private ArrayList<Course> courses;

  private LocalDate startDate;

  public Program(String name, ArrayList<Course> courses, LocalDate startDate) {
    this.name = name;
    this.courses = courses;
    this.startDate = startDate;
  }

  public void whoami() {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    String formattedDate = formatter.format(this.startDate);
    System.out.println(this);

    for (int i = 0; i < courses.size(); i++) {
      System.out.println(courses.get(i));
    }
  }

  @Override
  public String toString() {
    return "Program " + this.name + " starts on " + this.startDate + ".";
  }

  @Override
  public boolean equals(Object obj) {
    Program program = (Program) obj;


    if (this.name == program.name) {
      return true;
    }

    return false;
  }

  @Override
  public int hashCode() {
    return 700;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public void setName(String name) {
    this.name = name;
  }

  public ArrayList<Course> getCourses() {
    return courses;
  }

  public void setCourses(ArrayList<Course> courses) {
    this.courses = courses;
  }
}
