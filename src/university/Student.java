package university;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

final public class Student extends Person implements Study, OnCampusJob {

  private String subject;
  private boolean onCampusJob;

  public Student(final String name, final LocalDate dateOfBirth, String id, String subject, boolean onCampusJob) {
    super(name, dateOfBirth, id);
    this.subject = subject;
    this.onCampusJob = onCampusJob;
  }

  @Override
  public String toString() {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    String formattedDate = formatter.format(this.dateOfBirth);
    return String.format("Student " + this.name + " whose id is " + this.id + " was born on " + formattedDate );
  }

  @Override
  public int hashCode() {
    return 800;
  }

  @Override
  public void study() {
    System.out.println("This student studies " + this.subject + ".");
  }

  @Override
  public void onCampusJob() {
    if (this.onCampusJob) {
      System.out.println("This student has an On-Campus Job.");
    } else {
      System.out.println("This student does not have an On-Campus Job.");
    }
  }
}
