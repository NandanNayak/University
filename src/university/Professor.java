package university;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

final public class Professor extends Person implements Teach {

  private String subject;

  public Professor(final String name, final LocalDate dateOfBirth, String id, String subject) {
    super(name, dateOfBirth, id);
    this.subject = subject;
  }

  @Override
  public String toString() {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    String formattedDate = formatter.format(this.dateOfBirth);
    return String.format("Professor " + this.name + " whose id is " + this.id + " was born on " + formattedDate + ".");
  }

  @Override
  public int hashCode() {
    return 600;
  }

  @Override
  public void teach() {
    System.out.println("This professor teaches " + this.subject + ".");
  }
}
