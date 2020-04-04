import java.util.*;

class Student {

  // Fields //
  private String name;
  private double gpa;

  // Constructor //
  Student(String name, double gpa) {
    this.name = name;
    this.gpa = gpa;
  }
  
  // Getters //
  public String getName() {
    return name;
  }
  public double getGPA() {
    return gpa;
  }

  // Setters //
  public String setName(String newName) {
    name = newName;
    return name;
  }
  public double setGPA(double newGPA) {
    gpa = newGPA;
    return gpa;
  }

  @Override 
  public String toString() {
    return "Name: " + name + "\nGPA: " + gpa;
  }

}