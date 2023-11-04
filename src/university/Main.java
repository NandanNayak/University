package university;

public class Main {
  public static void main(String[] args) {

    University university = new University();

    Building.getNoOfBuildings();
    for (int i = 0; i < university.getBuildings().size(); i++) {
      System.out.println(university.getBuildings().get(i));
    }

    System.out.println();
    for (int i = 0; i < university.getPlaygrounds().size(); i++) {
      System.out.println(university.getPlaygrounds().get(i));
    }

    System.out.println();
    for (int i = 0; i < university.getPrograms().size(); i++) {
      university.getPrograms().get(i).whoami();
    }

    System.out.println();
    for (int i = 0; i < university.getParkingLots().size(); i++) {
      System.out.println(university.getParkingLots().get(i));
    }

    System.out.println();
    for (int i = 0; i < university.getProfessors().size(); i++) {
      final Professor professor = university.getProfessors().get(i);
      System.out.println(professor);
      professor.teach();

    }

    System.out.println();
    for (int i = 0; i < university.getStudents().size(); i++) {
      final Student student = university.getStudents().get(i);
      System.out.println(student);
      student.study();
    }

  }
}