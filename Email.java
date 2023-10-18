class Email{

  private String firstName;
  private String lastName;
  private String emailAddress;
  private String password;
  private int capacity;
  private int maxAttachmentSize;
  private final String DOMAIN_NAME = "duotech.io";

  public Email(String firstName, String lastName){
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public String getFirstName(){
    return firstName;
  }
  public void setFirstName(String newFirstName){
    this.firstName = newFirstName;
  }
  public String getLastName(){
    return lastName;
  }
  public void setLastName(String newLastName){
    this.lastName = newLastName;
  }
  public String getEmailAddress(){
    return emailAddress;
  }
  public void setEmailAddress(String newEmailAddress){
    this.emailAddress = newEmailAddress;
  }
  public String getPassword(){
    return password;
  }
  public void setPassword(String newPassword){
    this.password = newPassword;
  }
  public int getCapacity(){
    return capacity;
  }
  public void setCapacity(int newCapacity){
    this.capacity = newCapacity;
  }
  public int getMaxAttachmentSize(){
    return maxAttachmentSize;
  }
  public void setMaxAttachmentSize(int newMaxAttachmentSize){
    this.maxAttachmentSize = newMaxAttachmentSize;
  }
  public String getDomainName(){
    return DOMAIN_NAME;
  }
  public String generateEmail(){
    return "";
  }
  public String generatePassword(){
    return "";
  }
  public String toString(){
    return "\nName: " + firstName + " " + lastName + "\nGENERATED EMAIL ADDRESS: " + emailAddress + "\nGENERATED PASSWORD: " + password + "\nCAPACITY: " + capacity + "\nMAX ATTACHMENT SIZE: " + maxAttachmentSize;
  }

}