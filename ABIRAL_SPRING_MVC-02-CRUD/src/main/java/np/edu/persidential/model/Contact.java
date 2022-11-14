package np.edu.persidential.model;

public class Contact {

  private int id;

  private String firstName;

  private String lastName;

  private String address;

  private Long phoneNumber;

  private String employeePosition;

  private String email;





  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getAddress() {return address;}

  public void setAddress(String address) {
    this.address = address;
  }

  public Long getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(Long phoneNumber) {this.phoneNumber = phoneNumber;}

  public String getEmployeePosition() {
    return employeePosition;
  }

  public void setEmployeePosition(String employeePosition) {this.employeePosition = employeePosition;}

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {this.email = email;}
}
