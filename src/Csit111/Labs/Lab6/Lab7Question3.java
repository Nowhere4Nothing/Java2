package Csit111.Labs.Lab6;

public class Lab7Question3 {

  public static void main(String[] args) {
    // create an employee object with id 0102038 and name John Smith
    Lab6Ex2 Employee1 = new Lab6Ex2("0102038", "John", "Smith");

    // // display the employee object John Smith details
    System.out.println(Employee1.toString());

    // retrieve the employee object John Smith email address
    String Email1 = Employee1.getemail();

    // display the employee object John Smith email address
    System.out.println(Employee1 + " " + Email1);

    // create an employee object with id 1212987 and name Mary Janes
    Lab6Ex2 Employee2 = new Lab6Ex2("1212987", "Mary", "Janes");

    // retrieve the employee object Mary Janes first and last name
    String firstNameMary = Employee2.getFirstName();
    String lastNameMary = Employee2.getLastName();

    // display the employee object Mary Janes full name
    System.out.println(firstNameMary + " " + lastNameMary);

    // update employee object Mary Janes first name to Marie
    Employee2.setFirstName("Marie");

    // update employee object Mary Janes last name to Morrison
    Employee2.setLastName("Morrison");

    // display the employee object Mary Janes new full name
    firstNameMary = Employee2.getFirstName();
    lastNameMary = Employee2.getLastName();
    System.out.println(firstNameMary + " " + lastNameMary);

    // display the employee object Mary Janes new details
    System.out.println(Employee2);
    // create an employee object with your chosen details
    Lab6Ex2 Employee3 = new Lab6Ex2("123456", "Max", "Steele");
    System.out.println(Employee3);
    // change first name and last name of this object
    Employee3.setFirstName("Martin");
    Employee3.setLastName("Steal");
    // display the new full name of this object
    System.out.println(Employee3);
  }

}
