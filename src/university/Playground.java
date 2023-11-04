package university;

public class Playground implements Name {
  private String name;

  public Playground(final String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "This playground is a " + this.name;
  }

  @Override
  public boolean equals(Object obj) {
    Playground playground = (Playground) obj;


    if (this.name == playground.name) {
      return true;
    }

    return false;
  }

  @Override
  public int hashCode() {
    return 500;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public void setName(String name) {
    this.name = name;
  }
}
