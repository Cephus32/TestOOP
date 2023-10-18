class StaffEmail extends Email{

  private int departmentId;
  private String[] department = new String[]{"N/A", "Accounting", "Sales", "Marketing", "Instructors"};

  public StaffEmail(String newFirstName, String newLastName, int newDepartmentId){
    super(newFirstName, newLastName);
    this.departmentId = newDepartmentId;
    setEmailAddress(generateEmail());
    setPassword(generatePassword());
    setCapacity(50);
    setMaxAttachmentSize(100);
  }
  @Override
  public String generateEmail(){
    return getFirstName() + "." + getLastName() + "_d" + Integer.toString(departmentId) + "@" + department[departmentId] + "." + super.getDomainName();
  }
  @Override
  public String generatePassword(){
    String passChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()";
    String newGenPassword = "";
    for(int i = 0; i < 8;i++){
      newGenPassword += passChars.charAt((int)(Math.random()*72));
    }
    return newGenPassword;
  }
  @Override
  public String toString(){
    return "\nTYPE: Staff"+ "\nDEPARTMENT: " + department[departmentId].toString() + super.toString();
  }
  
}