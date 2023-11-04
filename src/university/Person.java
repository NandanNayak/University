package university;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Person implements Name, Id {
  protected String name;
  protected LocalDate dateOfBirth;
  protected String id;

  public Person(final String name, final LocalDate dateOfBirth, String id) {
    this.name = name;
    this.dateOfBirth = dateOfBirth;
    this.id = id;
  }

  @Override
  public String toString() {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    String formattedDate = formatter.format(this.getDateOfBirth());
    return String.format(this.getName() + " whose id is " + this.getId() + " was born on " + formattedDate);
  }

  @Override
  public boolean equals(Object obj) {
    Person person = (Person) obj;


    if (this.name == person.name && this.id == person.id && this.dateOfBirth == person.dateOfBirth) {
      return true;
    }

    return false;
  }

  @Override
  public int hashCode() {
    return 400;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public void setName(String name) {
    this.name = name;
  }

  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

}
