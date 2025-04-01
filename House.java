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
    return hasDiningRoom;
  }
  
  public int nResidents(){
    int nResidents = residents.size(); 
  }

  public void moveIn(Student s){ //go through list and ensure student isn't in there and if true then add student
    for (int i = 0; i < residents.size(); i++){
      String resident = residents[i];
      if (resident.contains(s)) {
        throw new NoSuchElementException("Student " + s + " is already moved in.");
      } else {
        residents.add(s);
        System.out.println("Student " + s + " is already moved in.");
      }
    }

  //   if (this. > 0) {
  //     this.remainingSeats -= 1;
  //     System.out.println("There are " + this.remainingSeats + " remaining seats.");
  //     return passengersOnboard.add(p);
  // } else {
  //     return false;
  // }
  // }

  public Student moveOut(Student s) {
    // return the Student who moved out
  }

  public boolean isResident(Student s){

  }

  public static void main(String[] args) {
    new House();
  }

}