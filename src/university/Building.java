package university;

public class Building implements Name {

  private String name;

  private int numberOfRooms;

  private static int noOfBuildings;

  static {
    noOfBuildings = 0;
  }

  public static void getNoOfBuildings() {
    System.out.println("There are " + noOfBuildings + " buildings in the University.");
  }

  public Building(final String name, final int numberOfRooms) {
    this.name = name;
    this.numberOfRooms = numberOfRooms;
    noOfBuildings++;
  }

  @Override
  public String toString() {
    return "Building " + this.name + " has " + this.numberOfRooms + " rooms.";
  }

  @Override
  public boolean equals(Object obj) {
    Building bldg = (Building) obj;


    if (this.name == bldg.name && this.numberOfRooms == bldg.numberOfRooms) {
      return true;
    }

    return false;
  }

  @Override
  public int hashCode() {
    return 100;
  }


  public int getNumberOfRooms() {
    return numberOfRooms;
  }

  public void setNumberOfRooms(int numberOfRooms) {
    this.numberOfRooms = numberOfRooms;
  }


  @Override
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String getName() {
    return name;
  }
}
