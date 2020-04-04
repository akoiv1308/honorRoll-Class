import java.util.*;

class Main {
  public static void main(String[] args) {
    // testing studentClass //
    Student student = new Student("Bob", 90);
    // toString() to print student's name and average //
    System.out.println(student.toString());
    // changing student's GPA //
    double gpa = 55.0;
    student.setGPA(gpa);
    System.out.println(student.getGPA());

    //creating an ArrayList named "roster" //
    ArrayList<Student> roster = new ArrayList<Student>();
    // adding students to roster //
    roster.add(new Student("Alex", 76));
    roster.add(new Student("Annie", 84));;
    roster.add(new Student("Evan", 97));
    roster.add(new Student("Matthew", 12));
    roster.add(new Student("Jack", 99));
    roster.add(new Student("Tahiya", 93));
    roster.add(new Student("Shuoshuo", 94));
    roster.add(new Student("Ryan", 98.5));
    roster.add(new Student("Syed", 90.1));
    roster.add(new Student("Haseeb", 96.12));
    roster.add(new Student("Bryan", 95.78));

    // creating topStudens class to determine honor students and passing roster as a parameter //
    HonorRoll topStudents = new HonorRoll(roster);
    topStudents.ranked();
    System.out.println("\n" + topStudents.toString());
  
  }
}