/* This is a stub for the House class */
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class House extends Building implements HouseRequirements{
  protected ArrayList<Student> residents; // The <Student> tells Java what kind of data we plan to store IN the ArrayList
  protected boolean hasDiningRoom;
  
  public House(String name, String address, int nFloors, boolean hasDiningRoom) {
    super(name, address, nFloors); //call superclass constructor with name, address, and nFloors parameters
    this.residents = new ArrayList<Student>(); //initialize ArrayList residents
    this.hasDiningRoom = hasDiningRoom; //initalize new parameter hasDiningRoom;
    System.out.println("You have built a house: 🏠");
  }

  public boolean hasDiningRoom(){
    return this.hasDiningRoom;
  }
  
  public int nResidents(){
    int nResidents = this.residents.size(); 
    return nResidents;
  }

  public void moveIn(Student s){ //go through list and ensure student isn't in there and if true then add student
    for (int i = 0; i < this.residents.size(); i++){
      Student resident = this.residents.get(i);
      if (resident.equals(s)) {
        throw new NoSuchElementException("Student " + s + " is already in the house.");
      }
    this.residents.add(s);
    System.out.println("Student " + s + " has moved into the house.");
    }
  }

  public Student moveOut(Student s) {
    for (int i = 0; i < this.residents.size(); i++) {
        Student resident = this.residents.get(i);
        if (resident.equals(s)) {
            Student removedStudent = this.residents.remove(i); 
            System.out.println("Student " + removedStudent + " has moved out.");
            return removedStudent;
        }
    }
    throw new NoSuchElementException("Student " + s + " does not live in the house."); //throws exception if not found
  }

  public boolean isResident(Student s){
    return this.residents.contains(s);
  }

  public static void main(String[] args) {
    House Gillette = new House("Gillette", "Elm St", 5, true);
    System.out.println(Gillette);
  }

}