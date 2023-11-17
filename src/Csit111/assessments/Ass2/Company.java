package Csit111.assessments.Ass2;

public class Company {
  // This is the private strings that can only be used here
  private int bisRegNumber;
  private String bisName;
  private String bisWeb;
  private String bisEmail;
  private String bisPhone;

  public Company(int bisRegNumber, String bisName, String bisWeb, String bisEmail, String bisPhone) {
    // this is a constructor, it constructs things like Bob the builder
    this.bisRegNumber = bisRegNumber;
    this.bisName = bisName;
    this.bisWeb = bisWeb;
    this.bisEmail = bisEmail;
    this.bisPhone = bisPhone;

  }

  public int getbisRegNumber() {
    // returning the rego number
    return bisRegNumber;
  }

  public void setbisRegNumber(int bisRegNumber) {
    // Set the bisness's rego number
    this.bisRegNumber = bisRegNumber;
  }

  public String getbisName() {
    // returning the name
    return bisName;
  }

  public void setbisName(String bisName) {
    // Set the bisness's name
    this.bisName = bisName;
  }

  public String getbisWeb() {
    // Returning the business Website name
    return bisWeb;
  }

  public void setbisWeb(String bisWeb) {
    // Setting the business website name
    this.bisWeb = bisWeb;
  }

  public String getbisEmail() {
    // returning the business email address
    return bisEmail;
  }

  public void setbisEmail(String bisEmail) {
    // setting the business email address
    this.bisEmail = bisEmail;
  }

  public String bisPhone() {
    // Returning the business phone number
    return bisPhone;
  }

  public void setbisPhone(String bisPhone) {
    // setting the business phone number
    this.bisPhone = bisPhone;
  }

  @Override
  public String toString() {
    // setting the business information to a string to display in the class Solution
    return "Business registration number:  \t" + bisRegNumber +
        "\n Business name: \t \t" + bisName + "\n Business Website: \t \t" + bisWeb
        + "\n Business Email: \t \t" + bisEmail
        + "\n Contact number \t \t" + bisPhone;
  }

}
