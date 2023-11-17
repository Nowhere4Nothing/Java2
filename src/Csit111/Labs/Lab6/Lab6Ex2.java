package Csit111.Labs.Lab6;

public class Lab6Ex2 {
  // it stays in the class and it refers to the common property of all objects
  private static String EMAIL_DOMAIN = "duugle.com";
  // Because they change per person
  private static String EMAIL_PREFIX = "e";

  private static String Email_at = "@";

  private String employeeId;
  private String firstName;
  private String lastName;

  /**
   * @param employeeId employee id
   * @param firstName  first name
   * @param lastName   last name
   */
  public Lab6Ex2(String employeeId, String firstName, String lastName) {
    // this is a constructor (Always write this)
    this.employeeId = employeeId;
    this.firstName = firstName;
    this.lastName = lastName;

  }

  /**
   * @return the employee id
   */
  public String getEmployeeId() {
    return employeeId;
  }

  /**
   * @param employeeId the employee id to set
   */
  public void setEmployeeId(String employeeId) {
    // Set the param by using this.(asd=whatever) the Id that we pass in
    this.employeeId = employeeId;
  }

  /**
   * @return the first name
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * @param firstName the first name to set
   */
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * @return the last name
   */
  public String getLastName() {
    return lastName;
  }

  /**
   * @param lastName the last name to set
   */
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * @return the email address (return the address with the formate e
   *         123343@duugle.com)
   */
  public String getemail() {
    String emailw = EMAIL_PREFIX + employeeId + Email_at + EMAIL_DOMAIN;
    return emailw;
  }

  /**
   * @return the description of employee
   */
  @Override
  public String toString() {
    return "Employee \n" + "[EmployeeId = \t" + employeeId + "\n first name = \t" + firstName + "\n" +
        "last name=" + "\t" + lastName + "]";
  }

}
