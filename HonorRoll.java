import java.util.*;

public class HonorRoll {

  // Fields //

  // creating honorStudents list to add students with an average higher than a 90 //
  private ArrayList<Student> honorStudents;

  // Constructor //
  HonorRoll(ArrayList<Student> studentList){ 
    // initializing honorStudent list //
    honorStudents = new ArrayList<Student>();
    // for number of students in the list //
    for(int i = 0; i < studentList.size(); i++) {
      // if certain students of (i) has an average above 90 ///
      if(studentList.get(i).getGPA() >= 90) {
        // add that student to an honorStudent list //
        honorStudents.add(studentList.get(i));
      }
    }
  }

  public void ranked() {
    // for every student in the class //
    for(int i = 0; i < honorStudents.size(); i++) {
      // going backwards from the honorStudents list and as long as the j value is less than i //
      for(int j = honorStudents.size() - 1; j > i; j--) {
        // if the student of j has a higher gpa of student of i //
        if(honorStudents.get(i).getGPA() < honorStudents.get(j).getGPA()) {
          // then creating a temporary holder that would take the lower gpa and hold it //
          Student tmp = honorStudents.get(i);
          // setting the highest gpa at an index of i //
          honorStudents.set(i,honorStudents.get(j));
          // setting the lower gpa at an index of j //
          honorStudents.set(j,tmp);
        }
      }
    }
  }

  // printing honorStudents //
  
  @Override
  public String toString(){
    String label = "Honor Students: ";
    String line = "\n---------------";
    String indivStudent = "";
    for(int i = 0; i < honorStudents.size(); i++) {
      indivStudent += "\n" + (i+1) + ". " + honorStudents.get(i).getName() + ": " + honorStudents.get(i).getGPA();
    }
    return label + line + indivStudent;
  }

}